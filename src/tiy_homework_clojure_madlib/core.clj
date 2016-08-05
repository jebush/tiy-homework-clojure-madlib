(ns tiy-homework-clojure-madlib.core)
;  This weekend I went camping with (celebrity) outside of (city). The first night a wild (animal) tore apart our backpacks and ate all the (food-plural). When we woke up, we had to hunt for wild (plants-plural) to eat since our breakfast was missing. We were both just happy that none of our (things-plural) were destroyed. After lunch we hiked up to the (adjective) (thing) waterfalls. They were breathtaking! Seeing them I finally understood what my (relationship) meant when (s)he said, '(quote)

(defn mad-lib [animal adjective things-plural city plants-plural quote thing celebrity relationship food-plural]

  
  ;The below prints out the madlib
  (println "This weekend I went camping with" celebrity "outside of" city ".")
  (println "The first night a wild" animal "tore apart our backpacks and ate all the" food-plural ".")
  (println "When we woke up, we had to hunt for wild" plants-plural "to eat since our breakfast was missing.")
  (println "We were both just happy that none of our" things-plural "were destroyed.")
  (println "After lunch we hiked up to the" adjective thing "waterfalls. They were breathtaking!")
  (println "Seeing them I finally understood what my" relationship "meant when (s)he said, '" quote "'!")

)



(mad-lib "chuprachabra" "smelly" "guns" "Raleigh" "Trees" "I will slap you so hard even google won't be able to find you!" "turd" "Alan Jackson" "dad" "jalepenos"
            )