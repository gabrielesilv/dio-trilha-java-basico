//ENCAPSULAMENTO

package veículo;

public class Carro extends MeioTransporte {

    public void ligar() {
        confereCambio();
        confereCombústivel();
        System.out.println("Carro ligado");
    }

    //encapsulamento: esconde ações que serão executadas somente dentro da própria classe (usuário não precisa ver)
    private void confereCombústivel() {
        System.out.println("Conferindo combústivel");
    }

    private void confereCambio() {
        System.out.println("Conferindo câmbio em P");
    }

    
}