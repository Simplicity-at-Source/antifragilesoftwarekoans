;;; Pallet project configuration file

(require
 '[quickstart.groups.quickstart :refer [quickstart]])

(defproject quickstart
  :provider {:jclouds
             {:node-spec
              {:image {:os-family :ubuntu :os-version-matches "12.04"
                       :os-64-bit true}}}}

  :groups [quickstart])
