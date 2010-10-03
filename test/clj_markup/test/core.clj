(ns clj-markup.test.core
  (:use [clj-markup.core] :reload)
  (:use [clojure.test]))

(deftest textile-to-html-fragment-test
  (is (= "<p>m/s <sup>2</sup></p>"
     (textile-to-html-fragment "m/s ^2^"))
     "Testing Superscript")
  (is (= "<p>V <sub>o</sub></p>"
      (textile-to-html-fragment "V ~o~"))
      "Testing subscrpit"))