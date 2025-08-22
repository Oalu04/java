# Interfaces funcionais e expressões Lambd
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
## `@FunctionalInterface`
É uma anotação opcional mas recomendada. Ela garante que a interface tem apenas um método abstrato. Se você tentar adicionar outro método abstrato, o compilador mostrará erro.

# Expressões Lambda 
Expressão Lambda é uma forma de simplificar a escrita de funções anônimas e o uso de interfaces funcionais.

## Sintaxe básica: 

```
(parametros) -> { corpo_da_função }
```
* Os **parâmetros** são os valores recebidos pela função.
* A seta `->` separa os parâmetros do corpo 
* O **Corpo** é o que será executado

## Sem usar lambda:
```java
// Usando classe anônima
Runnable r = new Runnable() {
    @Override
    public void run() {
        System.out.println("Executando tarefa!");
    }
};
```

## Usando lambda:
```java
Runnable r = () -> System.out.println("Executando tarefa!");
```

## Exemplo com parâmetro: 
```java
 // Interface funcional
interface Operacao {
    int executar(int a, int b);
}

public class Teste {
    public static void main(String[] args) {
        // Expressão lambda que soma dois números
        Operacao soma = (x, y) -> x + y;
        System.out.println(soma.executar(5, 3)); // Saída: 8
    }
}
```
> [!IMPORTANT]
> Expressões lambdas podem ter mais do que uma instrução diferentemente de como fizemos no exemplo, utilizando apenas uma. Mas é obrigatório que elas implementem apenas um método abstrato, que sejam uma interface funcional.
>* Lambdas não podem ser usados para implementar classes com múltiplos métodos abstratos(a não ser que todos, menos um, tenham implementação padrão `default` ou `static`).


## Funções anônimas
Classes anônimas são classes sem nome que declaramos e instanciamos ao mesmo tempo, muito usado para sobrescrever métodos ou implementar interfaces específicas que será utilizada apenas uma vez e não quer criar uma classe toda para isso.

### Características principais:
1* Não tem nome
2* São criadas no momento da instanciação
3* Normalmente herdam de uma classe ou implementam uma interface
4* São usadas para objetos temporários. Úteis quando precisamos reutilizar essa implementação em outro lugar

### Exemplo com interface 
```java
interface Saudacao {
    void dizer();
}

public class Teste {
    public static void main(String[] args) {
        Saudacao s = new Saudacao() {
            @Override
            public void dizer() {
                System.out.println("Olá, mundo!");
            }
        };
        s.dizer();
    }
}
```

### Exemplo com classe:
```java
class Animal {
    void som() {
        System.out.println("Som genérico");
    }
}

public class Teste {
    public static void main(String[] args) {
        Animal a = new Animal() {
            @Override
            void som() {
                System.out.println("Latido!");
            }
        };
        a.som();
    }
}
```