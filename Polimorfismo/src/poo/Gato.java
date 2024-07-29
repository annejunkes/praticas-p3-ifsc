package poo;

public class Gato extends AbstractAnimal{
	
	public Gato() {
		super("Muad D'ib",4);
	}

	@Override
	public String emitirSom() {
		return "MIAU";
		
	}
	
	public String getEspecie() {
		return "gato";
		
	}

}
