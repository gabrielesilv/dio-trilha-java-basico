/*Percorrendo array com FOR

public class ExemploForArray {
    public static void main(String[] args) {
        String alunos [] = {"FELIPE", "JULIA", "MURILO", "LAIS"};

        for(int x = 0; x < alunos.length; x++){
            System.out.println("O aluno no índice " + x + " é " + alunos[x]);
        }
    }
}
*/


// Percorrendo array com For Each
public class ExemploForArray {

    public static void main(String[] args) {
        
        String alunos [] = {"FELIPE", "JULIA", "MURILO", "LAIS"};

        for (String aluno : alunos) {
            System.out.println("O nome do aluno é: " + aluno);
        }
    }
}