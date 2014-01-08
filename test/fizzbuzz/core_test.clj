(ns fizzbuzz.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzz.core :refer :all]))

(deftest one-should-be-one
  (is (= "1" (fizz-buzz 1))))

(deftest two-should-be-two
  (is (= "2" (fizz-buzz 2))))

(deftest three-should-fizz
  (is (= "Fizz" (fizz-buzz 3))))

(deftest five-should-buzz
  (is (= "Buzz" (fizz-buzz 5))))

(deftest six-should-fizz
  (is (= "Fizz" (fizz-buzz 6))))

(deftest fifteen-should-fizz-buzz
  (is (= "FizzBuzz" (fizz-buzz 15))))

(deftest sequence-fizz-buzz
  (is (= '("1" "2" "Fizz" "4" "Buzz") (fizz-buzz-seq 1 5))))



