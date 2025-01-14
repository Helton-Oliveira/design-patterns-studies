# Memento (Lembrança)

Permite encapsular o estado de um objeto, para salvar e restaurar a seu estado anterior sem que sejam
revelados os detalhes da sua implementação.

# Analogia com mundo real 

Imagine que você é um estudante de programação exemplar e mantém todas as suas anotações no seu caderno.
Um belo dia seu professor anúncia uma prova para amanhã sobre todos os conteúdos que aprendeu. Então você
resolve estudar e pega o seu caderno que contém todas as anotações de conteúdos anteriores para poder 
relembrar aquele conhecimento para prova.

# Resultado 

Na nossa analogia o nosso cérebro é o que chamamos objeto **originador** (aquele cujo estado será salvo),
pois ao anotarmos o nosso conhecimento adquirido naquele momento estamos salvando o estado em que o nosso
cérebro estava, a folha em que anotamos é o nosso **memento** (objeto que armazena o estado do originador),
ao anotarmos o estado de conhecimento que estamos numa folha de papel, esse conhecimento é salvo, e por último
o caderno é nosso **cuidador** (responsável por armazenar e gerir os mementos, sem conhecer os seus detalhes
internos), ou seja, no caderno contém todas as lembranças que precisamos para restaurar o estado do nosso
cérebro aos conhecimentos que precisaremos para a prova.

# Quando utilizar

Quando for necessário salvar o estado de um objeto para desfazer ações, manter um histórico de alterações,
salvar progressos, carregar estados antigos e transações que precisam se reversão em casos de falha.
