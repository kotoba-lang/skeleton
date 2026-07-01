(ns skeleton-test
  (:require [clojure.test :refer [deftest is testing]]
            [skeleton]))
(deftest namespace-loads
  (testing "the restored CLJC namespace loads"
    (is (some? skeleton))))
