package servicomensagens;
public class MsnMessenger extends ServicoMensagemInstantanea {

    @Override
    public void enviarMensagem() {
        System.out.println("Mensagem enviada pelo MSN");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Mensagem recebida pelo MSN");
    }
}