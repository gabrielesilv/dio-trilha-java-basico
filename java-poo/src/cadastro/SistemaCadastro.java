package cadastro;
public class SistemaCadastro {
	public static void main(String[] args) {
		//criamos uma pessoa no sistema
		Pessoa marcos = new Pessoa("123", "Marcos"); //objeto marcos criado
		
		//definimos o endereço de marcos
		marcos.setEndereco("RUA DAS MARIAS");
		
		
		//imprimindo o marcos sem o nome e cpf
		
		System.out.println(marcos.getNome() + "-" + marcos.getCpf());
	}
}
