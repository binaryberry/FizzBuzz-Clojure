(ns fizzbuzz.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn is-divisible-by? [divisor, number] (zero? (mod number divisor)))
(defn fizzbuzz? [number] (cond
	(is-divisible-by? 15 number) "FizzBuzz"
	(is-divisible-by? 3 number) "Fizz"
	(is-divisible-by? 5 number) "Buzz"
	:else number
	))
