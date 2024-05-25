package servicomensagens;
public class FacebookMessenger extends ServicoMensagemInstantanea {

    @Override
    public void enviarMensagem() {
        System.out.println("Mensagem enviada pelo Facebook");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Mensagem recebida pelo Facebook");
    }
}