(ns estoque.aula06)

(def pedido { :mochila { :quantidade 2, :preco 50 }
             :camiseta { :quantidade 3, :preco 40 }})

(defn imprime-e-15
  [valor]
  (println "valor" (class valor) valor)
  15)

(println (map imprime-e-15 pedido))

;(defn imprime-e-15
;  [chave valor]
;  (println chave "e" valor)
;  15)
;
;(println (map imprime-e-15 pedido))

(defn imprime-e-valor
  [[chave valor]]
  (println chave "<e>" valor)
  valor)

(println (map imprime-e-valor pedido))
