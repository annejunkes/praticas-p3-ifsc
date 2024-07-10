package ifsc;

public class Produto {
	
	private String nome;
	private long codBarras;
	private double preco;
	private String fornecedor;
	private Cliente cliente;
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getCodBarras() {
		return codBarras;
	}
	public void setCodBarras(long codBarras) {
		this.codBarras = codBarras;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

}
