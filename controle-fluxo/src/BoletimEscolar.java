// Condição ternária

public class BoletimEscolar {
    public static void main(String[] args) {
        
        int nota = 8;
                           //if                     //else if          
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
                          //else

            System.out.println(resultado);
    }
}
