# Iterator (Iterador)

Permite criar objetos capazes de iterar sob estruturas de dados sem conhecer os detalhes desta 
estrutura.

# Analogia com o mundo real 

Imagine que você chegou a uma loja para comprar um tênis. Você escolhe o calçado, mas, não tem no seu
tamanho na vitrine. Você pede para o vendedor olhar no estoque para que ele possa 
achar um par do seu tamanho, mas você também tem uma segunda opção que seria entrar no site da loja e
verificar na aba do produto se está disponível o seu número e comprar por lá.

# Resultado

Tanto o vendedor quanto o site servem como iteradores capazes de percorrer uma coleção que é o estoque 
formado por objetos tênis, os iteradores sabem exatamente como encontrar o objeto que você precisa
ao percorrerem a coleção, você não precisa conhecer qual a estrutura da coleção, tão pouco
como ela é armazenada ou os seus detalhes de busca.

# Quando utilizar 

Utilize quando precisar iterar sobre uma coleção complexa, pois assim você evita repetir código e
protege a coleção já que ela é abstraída e o código cliente não sabe a sua estrutura.

