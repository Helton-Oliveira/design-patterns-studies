# Chain Of Responsibility (Cadeia de Responsabilidade)

Este padrão permite que pedidos sejam passados numa corrente de handlers. Ao receber os pedidos o handler
responsável pode optar por processar o pedido ou se passa para o próximo handler na corrente.

# Analogia com o mundo real

Imagine que você está com um problema ao contratar um plano de ‘internet’, você percebe uma lentidão absurda no 
processamento de dados, e como se não fosse o suficiente fica caindo a todo momento, então resolve ligar para
a sua operadora de internet, o primeiro atendente te pede para fazer todo o procedimento de desligar e religar da tomada,
você faz, mas não adianta, então o primeiro atendente passa o seu chamado ao segundo ele verifica o seu plano contratato
para constatar a lentidão então pede novamente para desligar e aguardar para religar, enquanto isso ele esta
configurando algo relacionado a sua rede, quando pensamos que irá funcionar, infelizmente não, mas 
há mais uma possibilidade, o segundo atendente passa para o terceiro, que por fim pede para checar
o fio do aparelho, e você nota que está desgastado e com mal contato, então o terceiro processa o seu 
pedido para solucionar o problema.

# Resultado

O que podemos tirar desta analogia em relação o padrão?

Imagine que destes handlers (atendentes) cada um fosse uma classe e cada uma delas possuem os seus próprios algoritimos
que pode tanto processar o pedido e resolver o problema quanto passar para a próxima classe envolvida na corrente.

# Quando utilizar

Quando temos ou queremos garantir várias etapas para o processamento de um pedido, validações, quando precisamos 
executar diversos handlers numa ordem específica e construir um fluxo que pode ser alterado
dinamicamente no momento de execução.