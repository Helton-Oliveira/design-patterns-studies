# Command (Comando)

O padrão command transforma o pedido num objeto independente, que contem todas as informações do pedido, 
permitindo que este pedido possa ser manipulado conforme o objetivo do sistema, como, por exemplo, 
atrasar o pedido, colocar ele numa fila, salvar histórico do pedido e suporte de operações que não podem
ser feitas.

# Analogia com o mundo real 

Imagine que chegou a uma loja de móveis sob-media, um vendedor vem até você e pergunta todos os detalhes
sobre o móvel que precisa e anota-os num papel. O vendedor envia o pedido para o marceneiro responsável 
por preparar o seu móvel, que o coloca na linha de produção. O marceneiro após construir o móvel conforme o seu pedido, deixa-o para envio
no estoque com o pedido. O vendedor acha no estoque, verifica se o móvel está conforme o solicitado
para garantir que é exatamente o que voce queria, e o leva até você.

# Resultado

O pedido no papel serve como um comando. Nele contém todas as informações necessárias para que o marceneiro possa
construir o seu pedido imediatamente, eliminando a necessidade de que o marceneiro tenha que ir até 
você para colher todas as informações do pedido pessoalmente. E a cada comando solicitando um novo
móvel o marceneiro irá checar qual o próximo da lista e executar.

Assim podemos dizer que o pattern command encapsula uma solicitação como objeto, permitindo que você possa
manipular a solicitação com diferentes operações.

# Quando utilizar

Você pode utilizar o padrão command quando precisa parametrizar um pedido, tornar operações reversíveis, 
enfileirar comandos e restaurar comandos. 
