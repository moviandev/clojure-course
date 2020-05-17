(ns estoque.aula02)

(defn imprime-mensagem []
  (println "---------------------------")
  (println "Bem vindo(a) ao estoque!"))

(imprime-mensagem)

(defn valor-descontado
  "Retorna o valor descontado que é 90% do valor bruto"
  [valor-bruto]
  (* valor-bruto 0.9))

(valor-descontado 100)

(defn valor-descontado
  "Retorna valor com desconto de 10%"
  [valor-bruto]
  (* valor-bruto (- 1 0.1)))

(valor-descontado 100)

(defn valor-descontado
  "Retorna valor com desconto de 10%"
  [valor-bruto]
  (def desconto 0.1)
  (* valor-bruto (- 1 desconto)))

(valor-descontado 100)

(defn valor-descontado
  "Retorna valor com desconto de 10%"
  [valor-bruto]
  (let [desconto 0.1]
    (* valor-bruto (- 1 desconto))))

(valor-descontado 100)

; N é um bigint
; M é um bigdecimal



(defn valor-descontado
  "Retorna valor com desconto de 10%"
  [valor-bruto]
  (let [taxa-de-desconto (/ 10 100)
        desconto (* valor-bruto taxa-de-desconto)]
    (println  "calculando desconto de", desconto)
    (- valor-bruto desconto)))

(valor-descontado 100)


(defn valor-descontado
  "Retorna valor com desconto de 10% se o valor bruto for estritamente maiorque 100"
  [valor-bruto]
  (if (> valor-bruto 100)
    (let [taxa-de-desconto (/ 10 100)
          desconto (* valor-bruto taxa-de-desconto)]
      (println  "calculando desconto de", desconto)
      (- valor-bruto desconto))
    valor-bruto))

(println (valor-descontado 1000))
(println (valor-descontado 100))

(if (> 500 100)
  (println "maior")
  (println "menor ou igual"))

(if (> 50 100)
  (println "maior")
  (println "menor ou igual"))

