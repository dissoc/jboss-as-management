(defproject jboss-as-management "0.3.0-SNAPSHOT"
  :description "A thin wrapper around the JBoss AS7 management API."
  :url "https://github.com/immutant/jboss-as-management"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/data.json "0.2.1"]
                 [clj-http-lite         "0.2.0"]]
  :lein-release {:deploy-via :clojars})
