# Controle de Fluxo

O controle de fluxo é uma maneira de fazer com que seu código se comporte de forma especial por meio de instruções especiais. Podendo executar tarefas seletivamente, repetidamente ou excepcionalmente

* **Estruturas condicionais**: if-else, switch-case
* **Estruturas de repetição**: for, while, do-while
* **Estruturas de exceções:** try-catch-finnaly, throw

## Estruturas Condicionais 

Esse tipo de estrutura possibilita uma escolha de ações a serem executadas quando determinadas condições são atendidas. 

* A estrutura condicional pode ser **simples** ou **composta**.

### Condicionais Simples 

Ocorre quando temos apenas 1 opção a ser seguida.

```java
if(valorSolicitado < saldo)
    saldo = saldo - valorSolicitado;

```
Podemos ver no código acima, que o comando faz uma verificação para ver se a condição que colocamos em **parênteses** é atendida: "Se, `valorSolicitado` for menor que `saldo`; `saldo` agora será seu valor inicial menos `valorSolicitado`".

A estrutura é denominada simples por justamente ter apenas esse caminho que determinamos como opção. Poderiamos alterar a condição dizendo que agora Se, o valorSolicitado fosse > que saldo, mas ainda assim teriamos apenas um caminho a ser seguido, o que `valorSolicitado` é maior que saldo. 


### Condicionais Compostas

Nesse caso nosso código tem mais de um caminho que pode ser seguido, o caso de se ele for verdadeiro, ou se ele for falso. Uma variação de código será feita dependendo de qual caminho for seguido. 

```java
    int nota = 6;

        if (nota >= 7)
            System.out.println("Aprovado");

        else
            System.out.println("Reprovado");
```

Esse comando le-se dessa forma: "Se nota for >= a 7, printe aprovado **Se não**, printe reprovado".


### Condicionais Encadeadas

Em um controle de fluxo condicional nem sempre nos limitaremos ao **if** e **else**, poderiamos ter mais de outras condições.

```java
        if (nota >= 7)
            System.out.println("Aprovado");

            else if(nota >= 5 && nota < 7)
                System.out.println("Recuperação");

        else
            System.out.println("Reprovado");

```

Nesse novo código somos introduzidos ao novo comando **else if** que serve como um outro caminho para nosso controle de fluxo.

Podemos ler essa estrutura da seguinte forma "Se, `nota` for maior ou igual a 7, printe aprovado. Se não, se `nota` for maior ou igual a 5 **E** menor que 7, printe recuperação."

### Switch case 

Essa estrutura compara o valor de cada caso com o da variável sequencialmente, e sempre que encontra um valor correspondente, executa o código associado ao caso. Para evitar que o código continue as comparações depois de que um caso ja foi encontrado, escrevemos o comando `break` no final de cada bloco de código. 

O comando `break` quando executado, encerra a execução da estrutura. 


```java
switch (sigla) {
            case "P": {
                System.out.println("PEQUENO");
                break;
            }

            case "M": {
                System.out.println("MEDIO");
                break;
            }

            case "G": {
                System.out.println("Grande");
                break;
            }

            default: {
                System.out.println("INDEFINIDO");

            }
}
```