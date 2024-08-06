package Ex4;

public class Natacao extends AbstractAtleta{
	
	public Natacao() {
		super("Eric Moussambani","Natação");
	}
	
	@Override
	public String getTreino() {
		return"Agilidade-50min|Resistência-1h";
	}
	
	public String getCompeticao() {
		return"Mundial de Esportes Aquáticos, Doha 2024";
	}
	

}

