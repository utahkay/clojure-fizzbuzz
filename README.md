Fizz Buzz Kata in Clojure
=====================

Up and Running
------------
You are familar with counting/dividing game [Fizz Buzz](http://en.wikipedia.org/wiki/Fizz_buzz).

You have Clojure (Leiningen) [installed](https://github.com/technomancy/leiningen/blob/stable/README.md)

Create new project

```bash
%> lein new fizzbuzz
```

Add our test runner by adding the following to ``project.clj``

```clojure
(defproject banking "0.1.0-SNAPSHOT"
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

