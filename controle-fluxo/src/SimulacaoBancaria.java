import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double saldo = 0; 
 //       int opcao = 0;

        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (true) { 

            System.out.println("Menu de opções");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Consultar saldo");
            System.out.println("0. Encerrar");

            int opcao = scanner.nextInt(); 

        // TO DO: Implemente as condições necessárias para avaliaa a opção escolhida:

        switch (opcao) {
            case 1: {
                System.out.println("Digite qual valor deseja depositar: ");
                double valorDepositado = scanner.nextDouble();
                saldo = saldo + valorDepositado;
                System.out.println("Depósito realizado com sucesso. Saldo atual: " + saldo);

                break;
            }
            case 2: {
                System.out.println("Digite qual valor deseja sacar: ");
                double valorSacado = scanner.nextDouble();
                if (valorSacado <= saldo){
                    saldo = saldo - valorSacado;
                    System.out.println("Saque realizado com sucesso. Saldo atual: " + saldo);
                } else {
                        System.out.println("Saldo insuficiente");
                    }
                
                break;
            }
            case 3: {
                System.out.println("Saldo atual: " + saldo);       

                break;
            }
            case 0: {
                System.out.println("Programa encerrado.");
                scanner.close();
                System.exit(0);

                break;
            }
                default:
                    System.out.println("Opção inválida. Tente novamente."); 
            }
        }
    }
}