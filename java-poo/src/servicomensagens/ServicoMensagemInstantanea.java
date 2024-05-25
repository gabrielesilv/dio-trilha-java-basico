package servicomensagens;
//abstratic: define que suas classes filhas serão obrigadas a utilizarem esses métodos
//como nesse exemplo: todo e qualquer sistema de mensagem precisa no mínimo Enviar e Receber Mensagem, logo, consideramos se firmar um "contrato" para qualquer um que queira se apresentar assim para o mercado

public abstract class ServicoMensagemInstantanea {
	public abstract void enviarMensagem();
	public abstract void receberMensagem();	
}