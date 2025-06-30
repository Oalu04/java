# Records
Introduziremos agora o conceito de records. Records são um tipo especial de classe criados para representar classes imutáveis que servem como "porta-dados" simplificando a criação de classes que armazenam informações.

De inicio sua criação não é muito diferente de uma classe comum, com apenas a adição de um parênteses e possuindo outras características: 

+ São imutáveis(os campos são `Final`).
+ Não podem estender outras classes(Mas podem implementar interfaces).
+ Não tem metodos set.
+ Os campos são automaticamente `pritave final`, com métodos de acesso (`get`) com o mesmo nome do campo.

```java
public record Person() {

}

```