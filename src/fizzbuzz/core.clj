(ns fizzbuzz.core)

(defn fizz-buzz [x]
  (cond
    (zero? (mod x 15)) "FizzBuzz"
    (zero? (mod x 3)) "Fizz"
    (zero? (mod x 5)) "Buzz"
    :else (str x)))

(defn fizz-buzz-seq [from to]
  (map fizz-buzz (range from (inc to))))


