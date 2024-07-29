package poo;

public abstract class AbstractAnimal {

	String nome;
	int patas;
	
	public AbstractAnimal(String nome, int patas) {
		this.nome=nome;
		this.patas=patas;
	}
	public abstract String emitirSom();
	
	public abstract String getEspecie();
	
	public void falar() {
		System.out.println(
		"A(o) " + getEspecie() + " " + nome + " faz " + emitirSom()
				);
	}
}
