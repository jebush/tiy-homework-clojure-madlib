(ns tiy-homework-clojure-madlib.core)
;  This weekend I went camping with (celebrity) outside of (city). The first night a wild (animal) tore apart our backpacks and ate all the (food-plural). When we woke up, we had to hunt for wild (plants-plural) to eat since our breakfast was missing. We were both just happy that none of our (things-plural) were destroyed. After lunch we hiked up to the (adjective) (thing) waterfalls. They were breathtaking! Seeing them I finally understood what my (relationship) meant when (s)he said, '(quote)

;(defn -main []
  ;"I don't do a whole lot."
  ;[x]
  ;(println x "Hello, World!")

(defn mad-lib []

  ;Animal:
  (def animal "chuprachabra")


  ;Adjective:
  (def adjective "smelly")


  ;Things (plural)
  (def things-plural "guns")


  ;City:
  (def city "Raleigh")


  ;Plants (plural):
  (def plants-plural "Trees")


  ;Quote or Lyric:
  (def quote "I will slap you so hard even google won't be able to find you!")


  ;Thing:
  (def thing "turd")


  ;Celebrity:
  (def celebrity "Alan Jackson")


  ;Relationship (aunt, dad, etc):
  (def relationship "dad")


  ;Food
  (def food-plural "jalepenos")

  ;The below prints out the madlib
  (println "This weekend I went camping with" celebrity "outside of" city ".")
  (println "The first night a wild" animal "tore apart our backpacks and ate all the" food-plural ".")
  (println "When we woke up, we had to hunt for wild" plants-plural "to eat since our breakfast was missing.")
  (println "We were both just happy that none of our" things-plural "were destroyed.")
  (println "After lunch we hiked up to the" adjective thing "waterfalls. They were breathtaking!")
  (println "Seeing them I finally understood what my" relationship "meant when (s)he said, '" quote "'!")

)


 ; )
(mad-lib)