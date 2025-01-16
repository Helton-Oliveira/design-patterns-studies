# Observer (Observador)

Permite criar mecanismos de assinatura no objeto observado chamado **sujeito** que permite notificar 
múltiplos outros objetos que chamamos **observers ou observadores** de quaisquer eventos que possam
ocorrer com o objeto sujeito, que estão a observar.

# Analogia com o mundo real

Imagine que você vai a um açougue para comprar a carne do churrasco. Pega uma senha e vai se sentar e fica 
de olho na tela onde aparecem as senhas. Então é chamado um, depois outro e depois outro, assim por diante.
 Até que chega a sua vez, você reconhece o seu número na tela e se encaminha para ser atendido fazendo o seu
pedido. 

# Resultado 

No nosso exemplo real, você é o objeto observador ou **Observer** com as outras pessoas que estão
esperando para serem atendidas, a senha é o mecanismo de subinscrição, pois ao pegá-la estamos 
declarando que queremos ser notificados caso o nosso número apareça. Então temos a tela, o objeto **sujeito**
na qual estamos a observar, pois ao mudar o seu estado interno (que no caso são seus números mostrados), 
é notificado a nós objetos observadores a tomar uma ação.

# Quando utilizar 

Quando a mudança de estado de um objeto precisa alterar outros, quando a sua aplicação precisar que
objetos sejam observados por outros, por exemplo, em caso de falhas. Quando precisar definir um mecanismo
de assinatura, permitindo objetos quererem se inscrever e desinscrever.