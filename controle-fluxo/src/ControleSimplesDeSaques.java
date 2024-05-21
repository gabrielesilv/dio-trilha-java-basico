import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.println("limite diário de saque: ");
        double limiteDiario = scanner.nextDouble();

// TO DO: Crie um loop 'for' para iterar sobre os saques:

        for (int i = 1; i <= limiteDiario; i++){
            
            // TO DO: Solicite ao usuário o valor do saque:
            System.out.println("valor do saque: ");
            double valorSaque = scanner.nextDouble();

// TO DO: Verifique se o valor do saque é zero, encerrando as transações:

            if (valorSaque == 0){
                System.out.println("Transacoes encerradas.");

            } else if (valorSaque > limiteDiario){

            System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
            break;
            } else {
                // TO DO: Se o valor do saque não ultrapassar o limite diário, subtraia o valor do saque do limite diário:
                limiteDiario = limiteDiario - valorSaque;
                
                // TO DO: Informe que o saque foi realizado e mostre o limite restante:
                System.out.println("Saque realizado. Limite restante: " + limiteDiario);
            }
        }             
        scanner.close(); 
    }
}