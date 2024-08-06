package Ex4;

public abstract class AbstractAtleta {
	
	String nome;
	String esporte;
	
	public AbstractAtleta(String nome, String esporte) {
		this.nome = nome;
		this.esporte = esporte;
		
	}
	
	public abstract String getTreino();
	public abstract String getCompeticao();
	
	public void printar() {
		System.out.println("Atleta: " + nome);
		System.out.println("Esporte: " + esporte);
		System.out.println("Treino: "+ getTreino());
		System.out.println("Próxima competição: "+ getCompeticao()+ "\n");
		
	}

}
