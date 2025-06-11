# Encapsulamento 
> Nem tudo precisa estar disponivel para todos

Pense voce utilizando o MSN Messenger e ao querer enviar uma mensagem, te fosse solicitado verificar se o computador está conectado a internet e depois, pedir para você salvar a mensagem no histórico? Ou se tentasse enviar um SMS pelo celular, primeiro precisasse consultar manualmente seu saldo?    

Isso não seria uma experiência agradavel por nós usuários

Para o Messenger, para nós, só é relevante saber que como devemos enviar e receber a mensagem, logo, as demais funcionalidades poderão ser consideradas privadas(private). E é ai que se caracteriza a necessidade do pilar de Encapsulamento, o que esconder? 
 
```java
public static void main (String[] args) {
    MSNMessenger = new MSNMessenger(); 
    
    msn.validarConectadoInternet();
    msn.enviarMensagem();
    msn.salvarHistoricoMensagem();

    msn.receberMensagem();

}
``` 
Agora imagine se nosso usuário antes de mandar uma mensagem precisasse toda vez verificar se está conectado à internet? O código em si não esta errado, contudo ainda há um erro de lógica. Para resolvermos isso iremos criar uma classe e deixar os metodos `validarConectadoInternet();` e `salvarHistoricoMensagem();` privados. 

```java
public class MSNMessenger {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviar mensagem");
        salvarHistoricoMensagem(); 
    }

    private void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet.");
    }

    private void salvarHistoricoMensagem() {
        System.out.println("Salvando o histórico da mensagem");
    }
}
```
Como as classes citadas agora são privadas, nossa classe principal não conseguiria acessá-las, por isso nós a chamamos para o método `enviarMensagem()` que é `public` e agora toda vez que o usuário for enviar uma mensagem, ele automaticamente ira verificar se está validado a internet, sem precisar fazer isso manualmente. 