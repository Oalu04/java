# Interfaces funcionais 
Interfaces funcionais são interfaces que contém um único método abstrato. 

>Ela serve como base para expressões lambda ou referências de método.

```java
@FunctionalInterface
interface Saudacao {
    void dizerOla();
}

```
Essa interface tem apenas um método abstrato, e por isso pode ser usada assim:

```java
Saudacao s = () -> System.out.println("Olá!");
s.dizerOla();  // Saída: Olá!
```
## @FunctionalInterface
É uma anotação opcional mas recomendada. Ela garante que a interface tem apenas um método abstrato. Se você tentar adicionar outro método abstrato, o compilador mostrará erro.
