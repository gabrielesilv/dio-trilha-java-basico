import java.util.Scanner; 

public class VerificadorNumeroConta { 

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 

// TO DO: Inicialize um bloco try-catch para capturar exceções:
        try {
            System.out.println("Digite o número da conta bancária:");
            String numeroConta = scanner.nextLine();

            verificarNumeroConta(numeroConta);

            System.out.println("Numero de conta valido."); 
            
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage()); 

        } finally {
            scanner.close();
        }
    }

// Declaração do método verificarNumeroConta, que verifica se o número de conta tem exatamente 8 dígitos:
    private static void verificarNumeroConta(String numeroConta) { 

        // TO DO: Verifique se o número da conta tem exatamente 8 dígitos:
        if (numeroConta.length() != 8){

            // TO DO: Implemente uma exceção do tipo IllegalArgumentException, caso o número de conta não tenha 8 dígitos:
            throw new IllegalArgumentException("Número inválido. Digite exatamente 8 digitos.");
        }          
    }
}