package ifsc;

public abstract class Animal {
	
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	public String getNomeCientifico() {
		return nomeCientifico;
	}
	public void setNomeCientifico(String nomeCientifico) {
		this.nomeCientifico = nomeCientifico;
	}
	private String classe;
	private String nomeCientifico;

}
