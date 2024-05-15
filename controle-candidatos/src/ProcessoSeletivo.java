import java.util.Random;
import java.util.concurrent.ThreadLocalRandom; //retorna um valor aleatório double

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {

        //case 1: analisarCandidato(1900.0);
        //        analisarCandidato(2200.0);
        //        analisarCandidato(2000.0);

        //case 2: selecaoCandidatos();

        //case 3: imprimirSelecionados();

        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        };
    }

/* 
* Case 3: uso do do while
*/

    static void entrandoEmContato(String candidato){

        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do{
            atendeu = atender();
            continuarTentando = !atendeu;

            if(continuarTentando){
                tentativasRealizadas++;
            } else {
                System.out.println("Contato realizado com sucesso");
            }
        }while(continuarTentando && tentativasRealizadas < 3);

        if(atendeu)
			System.out.println("Conseguimos contato com " + candidato +" na " + tentativasRealizadas + " tentativa.");
		else {
			System.out.println("Não conseguimos contato com " + candidato +", número máximo de tentativas " + tentativasRealizadas + " realizadas.");
        }
	}

    static boolean atender(){
        return new Random().nextInt(3)==1; //esse método simula através de uma expressão randomica que, se o valor entre 1 e 3 == 1, ele atendeu, do contrário ele não atendeu e vai ficar forçando a chamada/toque
    }

/* 
* Case 3: uso do for e for each
*/ 

static void imprimirSelecionados(){
    String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};

    System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");

    for(int i = 0; i < candidatos.length; i++){
        System.out.println(" O candidato de n0 " + (i + 1) + " é o " + candidatos[i]);
    }

    System.out.println("Forma abreviada de interação for each: ");

    for(String candidato : candidatos){
        System.out.println("O candidato selecionado foi " + candidato);
    }
}

/* 
* Case 2: uso do while
*/ 

    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

        int candidatosSelecionados = 0;

        int candidatoAtual = 0;

        double salarioBase = 2000.0;

        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário: " + salarioPretendido);

            if(salarioBase >= salarioPretendido) {
                System.out.println( "O candidato " + candidato + " foi selecionado para a vaga.");
                candidatosSelecionados++;
            }
            else {
                System.out.println("Portanto, o candidato " + candidato + " não foi selecionado para a vaga.");
            }
            candidatoAtual++;
        }
    }

/* 
* Case 1: uso do if/else 
*/ 

    static double valorPretendido() {
     return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {

        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        }
        else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta.");
        }
        else {
            System.out.println("Aguradando o resultado dos demais candidatos.");
        }
    }
}