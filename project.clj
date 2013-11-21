(defproject jboss-as-management "0.3.1"
  :description "A thin wrapper around the JBoss AS7 management API."
  :url "https://github.com/immutant/jboss-as-management"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :exclusions [org.clojure/clojure]
  :dependencies [[org.clojure/data.json "0.2.1"]
                 [clj-http-lite         "0.2.0"]]
  :signing {:gpg-key "BFC757F9"}
  :lein-release {:deploy-via :clojars}
  :profiles {:dev
             {:dependencies [[org.clojure/clojure "1.5.1"]]}})
