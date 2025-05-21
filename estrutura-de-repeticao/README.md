# Estruturas de Repetição
Estruturas de repetição, também conhecidos como loops, são comandos que fazem com que nossas instruções sejam repetidos diversas vezes. 

As repetições são representadas pelas seguintes estruturas: 
* **For** (para)
* **While** (enquanto)
* **Do While** (faça enquanto)

## For 

O comando `for` ele precisa de alguns parâmetros de entrada, uma variável contadora, uma condição e um valor de incremento.


`for (variável_contadora; condicao; incremento){}`

```java
     for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }
```
Basicamente o que este código está dizendo é: "Uma váriavel de tipo inteiro inicialmente em 0 `;` enquanto i for menor ou igual a 20 `;` incremente em 1 ao contador" no bloco de código é um simples print que se repetirá até que o contador que nós definimos como `i` chegue a 20. 

### Arrays utilizando For 

Array é uma estrutura de dados que armazena um conjunto de elementos do mesmo tipo em posições sequencial, ou seja uma depois da outra. É como uma variável com múltiplos valores. 

Com um laço for conseguimos percorrer por toda cadeia que um array possui

```java
    for (int x = 0; x < alunos.length; x++) {
        System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
    }
```

Este laço for está imprimindo cada valor na posição X do nosso array de alunos, como nosso X está inicialmente em 0, ele procurará no array a posição de número zero e imprimirá o valor que está dentro dele, que no nosso caso seria `FELIPE`. 

>[!WARNING]
>Lembre-se que todo Array começa na posição de número 0.

>[!TIP]
>Uma outra forma de realizar esse mesmo comando é utilizando o **:** no laço for:

```java
    for(String aluno : alunos) {
        System.out.println("Nome do aluno é: " + aluno);
    }
```

Este `:` está dizendo que a cada valor armazenado numa certa posição do array de `alunos` será atualizada na nossa String `aluno`


## While 
O laço while na tradução literal significa "enquanto", em questão de código, enquanto uma condição estabelecida for válida o bloco de código continuará a ser executado até que a condição torne-se falsa.

```java 
while (x <= 10) {
    System.out.println(x);
    x++;
}
```

O que este código está dizendo é: "Enquanto x (que inicialmente vale 0) for menor ou igual a 10, imprima o valor atual de x e no final adicione + 1 ao valor.

Esse comando `x++` serve para que no final do laço while a variável x aumente em 1 seu valor, assim o laço while não se repetirá infinitamente, pois sem esse comando x jamais sairia de 0. 

### Do While 

Na tradução literal `Do While` significa ("faça.. enquanto"), da mesma forma que o laço while, enquanto uma condição for válida o bloco de código será executado. Contudo, `Do While` diferentemente de `While`, testa a condição após executar o código, assim mesmo que a condição seja inválida ela será executada pelo menos uma vez. 

```java
do {
    bloco de comando
    
}while(condição);
```