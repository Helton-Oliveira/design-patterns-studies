# Mediator (mediador)

Este padrão visa diminuir dependências entre objetos, declarando um objeto **mediador** entre elas, ele é 
o responsável por receber uma chamada e encaminhar este pedido ao objeto de destino ou até mesmo 
resolvendo na sua própria classe.

# Analogia com mundo real

Imagine que você está no médico com outras duas pessoas. Você é apenas uma consulta de rotina, o segundo, 
uma rápida sutura no ferimento e o terceiro sente algumas dores. Porém, antes de passar com o médicos vocês fazem
a ficha e são chamados na triage, onde um enfermeiro irá perguntar o que foi fazer alí para que ele
possa direcionar vocês aos médicos e setores responsáveis por seus casos.

# Resultado 

Note que nesta analogia, você não precisa saber de todos os pacientes que estão alí tão pouco o porquê 
de estarem alí e nem qual médico vai-te atender, você apenas tem conhecimento que precisa se comunicar
com o objeto **mediador** que no nosso caso é o enfermeiro, e após esta comunicação ele te direcionará
ao médico (algoritmo) correto.

# Quando utilizar 

Quando percebemos que os nossos objetos estão se acoplando numa escala muito grande, o que torna dificíl
o seu reuso e manutenção, quando você quiser promover um maior desacoplamento de objetos e quando 
estiver criando várias subclasses de componentes para apenas reutilizar algum comportamento básico
em vários contextos.

