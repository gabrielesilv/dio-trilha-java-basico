import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ExemploExcepcionais {
    public static void main(String[] args) {

        //criando o objeto scanner

        try{
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            
            System.out.println("Digite seu nome");
            String nome = scanner.next();
            
            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade");  //possível erro: o usuário digitar o nome dos números: ex.: dezoito
            int idade = scanner.nextInt();
            
            System.out.println("Digite sua altura"); //possível erro: o usuário não inserir o tipo numérico decimal no formato americano, ex.: 1.65
            double altura = scanner.nextDouble();

            
            //imprimindo os dados obtidos pelo usuario
            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + "cm ");
            scanner.close();
        }

        // estou avisando que o campo idade e altura devem ser numéricos
        catch(InputMismatchException e){
            System.out.println("Os campos idade e altura precisam ser numéricos");
        }
    }
}
