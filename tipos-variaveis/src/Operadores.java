public class Operadores {
    public static void main(String[] args) throws Exception {

        // Concatenação
        String nomeCompleto = "LINGUAGEM" + " " + "JAVA";
        System.out.println(nomeCompleto);

 
        // Operadores de Atribuição
        String nome = "Leonardo";

  
        // Operadores Ternários
        int a, b;
        a = 5;
        b = 6;

        String resultado = a==b ? "verdadeiro" : "falso";
        System.out.println(resultado);

 
        // Operadores Aritméticos
        int multiplicacao = 20 * 3;
        System.out.println(multiplicacao);

  
        // Operadores Unários (incremento e descremento)
        int numero = 5;
        numero++;  // + 1
        System.out.println(numero);

        numero--; // - 1
        System.out.println(numero);


        // Operadores Relacionais
        int idade1, idade2;

        idade1 = 20;
        idade2 = 17;

        if (idade1 < idade2) {
            System.out.println("Essa pessoa é mais nova.");
        } else {
            System.out.println("Essa pessoa é mais velha.");
        }


        // Operadores Lógicos (&& e ||)
        if ((1 == 4) || (33 > 8)) {
            System.out.println("Uma das expressões é verdadeira");
        }
    }

}

// concatenação