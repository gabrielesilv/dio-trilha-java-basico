public class ExemploBreakContinue {
    public static void main(String[] args) {
        
        for(int numero = 1; numero <= 5; numero++){
            if (numero == 3)
            //  break; // interrompeu o looping quando chegou no 3
                continue; //muda o fluxo da iteração, não imprimindo o número da condição
            System.out.println(numero);
        }
    }
}
