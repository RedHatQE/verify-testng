(defproject com.redhat.qe/verify-testng "1.0.0"
  :description "Verification library for use with clojure and testng"
  :license {:name "GPL-3.0"
            :url "https://www.gnu.org/licenses/gpl-3.0.html"}
  :dependencies [[com.redhat.qe/jul.test.records "1.0.1"]
                 [org.clojure/clojure "1.3.0"]]
  :deploy-repositories [["releases" :clojars]
                        ["snapshots" :clojars]])