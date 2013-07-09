(ns ring-basic-auth-test.test.authorize
  (:use clojure.test
        ring.mock.request
        ring-basic-auth-test.authorize))

(defn authorize*
  [request]
  ((authorize "username" "password") request))

(deftest test-authorize
  (testing "authorize produces header"
    (is (= "authorization" (first (first (:headers
                                           (authorize* (request :get "/")))))))))
