(ns estoque.aula03)

(defn valor-descontado
  "Retorna valor com desconto de 10% se o valor bruto for estritamente maiorque 100"
  [valor-bruto]
  (if (> valor-bruto 100)
    (let [taxa-de-desconto (/ 10 100)
          desconto (* valor-bruto taxa-de-desconto)]
      (println "calculando desconto de", desconto)
      (- valor-bruto desconto))
    valor-bruto))

(println (valor-descontado 1000))
(println (valor-descontado 100))

; Predicate Predicatos
(defn aplicar-desconto?
  [valor-bruto]
  (if (> valor-bruto 100)
    true
    false))

(println (aplicar-desconto? 1000))
(println (aplicar-desconto? 100))

(defn valor-descontado
  "Retorna valor com desconto de 10% se o valor bruto for estritamente maiorque 100"
  [valor-bruto]
  (if (aplicar-desconto? valor-bruto)
    (let [taxa-de-desconto (/ 10 100)
          desconto (* valor-bruto taxa-de-desconto)]
      (println "calculando desconto de", desconto)
      (- valor-bruto desconto))
    valor-bruto))

(println (valor-descontado 1000))
(println (valor-descontado 100))

(defn aplicar-desconto?
  [valor-bruto]
  (println "chama a versão redefinida")
  (if (> valor-bruto 100)
    true
    false))

(println (aplicar-desconto? 1000))
(println (aplicar-desconto? 100))
(println (aplicar-desconto? 1000))
(println (aplicar-desconto? 100))

(defn aplicar-desconto?
  [valor-bruto]
  (println "Verão when")
  (when (> valor-bruto 100)
    true))

(println (aplicar-desconto? 1000))
(println (aplicar-desconto? 100))
(println (valor-descontado 1000))
(println (valor-descontado 100))

(defn aplicar-desconto?
  [valor-bruto]
  (println "Verão direta >")
  (> valor-bruto 100))

(println (aplicar-desconto? 1000))
(println (aplicar-desconto? 100))
(println (valor-descontado 1000))
(println (valor-descontado 100))


(defn mais-caro-que-100?
  [valor-bruto]
  (println "deixando claro invocação de mais-caro-que-100?")
  (> valor-bruto 100))

(defn valor-descontado
  "Retorna valor com desconto de 10% se deve aplicar desconto"
  [aplica? valor-bruto]
  (if (aplica? valor-bruto)
    (let [taxa-de-desconto (/ 10 100)
          desconto (* valor-bruto taxa-de-desconto)]
      (println "calculando desconto de", desconto)
      (- valor-bruto desconto))
    valor-bruto))

(println "função como parâmetro")
(println (valor-descontado mais-caro-que-100? 1000))
(println (valor-descontado mais-caro-que-100? 100))

; HIGHER ORDER FUNCTIONS
; IMUTABILIDADE

(println "\n função sem nome")
(println (valor-descontado (fn [valor-bruto] (> valor-bruto 100)) 1000))
(println (valor-descontado (fn [valor-bruto] (> valor-bruto 100)) 100))
(println (valor-descontado (fn [v] (> v 100)) 1000))
(println (valor-descontado (fn [v] (> v 100)) 100))
(println "Funções com #")
; geralmente são chamadas de lambda
(println (valor-descontado #(> %1 100) 1000))
(println (valor-descontado #(> %1 100) 100))






