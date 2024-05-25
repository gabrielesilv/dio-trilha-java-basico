package servicomensagens;
public class ComputadorPedrinho {
    public static void main(String[] args) {
        
        System.out.println("MSN Messenger");

        MsnMessenger msn = new MsnMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();

        System.out.println("Facebook Messenger");

        FacebookMessenger fcb = new FacebookMessenger();
        fcb.enviarMensagem();
        fcb.receberMensagem();

        System.out.println("Telegram");

        Telegram tlg = new Telegram();
        tlg.enviarMensagem();
        tlg.receberMensagem();
    }
}