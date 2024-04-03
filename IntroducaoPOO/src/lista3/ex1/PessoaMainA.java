package lista3.ex1;

public class PessoaMainA {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		
		p.cpf = "126-688-139.56";
		p.nome = "Anne Burkhardt Junkes";
		p.dataDeNascimento = "27/05/2006";
		
		System.out.println(p.cpf);
		System.out.println(p.nome);
		System.out.println(p.dataDeNascimento);

	}

}
