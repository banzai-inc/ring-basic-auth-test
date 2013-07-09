(ns ring-basic-auth-test.authorize
  (:require [clojure.data.codec.base64 :as base64]))

(defn- byte-transform
  [direction-fn string]
  (reduce str (map char (direction-fn (.getBytes string)))))

(defn- encode-base64
  [^String string]
  (byte-transform base64/encode string))

(defn authorize
  [username password]
  (fn [request]
    (header request "authorization"
            (str "Basic "
                 (encode-base64 (str username ":" password))))))
