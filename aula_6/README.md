# Scanner
Em java podemos obter dados digitados pelo usuário em nosso sistema utilizando a classe `Scanner`. Para podermos fazer isso precisamos importar esta classe para nosso sistema utilizando o comando `import` fora da nossa classe principal. 

```java
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main (String[] args) {

    }
}
```

>[!TIP]
>Não se atente ao signifiado dessa classe Locale, ela serve apenas para manipular configurações regionais como datas, hora e números.

## Preparação 

Antes de inicalizarmos a nossa nova classe precisamos transformar ela em uma nova classe, nos atentaremos melhor sobre isso mais pra frente. 

```java
public class App {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    }
}
```
## Utilização
Para fazer com que o usuário mande dados para nós utilizaremos o comando `scanner.next()` e o resultado será atribuido à uma variável. Com o resultado em uma variável precisaremos apenas imprimir o resultado chamando-a no comando `print`.

```java
    System.out.println("Digite seu nome");
    String nome = scanner.next();

    System.out.println("Digite seu sobrenome");
    String sobrenome = scanner.next();


    System.out.println("Ola, me chamo " + nome + " " + sobrenome);
```

>[!WARNING]
>Caso você deseje que o usuário mande dados que não seja string, no nosso comando de **Utilização** você deve colocar o tipo de dado que voce escolheu como sufixo. 

```java
    System.out.println("Digite sua idade");
    int idade = scanner.nextInt();

    System.out.println("Digite sua altura");
    double altura = scanner.nextDouble();

    System.out.println("Tenho " + idade + " anos");
    System.out.println("Minha altura é " + altura + " cm") ;
```
