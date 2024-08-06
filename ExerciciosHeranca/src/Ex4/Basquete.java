package Ex4;

public class Basquete extends AbstractAtleta{
	
	public Basquete() {
		super("Kamilla Cardoso","Basquete");
	}
	
	@Override
	public String getTreino() {
		return"Drible-30min|Passe-20min|Arremesso-30min";
	}
	
	public String getCompeticao() {
		return"FIBA 2024";
	}
	

}
