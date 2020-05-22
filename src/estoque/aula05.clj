(ns estoque.aula05)

(def estoque { "Mochila" 10, "Camiseta" 5 })

(println estoque)

(println "Temos" (count estoque) "elementos")
(println "Chaves são" (keys estoque))
(println "Valores são" (vals estoque))

; keyword
; :mochila

(def estoque {:mochila 10
              :camiseta 5})

(println "association" (assoc estoque :cadeira 3))
(println "imutavel" estoque)

(println "update" (update estoque :mochila inc))

(defn tira-1
  [valor]
  (println "tirando 1 de" valor)
  (- valor 1))

(println (update estoque :mochila tira-1))

; usando o dissoc
(println "dissociation" (dissoc estoque :mochila))

(def pedido { :mochila { :quantidade 2, :preco 50 }
              :camiseta { :quantidade 3, :preco 40 }})

(println "\n\n\n\n\n\n\n\n")
(println "PEDIDO >>>" pedido)

; redefinindo o pedido (mapas)
(def pedido (assoc pedido :chaveiro { :quantidade 1, :preco 10 }))

(println "novo pedido >>>" pedido)
(println "usando da mesma forma que coleções" (pedido :mochila)) ; se for nil retornara um no pointer excepetion
(println "usando get de coleções" (get pedido :mochila))
(println "usando get com padrão vazio" (get pedido :cadeira {}))
(println "a keyword implementa a Ifn, então podemos inverter chave mapa" (:mochila pedido))
(println "chamando uma chave que não existe ;retorno null|nil" (:cadeira pedido))
(println "settando um padrão para caso  o retoorno for nil ou null" (:cadeira pedido {}))

(println "pegando a quantidade de mochilas no pedido" (:quantidade (:mochila pedido)))

(println "usando o update-in"
         (update-in pedido [:mochila :quantidade] inc))
; Threading first
(println "Threading" (-> pedido
                         :mochila
                         :quantidade))

; encadeando o println
(-> pedido
    :mochila
    :quantidade
    println)