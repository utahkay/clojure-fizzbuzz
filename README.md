Fizz Buzz Kata in Clojure
=====================

Up and Running
------------
You are familar with counting/dividing game [Fizz Buzz](http://en.wikipedia.org/wiki/Fizz_buzz).

You have Clojure (Leiningen) [installed](https://github.com/technomancy/leiningen/blob/stable/README.md)

Create a new project

```bash
%> lein new fizzbuzz
%> cd fizzbuzz
```

To run tests add plugin ``lein-test-refresh`` by adding ``:plugins`` to ``project.clj``:

```clojure
(defproject fizzbuzz "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :plugins [[com.jakemccrary/lein-test-refresh "0.1.2"]])
```

Now we run our tests

```bash
%> lein test-refresh
```

Your First Test
---------------

Replace the first dummy test with the following in ``test/fizzbuzz/core_test.clj``

```clojure
(deftest one-should-be-one
  (is (= "1" (fizz-buzz 1))))
```

Make it pass by replacing the dummy code with the following in ``src/fizzbuz/core.clj``

```clojure
(defn fizz-buzz [x]
  (str 1))
```

Second Test
-----------

We could refactor out the subtle duplication between the test and code. Naw, I'll just triangulate.

```clojure
(deftest two-should-be-two
  (is (= "2" (fizz-buzz 2))))
```

And to make it pass one small change

```clojure
(defn fizz-buzz [x]
  (str x))
```

Test 3
------

```clojure
(deftest three-should-fizz
  (is (= "Fizz" (fizz-buzz 3))))
```

Passing

```clojure
(defn fizz-buzz [x]
  (cond
    (zero? (mod x 3)) "Fizz"
    :else (str x)))
```




