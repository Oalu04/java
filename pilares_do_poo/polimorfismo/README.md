# Polimorfismo 

O último pilar de poo em Java, ele permite que um método ou objeto se comporte de maneiras diferentes. 

Em nosso exemplo teremos alguns aplicativos de mensagens instantâneas, mas não sabemos qual foi escolhida até o usuário informar e todas devem ter um método de enviar e receber mensagens.

```java
public class ComputadorPedrinho {
    public static void main(String[] args) {
       ServicoMensagemInstantanea smi = null; 

       String appEscolhido = "fbm";

       if(appEscolhido.equals("fbm")) {
        smi = new FacebookMessenger(); 
       }

       else if (appEscolhido.equals("tlg")) {
        smi = new Telegram();
       }

       smi.enviarMensagem();
       smi.receberMensagem();
    }
}
```

# Modificador Protected 
Este é um modificador de visibilidade de acesso que não abordamos na etapa de [visibilidade](https://github.com/Oalu04/java/tree/main/visibilidade) pois ele é associado com o pilar de herança, então decidir comentar sobre ele depois de trazer o pilar. 

Em nossos exemplos anteriores nossa classe de serviço de mensagem também verificava a conexão com a internet e agora queremos que as classes filhas também desfrutem dessa funcionalidade. 

## Mas como poderiamos fazer isso? 

Caso você não se recorde direito sobre as visibilidades de recurso, se criarmos um método em nossa classe `ServicoMensagemInstantaena` que verifique a conexão com a internet de forma pública, nosso usuário teria acesso a esse tipo de funcionalidade e ele mesmo teria que fazer os testes toda vez que quisesse executar o programa, algo que não queremos que aconteça. Contudo, se o método for privado, as classes filhas não terão acesso à funcionalidade, já que esse modificador de acesso se extende somente para a própria classe. 

Para resolvermos isso utilizaremos o modificador **protected** na qual a visibilidade da classe se extenderá apenas para as classes que estão num mesmo pacote, subclasses (que são o que a gente chamou de classes filhas) ou se estiverem na mesma classe .
