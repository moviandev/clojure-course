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

(defn preco-dos-produto
  [[chave valor]]
  (println "Chave" chave "Multiplicando quantidade" (:quantidade valor) "por preco" (:preco valor) )
  (* (:quantidade valor) (:preco valor)))

(println (map preco-dos-produto pedido))

; Thread last
(defn total-do-pedido
  [pedido]
  (->> pedido
      (map preco-dos-produto)
      (reduce +)))

(println (total-do-pedido pedido))

(defn preco-total-do-produto
  [produto]
  (* (:quantidade produto) (:preco produto)))


(defn total-do-pedido
  [pedido]
  (->> pedido
       vals
       (map preco-total-do-produto)
       (reduce +)))

(println (total-do-pedido pedido))

(def pedido { :mochila { :quantidade 2, :preco 50 }
             :camiseta { :quantidade 3, :preco 40 }
             :chaveiro { :quantidade 1 }})

(defn gratuito?
  [[_ item]]
  (<= (get item :preco 0) 0))

(println "filtrando gratuitos" (filter gratuito? pedido))

(defn gratuito?
  [item]
  (<= (get item :preco 0) 0))

(println "filtrando gratuitos" (filter (fn [[_ item]] (gratuito? item)) pedido))
(println "filtrando gratuitos cm lambda" (filter #(gratuito? (second %)) pedido))

(defn pago?
  [item]
  (not (gratuito? item)))

(println (pago? { :preco 50 }))
(println (pago? { :preco 0 }))

(println ((comp not gratuito?) { :preco 50 }))
(println ((comp not gratuito?) { :preco 0 }))

(def pago? (comp not gratuito?))
(println (pago? { :preco 50 }))
(println (pago? { :preco 0 }))
