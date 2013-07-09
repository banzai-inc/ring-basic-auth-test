(defproject ring-basic-auth-test "0.1.0"
  :description "Assists in testing Ring applications using Basic authentication"
  :url "https://github.com/banzai-inc/ring-basic-auth-test"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/data.codec "0.1.0"]]
  :profiles
  {:dev {:dependencies [[ring-mock "0.1.5"]]}})
