(ns musicxml.scratch)


(require '[alda.lisp :refer :all])

(require '[alda.now  :as    now])


(now/play!
 (part "piano"
       (note (pitch :c) (duration (note-length 8)))
       (note (pitch :d))
       (note (pitch :e :flat))
       (note (pitch :f))
       (note (pitch :g))
       (note (pitch :a :flat))
       (note (pitch :b))
       (octave :up)
       (note (pitch :c))))


;; soundfont
(require '[midi.soundfont :refer (load-all-instruments! midi-test load-patch)]
         '[midi.soundfont.fluid-r3 :as fluid-r3])

(import '(javax.sound.midi MidiSystem))

(def synth (MidiSystem/getSynthesizer))
(load-all-instruments! synth fluid-r3/sf2)

(midi-test synth) ; you should hear a nice-sounding piano

(load-patch synth 30)
(midi-test synth) ; you should hear a gnarly distorted guitar!
