# Abstração

A prática da abstração se refere que um mesmo método pode realizar diferentes comportamentos dependendo da nossa classe. Por exemplo, no nosso código anterior tinhamos uma classe para `Facebook` e uma classe para o `Telegram`. Quando atribuímos o pilar da herança os método de enviar e receber mensagens ficaram padronizados. 

Utilizando o pilar da abstração faremos com que nesse caso, nossa saída seja mais específica, o enviar mensagem mandaria que o facebook que está enviando, e o Telegram o dele. 

No código abaixo nós acessamos a classe pai que criamos e agora ela "firmará um contrato" e qualquer classe que se "extender" dela, precisará ter os elementos abaixo que selecionamos com o tipo `abstract`.

```java
public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem(); 
}
```

Automaticamente nossos serviços que extendem da classe pai devem possuir os elementos que definimos. 

```java
public class Telegram extends ServicoMensagemInstantanea {

    public void enviarMensagem() {
        System.out.println("Enviando mensagem pelo Telegram");

    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Telegram ");

    }

}

```


```java
public class FacebookMessenger extends ServicoMensagemInstantanea {

    public void enviarMensagem() {
        System.out.println("Enviando mensagem pelo Facebook Messenger");
    }

    
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo facebook Messenger");
    }
}

```

Utilizando somente o pilar da herança so existia uma única maneira de se enviar e receber uma mensagem. Agora com o pilar da abstração cada classe possui sua maneira própria de realizar uma ação.

>[!NOTE] 
> Em java o conceito de abstração é representado pela palavra reservada **abstract** e métodos que **NÂO** possuem corpo na classe abstrata (pai).
