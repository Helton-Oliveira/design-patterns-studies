# State (estado)

Padrão de projeto que permite a classe mudar o seu comportamento através da mudança do seu estado interno, 
fazendo com que ela se comporte como se fosse outra classe.

# Analogia com mundo real

Imagine que você esta na sua primeira aula de direção. Então cheio de adrenalina resolve ja pisar no acelerador,
mas nota que não surtiu nenhum efeito e você volta pisar novamente e não acontece nada de novo, o 
instrutor então olha espantado para você e diz "Primeiro gire a chave e ligue o carro". Você liga, 
escuta um barulho e após as instruções do instrutor como, pise no freio, pise na embreagem, coloque a primeira marcha, 
abaixe o freio de mão, solte o freio, solte a embreagem e depois acelere devagar, e assim o carro se move.

# Explicação

Agora imagine que o carro é a nossa classe que possui vários comandos, como andar para frente, dar ré, 
parar, dar seta para direita, dar seta para esquerda, mas, vamos focar apenas em dois métodos andar para frente e
piscar as setas. Quando entramos no carro com ele no *estado desligado* não podemos fazer nada, pois 
o seu estado atual bloqueia todas as outras ações, porém ao ligarmos o carro o seu estado muda de desligado para ligado 
e pronto, agora conseguimos fazer as setas piscarem aí você se pergunta (Ta, mas, quando vamos acelerar?) 
logo após pisarmos no freio e na embreagem colocar a primeira marcha, abaixar o freio de mão, soltar a embreagem e
aí, sim, aceleramos. Com isso sequenciamos uma série de mudanças de estado no carro que permite utilizar 
alguns métodos. Em resumo, alterar o estado interno da classe carro faz com que o seu comportamento 
mude, porém, continua a ser um carro.

# Quando utilizar

Vicê pode utilizar este padrão quando a sua classe precisa trocar o seu comportamento a todo momento,
quando o número de estados é enorme, quando você tiver uma classe com condicionais gigantes que 
alteram o comportamento da classe de acordo com um parameter específico.