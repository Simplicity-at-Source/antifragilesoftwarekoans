(ns quickstart.groups.quickstart
    "Node defintions for quickstart"
    (:require
     [pallet.api :refer [group-spec server-spec node-spec plan-fn]]
     [pallet.crate.automated-admin-user :refer [automated-admin-user]]))

(def default-node-spec
  (node-spec
   :image {:os-family :ubuntu}
   :hardware {:min-cores 1}))

(def
  ^{:doc "Defines the type of node quickstart will run on"}
  base-server
  (server-spec
   :phases
   {:bootstrap (plan-fn (automated-admin-user))}))

(def
  ^{:doc "Define a server spec for quickstart"}
  quickstart-server
  (server-spec
   :phases
   {:configure (plan-fn
                 ;; Add your crate class here
                 )}))

(def
  ^{:doc "Defines a group spec that can be passed to converge or lift."}
  quickstart
  (group-spec
   "quickstart"
   :extends [base-server quickstart-server]
   :node-spec default-node-spec))
