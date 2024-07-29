package poo;

public class MainAnimal {

	public static void main(String[] args) {

		AbstractAnimal vaca = new Vaca();
		AbstractAnimal gato = new Gato();
		AbstractAnimal ovelha = new Ovelha();
		
		//Classe anonima
		AbstractAnimal galinha = new AbstractAnimal("mel",2) {
			@Override
			public String emitirSom() {
				return "POPOPO";
			}
			public String getEspecie() {
				return "galinha";
			}
		};
		
		vaca.emitirSom();
		gato.emitirSom();
		ovelha.emitirSom();
		galinha.emitirSom();
		
		vaca.falar();
		gato.falar();
		ovelha.falar();
		galinha.falar();

	}

}
