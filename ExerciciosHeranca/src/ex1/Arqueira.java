package ex1;

public class Arqueira extends AbstractPersonagem{
	
	public Arqueira() {
		super("Chani",6);
	}
	
	@Override
	public String getAtaque() {
		return " atirou o adversário\nDano:";
	}
	
	public String getPersonagem() {
		return " arqueira ";
	}
	

}
