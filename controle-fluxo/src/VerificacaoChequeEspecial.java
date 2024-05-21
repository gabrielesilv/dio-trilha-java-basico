import java.util.Scanner;

public class VerificacaoChequeEspecial { 

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Informa seu saldo atual: ");
        double saldo = scanner.nextDouble(); 

        System.out.println("Qual o valor de saque deseja realizar?");
        double saque = scanner.nextDouble(); 

        double limiteChequeEspecial = 500; 

        if (saque < saldo){
            System.out.println("Transação realizada com sucesso.");
        }
        else {           
        double valorNecessario = saque - saldo;
            if (valorNecessario > limiteChequeEspecial) {
                System.out.println("Transação não pode ser realizada. Limite do cheque especial excedido.");
            } else {
                System.out.println("Transação realizada com sucesso, utilizando o cheque especial.");
            }
        }
        scanner.close();
    }
}