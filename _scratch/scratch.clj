(ns musicxml.scratch
  (:require [alda.lisp :refer :all]
            [alda.now  :refer :all]))


(def my-score (new-score))

(with-score my-score
   (play!
    (part "piano"
          (note (pitch :c))
          (note (pitch :d))
          (note (pitch :e :flat))
          (note (pitch :f))
          (note (pitch :g))
          (note (pitch :a :flat))
          (note (pitch :b))
          (octave :up)
          (note (pitch :c)))))


(Thread/sleep 2000)

(with-score my-score
  (play!
   (note (pitch :c))))

(with-new-score
  (println "Playing C4")
  (play!
   (part "piano"
         (note (pitch :c))
         (octave :up)))

  (Thread/sleep 2000)

  (println "Playing C5")
  (play!
   (note (pitch :c))))

(new-score
(play!
 (part "piano"
       (note (pitch :c))
       (note (pitch :d))
       (note (pitch :e :flat))
       (note (pitch :f))
       (note (pitch :g))
       (note (pitch :a :flat))
       (note (pitch :b))
       (octave :up)
       (note (pitch :c)))))


(with-new-score
  (play!
   (part "piano"
         (note (pitch :c))

         (do (volume 50) (octave 6))

         (chord (note (pitch :c))
                (note (pitch :e))
                (note (pitch :g)))

         (for [letter [:c :d :e :f :g]]
           (note (pitch letter)
                 (duration (note-length 8))))

         )))
