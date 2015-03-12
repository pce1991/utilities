(ns utilities.string-utils
  (:require [clojure.string :refer :all]))

(defn palindrome-string? [string]
  "Will work for a single word or phrase, respecting whitespace."
  (= (seq string) (reverse string)))

(defn palindorme-phrase? [string]
  "Ignoring whitespace, returns true if the seq of characters reversed is the same"
  (let [nowhite (replace string #" " "")]
    (= (seq nowhite) (reverse nowhite))))

(defn semordnilaps [word]
  "Checks to see if the word gives spells another word if written backwards"
  ;; will need a dictionary/wordlist to check
  )


(defn acronymize [string]
  "Takes a string and returns one containing the first letter of each word in it."
  (uppercase (apply str (map #(first (seq %)) (split string #" ")))))

(defn acronym-map [string]
  (zipmap (map str (seq (acronymize string)))
          (split string #" ")))

;;; ====================
;;; LETTERS AND WORDS
;;; ====================

(defn words [string]
  (s/split (s/lower-case string) #" "))

;;; change these four functions to take a string and turn it into words
(defn first-letters [words]
  "Takes a seq of words and returns a seq of the first letters of each word"
  (map str (map first words)))

(defn last-letters [words]
  (map str (map last words)))

(defn first-nth-letters [words n]
  "Returns the first n letters where n is less than the length of the word, and if greater returns the whole word."
  (map #(subs % 0
              (if (> n (count %))
                (count %)
                n)) words))

(defn last-nth-letters [words n]
  (map #(subs % (if (< n (count %))
                  (- (count %) n)
                  0))
       words))
