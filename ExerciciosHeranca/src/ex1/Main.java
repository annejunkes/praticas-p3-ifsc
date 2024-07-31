package ex1;

public class Main {

	public static void main(String[] args) {

		AbstractPersonagem guerreiro = new Guerreiro();

		guerreiro.getPersonagem();
		guerreiro.getAtaque();
		guerreiro.printarAtaque();
		
		AbstractPersonagem mago = new Mago();
		
		mago.getPersonagem();
		mago.getAtaque();
		mago.printarAtaque();
		
		AbstractPersonagem arqueira = new Arqueira();
		
		arqueira.getPersonagem();
		arqueira.getAtaque();
		arqueira.printarAtaque();
		
	}

}
