(ns estoque.aula04)

(def precos [30 700 1000])

(println (precos 0))

; Pegando espaços nos vetores com get [get evita exceptions]
(println (get precos 0))
(println "valor padrão nil" (get precos 17))
(println "valor padrão 0" (get precos 17 0))
(println "valor padrão 0, mas existe" (get precos 2 0))

; "conj adiciona um valor no nosso vetor, mas ele não altera o veto original"
(println (conj precos 5))

(println precos)

; retorna uma exception (println (conj 5 precos))

; Usando o inc e update ele adiciona um
; não altera vetor original
(println (update precos 0 inc))

(defn soma-1
  [valor]
  (println "estou somando 1 em", valor)
  (+ valor 1))

(println (update precos 0 soma-1))

; CÓDIGO DA AULA ANTERIOR
(println "\n CÓDIGO DA AULA ANTERIOR \n")
(defn aplicar-desconto?
  [valor-bruto]
  (println "Verão direta >")
  (> valor-bruto 100))

(defn valor-descontado
  "Retorna valor com desconto de 10% se o valor bruto for estritamente maiorque 100"
  [valor-bruto]
  (if (aplicar-desconto? valor-bruto)
    (let [taxa-de-desconto (/ 10 100)
          desconto (* valor-bruto taxa-de-desconto)]
      (println "calculando desconto de", desconto)
      (- valor-bruto desconto))
    valor-bruto))

(println precos)

; Função map e filter
(println "map" (map valor-descontado precos))

(println "range" (range 10))
(println "filter" (filter even? (range 10)))

(println "fiter aplica desconto" (filter aplicar-desconto? precos))

(println "map após o filter" (map valor-descontado (filter aplicar-desconto? precos)))

; usando reduce

(println precos)
(println (reduce + precos))

(defn minha-soma
  [valor-1 valor-2]
  (println "somando" valor-1 valor-2)
  (+ valor-1 valor-2))

(println (reduce minha-soma precos))
(println (reduce minha-soma (range 10)))
(println (reduce minha-soma [15]))

(println (reduce minha-soma 0 precos))
(println (reduce minha-soma 0 (range 10)))
(println (reduce minha-soma 0 [15]))