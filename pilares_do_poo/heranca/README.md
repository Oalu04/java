# Herança

A proposta do segundo pilar do POO, herança, é propor uma reutilização de código e evitar códigos repetitivos. Ou seja, ao invés de termos 3 classes que fazem as mesmas funções e só trocam algumas palavras, podemos criar uma classe pai `ServicoMensagemInstantanea` que irá distribuir seus atributos para o que chamamos de classe filhos, que são outras classes que irão receber os atributos de uma classe pai. 

```java 
public class FacebookMessenger {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando Mensagem pelo Facebook");

        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook");
    }

    private void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
    }

    private void salvarHistoricoMensagem() {
        System.out.println("Salvando o historico da mensagem");
    }
}
```

```java
public class Telegram {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando Mensagem pelo telegram");

        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo telegram");
    }

    private void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
    }

    private void salvarHistoricoMensagem() {
        System.out.println("Salvando o historico da mensagem");
    }
}
```

Nessas duas classes acima observamos que é a mesma estrutura de código, a unica mudança é que alteramos a nomeação quando enviamos uma mensagem, ou pelo telegram ou pelo facebook. Mas ao invés de termos todo esse trabalho, podemos criar uma classe pai: 

```java
public class ServicoMensagemInstantanea {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando Mensagem");

        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem");
    }

    private void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
    }

    private void salvarHistoricoMensagem() {
        System.out.println("Salvando o historico da mensagem");
    }
}
```

A classe pai agora possui os atributos que antes eram das classes Telegram e Facebook que agora vão herdar esses atributos

```java 
public class FacebookMessenger extends ServicoMensagemInstantanea{

}

```
<br>

```java 
public class Telegram extends ServicoMensagemInstantanea{

}

```
<br>    

```java
public class ComputadorPedrinho {
    public static void main(String[] args) {
        FacebookMessenger fcb = new FacebookMessenger();
        fcb.enviarMensagem();
        fcb.receberMensagem();

        Telegram tlg = new Telegram();
        tlg.enviarMensagem();
        tlg .receberMensagem();
    }
}
```
