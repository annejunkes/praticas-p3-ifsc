package lista3.ex3;

public class AnimalMain {

	public static void main(String[] args) {
		
		Animal cachorro = new Animal();
		cachorro.nomePopular = new String[5];
		
		cachorro.nomeCientifico = "Canis lupus familiaris";
		cachorro.reino = "Animalia";
		cachorro.familia = "Canidae";
		cachorro.nomePopular[0] = "Cao";
		cachorro.nomePopular[1] = "Guapeca";
		cachorro.nomePopular[2] = "Jaguara";
		cachorro.nomePopular[3] = "Toto";
		cachorro.nomePopular[4] = "Cachorro";
		
		System.out.println("Nome cientifico: " + cachorro.nomeCientifico);
		System.out.println("Reino: " + cachorro.reino);
		System.out.println("Familia: " + cachorro.familia);
		
		System.out.print("Nomes populares:");
		for(int i=0; i < cachorro.nomePopular.length; i++) {
			System.out.print(cachorro.nomePopular[i] + ", ");			
			
		}
	}

}
