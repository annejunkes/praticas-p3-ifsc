package poo;

public class Main {

	public static void main(String[] args) {

		AbstractPessoa p = new Paciente("Duque Leto", "123", "666");
		
		System.out.println(p.nome);
		System.out.println(p.cpf);
		System.out.println(((Paciente)p).codigo);
		
		//Formas de casting
				Paciente paciente = (Paciente)p;
				System.out.println(paciente.codigo);
		
		p.print();
		
	}

}
