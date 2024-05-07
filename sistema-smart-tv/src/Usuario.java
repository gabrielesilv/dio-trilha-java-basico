public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        System.out.println("Qual o canal atual? " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Qual o canal atual? " + smartTv.canal);


        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("Qual o canal atual? " + smartTv.canal);
        System.out.println("Qual o volume atual? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("A TV está ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("A TV está ligada? " + smartTv.ligada);
    }
}
