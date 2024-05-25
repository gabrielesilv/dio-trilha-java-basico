package veículo;

//herança: extends - classe genérica que tem extensão para suas classes filhas
public class Moto extends MeioTransporte {

    // 
    @Override
    public void ligar() {
        System.out.println("Moto ligada");
    }
    
}
