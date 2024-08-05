package ex2;

public abstract class AbstractPaciente {
	
	String nome;
	int idade;
	
	public AbstractPaciente(String nome, int idade) {
		this.nome= nome;
		this.idade=idade;
		
	}
	public abstract String getDoenca();
	public abstract String getMonitoramento();
	public abstract String getTratamento();
	
	public void printar() {
		System.out.println("Paciente: " + nome);
		System.out.println("Idade: "+ idade);
		System.out.println("Doenca: " + getDoenca());
		System.out.println(getMonitoramento());
		System.out.println(getTratamento()+"\n");
	}
	

}
