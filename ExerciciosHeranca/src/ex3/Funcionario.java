package ex3;

public class Funcionario extends AbstractMembro{

	String dataContratacao = "27/03/2018";
	
	public Funcionario() {
		super("Chilchuck Tims");
	}
	
	@Override
	public String getAcao() {
		return "cuida da portaria";
	}
	
	public String getInformacoes() {
		return "Data de contratação: " + dataContratacao;
	}
}

