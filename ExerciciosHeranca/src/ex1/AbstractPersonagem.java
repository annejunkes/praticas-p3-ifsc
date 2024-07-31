package ex1;

public abstract class AbstractPersonagem {
	
	String nome;
	int dano;
	
	public AbstractPersonagem(String nome, int dano) {
		this.nome=nome;
		this.dano=dano;
	}
	
	public abstract String getPersonagem();
	
	public abstract String getAtaque();
	
	public void printarAtaque() {
		System.out.println("O" + getPersonagem() + "" + nome + getAtaque() + dano + "\n");
	}
}
