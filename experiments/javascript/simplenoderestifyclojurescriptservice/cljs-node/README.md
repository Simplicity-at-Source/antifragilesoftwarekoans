Node.js With ClojureScript Tutorial

1. Run `npm install` from project root directory
1. Grab Leiningen 2.x from [github](https://github.com/technomancy/leiningen)
1. From command line, run lein. This will download leiningen jar to .lein/self-installs.
1. Go to .lein and create a profiles.clj file with the following content:
    {:user {:plugins [[lein-cljsbuild "0.2.10"]]}}
1. Run `lein cljsbuild auto` to monitor changes to `src/cljs_node/core.cljs`

The output will be `main.js`. You can run this with node. E.g. `node main.js`
