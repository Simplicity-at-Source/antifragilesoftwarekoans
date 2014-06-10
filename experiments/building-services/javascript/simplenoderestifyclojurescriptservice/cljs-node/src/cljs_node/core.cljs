(ns cljs-node.core
  (:require [cljs.nodejs :as node]))

(def restify (node/require "restify"))

(defn log [& args]
  (.log js/console (apply format args)))

(defn respond [req res next]
  (.send res (str "hello " req/params/name)))

(def server (.createServer restify))

(do
  (.get server "/hello/:name" respond)
  (.head server "/hello/:name" respond))

(defn -main [& args]
  (.listen server 9200 #(log "%s listening at %s" (.-name server) (.-url server))))

(set! *main-cli-fn* -main)
