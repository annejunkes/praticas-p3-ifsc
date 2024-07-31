package ex1;

public class Mago extends AbstractPersonagem{

	public Mago() {
		super("Tleilaxu",5);
	}
	
	@Override
	public String getAtaque() {
		return " enfeitiçou o adversário\nDano:";
	}
	
	public String getPersonagem() {
		return " mago ";
	}
	
}
