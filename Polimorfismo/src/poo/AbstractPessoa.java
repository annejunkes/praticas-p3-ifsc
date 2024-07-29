package poo;

public abstract class AbstractPessoa {
	
	String nome;
	String cpf; 
	Endereco endereco;
	
	public AbstractPessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public void print() {
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
	}
}

	

