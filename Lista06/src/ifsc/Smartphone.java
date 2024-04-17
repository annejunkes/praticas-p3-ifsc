package ifsc;

public class Smartphone extends Produto{
	
	private String dimensoesTela;
	private int armazenamento;
	
	public String getDimensoesTela() {
		return dimensoesTela;
	}
	
	public int getArmazenamento() {
		return armazenamento;
	}
	
	public void setDimensoesTela(String dimensoesTela) {
		this.dimensoesTela = dimensoesTela;
	}
	
	public void setArmazenamento(int armazenamento) {
		this.armazenamento = armazenamento;
	}

}
