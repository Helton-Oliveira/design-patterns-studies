# Agenda de tarefas diárias

Neste projeto iremos construir uma agenda de tarefas diárias, onde será possível buscar a tarefa atual,
a próxima e a anterior, com as condições que, a tarefa atual deve ser do mesmo dia que esta realizando 
a busca, ela deverá estar com o status aberto e o seu horário deverá ser o mais cedo possível, sendo ela
a mais urgente.

![diagrama-do-projeto](Iterator-project.png)

# Explicação

**1 - Iterator:** A interface **iterator** define os métodos comuns a todos os iterators que a 
implementar, estes são necessários para percorrer a coleção. 

**2 - Iteradores concretos:** Classes que implementam a interface **Iterator**, nelas deverão conter
a real lógica para percorrer a coleção, nela também temos uma referência para a collection concreta
que o iterator irá percorrer.

**3 - Collection:** A interface collection declara métodos para obterem os seus iteradores podendo ser 
apenas um ou mais. O retorno destes métodos devem ser a **interface** dos iteradores, pois isto 
permite as collections concretas retornarem vários iteradores.

**4 - Coleções concretas:** Responsável por retornar as instâncias dos iteradores concretos que ela 
permite que a manipulem. Esta classe fica responsável também por montar a coleção, como se fosse 
uma classe agregadora de objetos e estes objetos são as unidades que juntas compõem uma collection,
por isso esta classe pode conter vários métodos para poder criar a coleção.

**5 - Código Cliente:** Está classe trabalha com as interfaces de **Iterator** e **Collection**, onde
a collection cria o iterator que pode manipular a collection, assim encapsulando toda a estrutura 
dela. Note que a classe cliente não chama diretamente o iterator diretamente, mas sim é possível
em casos que o código cliente precise de um iterator especial.

**6 - Unidade da Collection:** Esta classe é opcional, pois aqui no projeto para não precisarmos 
utilizar uma fonte de dados para buscar as tarefas, criamos um objeto que pode ser instanciado e
agregado a outros para compor uma collection na classe concreta **TaskCollection**, mas podemos 
apenas utilizar a classe de collections concretas para buscar dados de alguma fonte externa.

> **Nota**
> 
> Foque em aprender o conceito, com isso podemos saber quando e onde
> utilizar este padrão nos nossos projetos, pois algumas vezes pode ser uma má ídeia utilizá-los.