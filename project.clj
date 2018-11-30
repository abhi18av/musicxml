(defproject musicxml "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]


                 ;; Alda libraries
                 [alda/core             "0.3.10"]
                 [alda/sound-engine-clj "1.0.0"]

                 ;; Soundfonts

                 [midi.soundfont "0.1.0"]
                 [org.bitbucket.daveyarwood/fluid-r3 "0.1.1"]

                 ;; Edna
                 ;; NOTE calling edna raises errors
                 ;[edna "1.6.0"]
                 ])
