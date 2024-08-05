package ex3;

public class Professor extends AbstractMembro {
	
	String formacao = "Mestre em Letras";
	
	public Professor() {
		super("Marcille Donato");
	}
	
	@Override
	public String getAcao() {
		return "ensina Português";
	}
	
	public String getInformacoes() {
		return "Formação acadêmica: " + formacao;
	}
}


