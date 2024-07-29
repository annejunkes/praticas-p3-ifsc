package poo;

public class Paciente extends AbstractPessoa{
	
	String codigo;
	
	
	public Paciente(String nome, String cpf,String codigo) {
		super(nome,cpf);
		this.codigo=codigo;
		System.out.println("Criando paciente: " + nome);
	}
	
	public Paciente(String nome, String cpf) {
		this(nome,cpf,"1");
	}
	
	public void print() {
		System.out.println("===========");
		super.print();
		System.out.println("Codigo: " + codigo);
		System.out.println("===========");
	}
	
	@Override
	public String toString() {
		String res = "Nome: " + nome;
		res+="\n";
		res+="CPF: " + cpf;
		res+="\n";
		res+="Codigo: " + codigo;
		
		System.out.println();
		
		return res;
	}

}
