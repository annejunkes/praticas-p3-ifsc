package poo;

public class Vaca extends AbstractAnimal{
	
	public Vaca() {
		super("Michelangela",4);
	}

	@Override
	public String emitirSom() {
		return "MUU";
		
	}
	
	public String getEspecie() {
		return "vaca";
		
	}

}
