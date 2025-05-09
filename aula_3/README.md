#Utilização do Método 
Criamos um método com a [nomenclatura](https://github.com/Oalu04/java/blob/main/aula_1/README.md#anatomia-de-classes) necessária, definindo seu tipo de retorno, nome e seus parâmetros.

>[!IMPORTANT]
>O tipo de retorno que definimos será o tipo que o método irá retornar ao final de sua instrução. Caso você escolheu o tipo de retorno sendo uma `String`, ao final do método o valor retornado deverá ser uma string. <br><br>
>Os parâmetros são o que o método receberá de argumento: 

```java
public static double test (int num1, int num2) {

}
``` 
Nesse caso o método irá receber 2 variáveis de tipo **inteiro**, e retornará um tipo **double**

#Retornará para onde? 

Ao finalizarmos a criação de um método precisamos que ela seja executada em nosso **método principal** que denominamos como **chamada de função**. 

```java
public static void main (String [] args) {
int nome completo = nomeCompleto(primeiroNome, segundoNome);
}
```
Para chamar uma função digitamos o nome da função e atribuimos os parametros que ela pede, nesse caso, duas variáveis do tipo Strings. 

Dadas seus parâmetros o corpo do método irá realizar todo o processo que decidimos e no final de tudo retornará o resultado para a variável **nome completo**.
 
>[!TIP] 
>Na maioria dos métodos ao final de seu processo ela se torna um valor único, uma string, um inteiro, no nosso caso um nome. Usamos uma variável apenas para armazenar o valor que nosso método retornará para a chamada que fizemos, mas em algumas funções podemos fazer de forma mais direta sem precisar que coloquemos em uma variável. 

```java
System.out.println(nomeCompleto(primeiroNome, segundoNome));
```



