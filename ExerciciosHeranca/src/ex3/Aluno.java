package ex3;

public class Aluno extends AbstractMembro{

	int matricula = 124554;
	
	public Aluno() {
		super("Laios Touden");
	}
	
	@Override
	public String getAcao() {
		return "estuda na sétima série";
	}
	
	public String getInformacoes() {
		return "Matrícula: " + matricula;
	}
}

