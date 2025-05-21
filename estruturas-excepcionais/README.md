# Estruturas excepcionais
## Exceções

Ao executar o código em Java, diferentes erros podem ocorrer: erros de codificação, erros devido a entradas erradas, etc. 

Quando ocorre um erro, o Java normalmente para e gera uma mensagem do erro em seu terminal.

## Erro X Exceção
Em java, um erro é algo irreparável, a aplicação é encerrada drasticamente e é impossivel de se manter. Já exceções é um fluxo inesperado da nossa aplicação, situações não previstas pelo programador, seja colocar em um campo sua idade ao invés de seu nome, tentar dividir um número por 0, digitar sua senha ou Email inválida.

```java
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome");
        String nome = scanner.next();
        
        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();
        
        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        scanner.close();   
    }
}
```

Um programa relativamente simples, mas com algumas possíveis exceções que podem acontecer. 

+ Não informar o nome e sobrenome
+ O valor da idade ter um caractere NÃO númerico
+ O valor da altura  ter uma vírgula ao invés de ser um ponto


Supondo que uma das informações que nosso usuário nos deu foi que possui "quinze" anos, para nosso código esse dado se trata de uma exceção pois precisamos que o valor seja númerico, dessa forma o Java disparará uma mensagem dizendo `java.util.InputMismatchException` significando que não pode converter a string para número. 

### Tratamento de Exceções

A instrução **`try`** permite que você defina um bloco de código para ser testado quanto a erros enquanto está sendo executado.

A instrução **`catch`** permite definir um bloco de código a ser executado, caso ocorra um erro no bloco try.

A instrução **`finally`** permite definir um bloco de código a ser executado independente de ocorrer um erro ou não. As palavras-chave `try` e `catch` vêm em pares;

```java
try {

}

catch(Exception e) {
    
}
```
## Hierarquia das Exceções
A linguagem java possui diversas classes que representam exceções que são organizadas em uma hierarquia denominada **Checked and Unchecked Exceptions**.

![](<image (6).png>)

Uma `RuntimeException` é uma exceção que não é verificada pelo compilador. Em outras palavras, o compilador não obriga que o programador trate essa exceção. São geralmente exceções que ocorrem durante o tempo de execução do programa, devido a erros internos ou condições inesperadas que não podem ser detectadas no momento da compilação. 

Em geral, as RuntimeExceptions indicam erros de programação, como erros de lógica, acesso a objetos nulos, erros de tipo ou limites de arrays, ou erros na manipulação de dados

Já uma `Exception`, denominada como **Checked exception** é uma exceção que o compilador verifica se foi tratada (com um bloco try-catch) ou declarada (usando o comando throws) pelo programador.

Ou seja, o código que pode lançar essa exceção é obrigado a lidar com ela de alguma forma, para garantir que o programa seja robusto e não encontre problemas inesperados em tempo de execução. 