package veículo;

public class Autodromo {
    public static void main(String[] args) {

        Carro jeep = new Carro();
        jeep.setChassi("397832");
        jeep.ligar();


        Moto z400 = new Moto();
        z400.setChassi("736282");
        z400.ligar();

        //polimorfismo
        MeioTransporte coringa = jeep;
        coringa.ligar();
    }
}