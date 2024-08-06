package Ex4;

public class Futebol extends AbstractAtleta{
	
	public Futebol() {
		super("Pedro Guilherme Abreu dos Santos","Futebol");
	}
	
	@Override
	public String getTreino() {
		return"Drible-45min|Agilidade-30min|Resistência-30min";
	}
	
	public String getCompeticao() {
		return"Brasileirão: Flamengo x Palmeiras";
	}

}
