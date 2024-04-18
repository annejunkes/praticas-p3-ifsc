package lista4.ex1;

public class Veiculo {
	
	private String nome;
	private Integer ano;
	private Integer numRodas;
	private String fabricante;
	private String cor;
	
	
	public String getNome() {
		return nome;		
	}
	
	public Integer getAno() {
		return ano;
	}
	
	public Integer getNumRodas() {
		return numRodas;
	}
	
	public String getFabricante() {
		return fabricante;
	}
	
	public String getCor() {
		return cor;
	}
	

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	
	public void setNumRodas(Integer numRodas) {
		this.numRodas = numRodas;
	}
	
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
}
