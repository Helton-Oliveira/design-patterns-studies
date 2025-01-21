# Strategy (Estratégia)

Este padrão permite definir uma família de algoritmos e torná-los intercambiáveis entre sí, ou seja, define uma estrutura
que possibilita executar vários algoritmos para chegar a um mesmo resultado, porém de acordo com condições diferentes.

# Analogia com mundo real 

Imagine que você quer fazer um bolo. Voce pode fazer no forno convencional, no forno elétrico ou na air fryer.
Estas são suas estratégias para fazer o bolo, e você pode escolher entre elas considerando fatores como, 
gasto de energia, gasto de gaz, tempo de preparo entre outras.

# Explicação 

As formas de preparo do bolo são suas classes de estratégia, a classe de contexto é o bolo, pois precisamos 
de um método para prepará-lo. O cliente é você, responsável por definir qual estratégia utilizar dependendo das
condições que forem consideradas para o preparo.

# Quando utilizar 

Utilize a padrão estratégia, quando você tem diversas maneiras de fazer uma lógica, mas precisa fornecer um 
único resultado. Quando você precisar utilizar várias variantes de algoritmos num objeto, permitindo a troca
de um algoritmo para o outro em tempo de execução. Quando for necessário separar a classe que contém a
lógica do contexto dos seus algoritmos, permitindo que o contexto não conheça detalhes da sua implementação.
Quando a classe contexto tiver várias condicionais para executar várias variantes de um mesmo algoritmo.