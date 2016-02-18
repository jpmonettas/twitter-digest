(ns twitter-digest.core
  (:require [twitter.oauth :refer :all]
            [twitter.callbacks :refer :all]
            [twitter.callbacks.handlers :refer :all]
            [twitter.api.streaming :refer :all]
            [clojure.data.json :as json]
            [clojure.core.async :as async :refer [>!! <!! chan]]
            [clojure.string :as str]) 
  (:import
   (twitter.callbacks.protocols AsyncStreamingCallback)))

(defn- insert-newline
  "inserts missing line breaks after end of json message"
  [s]
  (str/replace s #"\}\{" "}\r\n{"))

(defn- chunk-composer []
  (fn [next-step]
    (let [buff (atom "")]
      (fn
        ([r] (next-step r))
        ([r x]
         (let [json-lines (-> (str @buff x)
                             (insert-newline)
                             (str/split-lines))
               to-process (butlast json-lines)]
           (reset! buff (last json-lines))
           (if to-process (reduce next-step r to-process) r)))))))

(defn process-message
  "Creates composite transducer for processing twitter messages"
  []
  (comp
   (chunk-composer)
   (map json/read-json)
   (map :text)))



(def my-creds (make-oauth-creds "QKWS4n5HI6PzslnQu6u90ZV3M"
                                "iWBu4uE0YDlAj8G55aWTwcqweDlYYoLscJG9psWFK9Scmy5krs"
                                "472956337-THliO4D4i159pg7q0ORelYzcIQKDNgT8W6fCO129"
                                "aPCslYzyt5KiWmyBSmoAndtBuEEYwffjI8kno0uDNf0Gn"))


;;            LAT          LONG
(def uy-box [["-30.254619" "-58.414307"]   ;; upper left
             ["-30.102663" "-53.734131"]   ;; upper rigth
             ["-34.841422" "-58.425293"]   ;; bottom left
             ["-35.021562" "-53.239746"]]) ;; bottom rigth


(defn filter-channel [creds params]
  (let [c (chan 1 (process-message))
        callback (AsyncStreamingCallback.
                  (fn [_resp payload] 
                    (>!! c (str payload)))
                  (fn [_resp] nil)
                  (fn [_resp ex] (.printStackTrace ex)))]
  
   (statuses-filter
    :params params
    :oauth-creds my-creds
    :callbacks callback)

   c))



#_(def c (filter-channel my-creds {:track "java"}))
