(ns fizzbuzz.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzz.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 1 1))))

(deftest is-divisible-by-three
	(testing "returns 3 for 3"
		(is (= true (is-divisible-by? 3 3)))))

(deftest is-not-divisible-by-three
	(testing "returns false for 1"
		(is (= false (is-divisible-by? 3 1)))))

(deftest is-divisible-by-five
	(testing "returns 5 for 5"
		(is (= true (is-divisible-by? 5 5)))))

(deftest is-not-divisible-by-five
	(testing "returns false for 1"
		(is (= false (is-divisible-by? 5 1)))))

(deftest is-divisible-by-fifteen
	(testing "returns 15 for 15"
		(is (= true (is-divisible-by? 15 15)))))

(deftest is-not-divisible-by-fifteen
	(testing "returns false for 1"
		(is (= false (is-divisible-by? 15 1)))))

(deftest returns-Fizz-for-three
	(testing "returns Fizz for 3"
		(is (= "Fizz" (fizzbuzz? 3)))))

(deftest returns-Fizz-for-five
	(testing "returns Buzz for 5"
		(is (= "Buzz" (fizzbuzz? 5)))))

(deftest returns-Fizz-for-fifteen
	(testing "returns FizzBuzz for 15"
		(is (= "FizzBuzz" (fizzbuzz? 15)))))

(deftest returns-the-number-if-not-divisible-by-three-nor-5
	(testing "returns 124 for 124"
		(is (= 124 (fizzbuzz? 124)))))


