(defproject jboss-as-management "0.2.0-SNAPSHOT"
  :description "A thin wrapper around the JBoss AS7 management API."
  :url "https://github.com/immutant/jboss-as-management"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :exclusions [org.clojure/clojure]
  :dependencies [[org.clojure/data.json "0.2.0"]
                 [clj-http-lite         "0.2.0"]]
  :lein-release {:deploy-via :clojars})
