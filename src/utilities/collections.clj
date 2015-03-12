(ns utilities.collections)

(def index [coll i]
  (.getIndex coll i))

(defn merge-splice
  "Given a vector will return a vector containing the subvector specified. [a b c d e f] -> [a b c [d e] f]"
  ([vec i j]
     (if (= vec (subvec vec i j))
       vec
       (let [lhs (into [] (first (split-at i vec)))
             mid (subvec vec i j)
             rhs (into [] (second (split-at j vec)))
             merged (into [] (reduce concat [lhs [mid] rhs]))]
         merged)))
  ([vec i]
     (merge-splice vec i (count vec))))

(defn rest-until [coll pred]
  "Continuously calls rest until the predicate is satisfied on the first of coll."
  (loop [coll coll
         new []]
    (let [e (first coll)]
      (if (pred e)
        new
        (recur (rest coll) (conj new e))))))
