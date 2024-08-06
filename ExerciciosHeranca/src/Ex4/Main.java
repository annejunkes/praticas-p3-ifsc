package Ex4;

public class Main {

	public static void main(String[] args) {

		AbstractAtleta kamilla = new Basquete();
		
		kamilla.getTreino();
		kamilla.getTreino();
		kamilla.printar();
		

		AbstractAtleta eric = new Natacao();
		
		eric.getTreino();
		eric.getTreino();
		eric.printar();
		

		AbstractAtleta pedro = new Futebol();
		
		pedro.getTreino();
		pedro.getTreino();
		pedro.printar();

	}

}
