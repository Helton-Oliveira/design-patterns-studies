# Template Method (Método Template)

Permite criar uma estrutura padrão de um método em uma superclasse e faz com que subclasses possam sobrescrever
etapas específicas deste método sem alterar a sua estrutura.

## Analogia com o mundo real 

Você quer fazer um bolo. Então, procura na internet uma receita padrão que define uma sequência de passos
no modo de preparo. Note que sempre faz o mesmo modo de preparo, mas, varia os sabores conforme 
os ingredientes que quiser escolher.

## Explicação

Imagine que a receita é a superclasse e o seu método padrão é o modo de preparo que define todos os passos
para realizar uma ação. Os ingredientes por sua vez são as subclasses, responsáveis por sobrescrever etapas 
específicas sobre o modo de prepáro, assim cada subclasse pode fornecer ingredientes diferentes, produzindo
vários tipos de sabores para os bolos, porém seguindo um mesmo padrão de preparo.

## Quando utilizar 

Quando quiser deixar que o código cliente sobrescreva apenas etapas específicas do método modelo, quando
perceber que a suas classes estão a realizar uma mesma estrutura de algoritmo várias vezes, e apenas etapas
específicas estiverem sendo alteradas.

