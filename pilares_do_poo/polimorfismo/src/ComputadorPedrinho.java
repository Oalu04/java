import apps.FacebookMessenger;
import apps.ServicoMensagemInstantanea;
import apps.Telegram;

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
