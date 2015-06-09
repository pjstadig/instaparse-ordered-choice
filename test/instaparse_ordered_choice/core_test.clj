(ns instaparse-ordered-choice.core-test
  (:require [clojure.test :refer :all]
            [instaparse-ordered-choice.core :refer :all]))

(deftest t-ordered-choice1
  (is (= [[:Symbol "f" "o" "o"] [:Symbol "b" "a" "r"]]
         (parser1 "foo bar")))
  (is (= [[:Symbol "f" "o" "o"] [:Symbol "b" "a" "r"]]
         (parser1 "foo,bar")))
  (is (= [[:Symbol "f" "o" "o"] [:Symbol "b" "a" "r"]]
         (parser1 "foo\tbar")))
  (is (= [[:Symbol "f" "o" "o"] [:Symbol "b" "a" "r"]]
         (parser1 "foo\rbar")))
  (is (= [[:Symbol "f" "o" "o"] [:Symbol "b" "a" "r"]]
         (parser1 "foo\nbar"))))

(deftest t-ordered-choice2
  (is (= [[:Symbol "f" "o" "o"] [:Symbol "b" "a" "r"]]
         (parser2 "foo bar")))
  (is (= [[:Symbol "f" "o" "o"] [:Symbol "b" "a" "r"]]
         (parser2 "foo,bar")))
  (is (= [[:Symbol "f" "o" "o"] [:Symbol "b" "a" "r"]]
         (parser2 "foo\tbar")))
  (is (= [[:Symbol "f" "o" "o"] [:Symbol "b" "a" "r"]]
         (parser2 "foo\rbar")))
  (is (= [[:Symbol "f" "o" "o"] [:Symbol "b" "a" "r"]]
         (parser2 "foo\nbar"))))
