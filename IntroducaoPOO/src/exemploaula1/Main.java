package anne;

public class Main {

	public static void main(String[] args) {
		
		//instanciar classe
		Pessoa thalles = new Pessoa();		
		thalles.cpf = "123456";
		thalles.primeiroNome = "Thalles";
		thalles.sobrenome = "Santos";
		
		Pessoa fernanda = new Pessoa();		
		fernanda.cpf = "696969";
		fernanda.primeiroNome = "Fernanda";
		fernanda.sobrenome = "Serafim";
		
		System.out.println(thalles.cpf);
		System.out.println(thalles.primeiroNome);
		System.out.println(thalles.sobrenome);
	}

}
