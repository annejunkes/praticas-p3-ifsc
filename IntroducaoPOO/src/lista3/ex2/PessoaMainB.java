package lista3.ex2;

import java.util.Scanner;

public class PessoaMainB {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Pessoa[] pessoas = new Pessoa[2];
		
		for(int i=0; i<pessoas.length; i++) {
			
			Pessoa p = new Pessoa();
			
			System.out.println("Digite nome:");
			p.nome= scan.nextLine();
			
			System.out.println("Digite CPF:");
			String cpfTxt = scan.nextLine();
			p.cpf = Long.valueOf(cpfTxt);
			
			System.out.println("Digite data de nascimento:");
			p.dataDeNascimento = scan.nextLine();
			pessoas[i]=p;			
		}
		
		for(int i=0; i<pessoas.length; i++) {
			
			System.out.println("Nome da Pessoa "+ (i+1) +":" + pessoas[i].nome);
			System.out.println("CPF da Pessoa "+ (i+1) +":" + pessoas[i].cpf);
			System.out.println("Data de Nascimento da Pessoa "+ (i+1) +":" + pessoas[i].dataDeNascimento);
		}
		
	}

}
