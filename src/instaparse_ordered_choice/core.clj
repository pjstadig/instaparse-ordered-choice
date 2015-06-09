(ns instaparse-ordered-choice.core
  (:require
   [clojure.java.io :as io]
   [instaparse.core :as insta]))

(def parser1
  (insta/parser (io/resource "ordered-choice-bug1.peg")))

(def parser2
  (insta/parser (io/resource "ordered-choice-bug2.peg")))
