package ex1;

public class Guerreiro extends AbstractPersonagem{
	
	public Guerreiro() {
		super(" Duncan Idaho",3);
	}
	
	@Override
	public String getAtaque() {
		return " apunhalou o adversário\nDano:";
	}
	
	public String getPersonagem() {
		return " guerreiro ";
	}
	

}
