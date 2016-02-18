(ns twitter-digest.tweet-example)

(comment
  {:in_reply_to_screen_name nil,
   :coordinates nil,
   :filter_level "low",
   :in_reply_to_status_id_str nil,
   :place nil,
   :timestamp_ms "1423613076746",
   :possibly_sensitive false,
   :geo nil,
   :in_reply_to_status_id nil,
   :entities {:hashtags [],
              :trends [],
              :urls [],
              :user_mentions [{:screen_name "CRamirez013",
                               :name "Cesar R",
                               :id 1601603378,
                               :id_str "1601603378",
                               :indices [3 15]}],
              :symbols [],
              :media [{:sizes {:medium {:w 240, :h 135, :resize "fit"},
                               :large {:w 240, :h 135, :resize "fit"},
                               :small {:w 240, :h 135, :resize "fit"},
                               :thumb {:w 150, :h 135, :resize "crop"}},
                       :media_url_https "https://pbs.twimg.com/media/B9hZjsQIYAA90LD.jpg",
                       :type "photo",
                       :media_url "http://pbs.twimg.com/media/B9hZjsQIYAA90LD.jpg",
                       :id 565300222944108544,
                       :source_status_id_str "565300227398451200",
                       :expanded_url "http://twitter.com/CRamirez013/status/565300227398451200/photo/1",
                       :url "http://t.co/zHz8VCAGyT",
                       :display_url "pic.twitter.com/zHz8VCAGyT",
                       :source_status_id 565300227398451200,
                       :indices [65 87],
                       :id_str "565300222944108544"}]},
   :retweeted_status {:in_reply_to_screen_name nil,
                      :coordinates {:type "Point", :coordinates [-60.700805 -32.879553]},
                      :filter_level "low",
                      :in_reply_to_status_id_str nil,
                      :place {:name "Rosario",
                              :place_type "city",
                              :country_code "AR",
                              :id "0079bbc151fa56d2",
                              :url "https://api.twitter.com/1.1/geo/id/0079bbc151fa56d2.json",
                              :bounding_box {:type "Polygon",
                                             :coordinates [[[-60.781306 -33.033993]
                                                            [-60.781306 -32.8692378]
                                                            [-60.6135057 -32.8692378]
                                                            [-60.6135057 -33.033993]]]},
                              :full_name "Rosario, Argentina",
                              :attributes {},
                              :country "Argentina"},
                      :possibly_sensitive false,
                      :geo {:type "Point", :coordinates [-32.879553 -60.700805]},
                      :in_reply_to_status_id nil,
                      :entities {:hashtags [],
                                 :trends [],
                                 :urls [],
                                 :user_mentions [],
                                 :symbols [],
                                 :media [{:sizes
                                          {:medium {:w 240, :h 135, :resize "fit"},
                                           :large {:w 240, :h 135, :resize "fit"},
                                           :small {:w 240, :h 135, :resize "fit"},
                                           :thumb {:w 150, :h 135, :resize "crop"}},
                                          :media_url_https "https://pbs.twimg.com/media/B9hZjsQIYAA90LD.jpg",
                                          :type "photo",
                                          :media_url "http://pbs.twimg.com/media/B9hZjsQIYAA90LD.jpg",
                                          :id 565300222944108544,
                                          :expanded_url "http://twitter.com/CRamirez013/status/565300227398451200/photo/1",
                                          :url "http://t.co/zHz8VCAGyT",
                                          :display_url "pic.twitter.com/zHz8VCAGyT",
                                          :indices [48 70],
                                          :id_str "565300222944108544"}]},
                      :source "<a href=\"http://twitter.com/download/android\" rel=\"nofollow\">Twitter for Android</a>",
                      :lang "es",
                      :in_reply_to_user_id_str nil,
                      :id 565300227398451200,
                      :contributors nil,
                      :extended_entities {:media
                                          [{:sizes {:medium {:w 240, :h 135, :resize "fit"},
                                                    :large {:w 240, :h 135, :resize "fit"},
                                                    :small {:w 240, :h 135, :resize "fit"},
                                                    :thumb {:w 150, :h 135, :resize "crop"}},
                                            :media_url_https "https://pbs.twimg.com/media/B9hZjsQIYAA90LD.jpg",
                                            :type "photo",
                                            :media_url "http://pbs.twimg.com/media/B9hZjsQIYAA90LD.jpg",
                                            :id 565300222944108544,
                                            :expanded_url "http://twitter.com/CRamirez013/status/565300227398451200/photo/1",
                                            :url "http://t.co/zHz8VCAGyT",
                                            :display_url "pic.twitter.com/zHz8VCAGyT",
                                            :indices [48 70],
                                            :id_str "565300222944108544"}]},
                      :truncated false,
                      :retweeted false,
                      :in_reply_to_user_id nil,
                      :id_str "565300227398451200",
                      :favorited false,
                      :user {:description "30 años soltero muy creyente amo a mis amig@s y a. patricia Perez.",
                             :profile_link_color "0084B4",
                             :profile_sidebar_border_color "C0DEED",
                             :profile_image_url "http://pbs.twimg.com/profile_images/563791272633434112/r-_8Qnx5_normal.jpeg",
                             :profile_use_background_image true,
                             :default_profile true,
                             :profile_background_image_url "http://abs.twimg.com/images/themes/theme1/bg.png",
                             :is_translator false,
                             :profile_text_color "333333",
                             :profile_banner_url "https://pbs.twimg.com/profile_banners/1601603378/1423253285",
                             :name "Cesar R",
                             :profile_background_image_url_https "https://abs.twimg.com/images/themes/theme1/bg.png",
                             :favourites_count 5032,
                             :screen_name "CRamirez013",
                             :listed_count 2,
                             :profile_image_url_https "https://pbs.twimg.com/profile_images/563791272633434112/r-_8Qnx5_normal.jpeg",
                             :statuses_count 15217,
                             :contributors_enabled false,
                             :following nil,
                             :lang "es",
                             :utc_offset nil,
                             :notifications nil,
                             :default_profile_image false,
                             :profile_background_color "C0DEED",
                             :id 1601603378,
                             :follow_request_sent nil,
                             :url nil,
                             :time_zone nil,
                             :profile_sidebar_fill_color "DDEEF6",
                             :protected false,
                             :profile_background_tile false,
                             :id_str "1601603378",
                             :geo_enabled true,
                             :location "",
                             :followers_count 873,
                             :friends_count 877,
                             :verified false,
                             :created_at "Wed Jul 17 18:50:56 +0000 2013"},
                      :retweet_count 1,
                      :favorite_count 0,
                      :created_at "Wed Feb 11 00:04:11 +0000 2015",
                      :text "Lo que pasa que Lanata lleva la plata a Uruguay http://t.co/zHz8VCAGyT"},
   :source "<a href=\"http://twitter.com\" rel=\"nofollow\">Twitter Web Client</a>",
   :lang "es",
   :in_reply_to_user_id_str nil,
   :id 565300332704858112,
   :contributors nil,
   :extended_entities {:media [{:sizes {:medium {:w 240, :h 135, :resize "fit"},
                                        :large {:w 240, :h 135, :resize "fit"},
                                        :small {:w 240, :h 135, :resize "fit"},
                                        :thumb {:w 150, :h 135, :resize "crop"}},
                                :media_url_https "https://pbs.twimg.com/media/B9hZjsQIYAA90LD.jpg",
                                :type "photo",
                                :media_url "http://pbs.twimg.com/media/B9hZjsQIYAA90LD.jpg",
                                :id 565300222944108544,
                                :source_status_id_str "565300227398451200",
                                :expanded_url "http://twitter.com/CRamirez013/status/565300227398451200/photo/1",
                                :url "http://t.co/zHz8VCAGyT",
                                :display_url "pic.twitter.com/zHz8VCAGyT",
                                :source_status_id 565300227398451200,
                                :indices [65 87],
                                :id_str "565300222944108544"}]},
   :truncated false,
   :retweeted false,
   :in_reply_to_user_id nil,
   :id_str "565300332704858112",
   :favorited false,
   :user {:description nil,
          :profile_link_color "0084B4",
          :profile_sidebar_border_color "C0DEED",
          :profile_image_url "http://pbs.twimg.com/profile_images/517495096548139008/TCBzlZNi_normal.png",
          :profile_use_background_image true,
          :default_profile true,
          :profile_background_image_url "http://abs.twimg.com/images/themes/theme1/bg.png",
          :is_translator false,
          :profile_text_color "333333",
          :profile_banner_url "https://pbs.twimg.com/profile_banners/2472768277/1412466701",
          :name "Maria Eva Saraceno",
          :profile_background_image_url_https "https://abs.twimg.com/images/themes/theme1/bg.png",
          :favourites_count 2193,
          :screen_name "MariaEvaSaracen",
          :listed_count 1,
          :profile_image_url_https "https://pbs.twimg.com/profile_images/517495096548139008/TCBzlZNi_normal.png",
          :statuses_count 13471,
          :contributors_enabled false,
          :following nil,
          :lang "es",
          :utc_offset nil,
          :notifications nil,
          :default_profile_image false,
          :profile_background_color "C0DEED",
          :id 2472768277,
          :follow_request_sent nil,
          :url nil,
          :time_zone nil,
          :profile_sidebar_fill_color "DDEEF6",
          :protected false,
          :profile_background_tile false,
          :id_str "2472768277",
          :geo_enabled true,
          :location "",
          :followers_count 639,
          :friends_count 861,
          :verified false,
          :created_at "Thu May 01 16:42:54 +0000 2014"},
   :retweet_count 0,
   :favorite_count 0,
   :created_at "Wed Feb 11 00:04:36 +0000 2015",
   :text "RT @CRamirez013: Lo que pasa que Lanata lleva la plata a Uruguay http://t.co/zHz8VCAGyT"})
