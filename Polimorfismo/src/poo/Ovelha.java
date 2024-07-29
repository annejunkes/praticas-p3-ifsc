package poo;

public class Ovelha extends AbstractAnimal{

	public Ovelha() {
		super("Euclides",4);
	}

	@Override
	public String emitirSom() {
		return "BEEEH";
	}
	
	public String getEspecie() {
		return "ovelha";
		
	}
}
