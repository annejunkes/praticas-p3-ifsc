package ex3;

public abstract class AbstractMembro {
	
	String nome;
	
	public AbstractMembro(String nome) {
		this.nome= nome;
		
	}
	
	public abstract String getAcao();
	public abstract String getInformacoes();
	
	public void printar() {
		System.out.println("Nome: " + nome);
		System.out.println(getInformacoes());
		System.out.println("Atividade: "+ getAcao()+ "\n");
	}
}
