package ex2;

public class Main {

	public static void main(String[] args) {

		AbstractPaciente john = new Cardiovascular();
		
		john.getDoenca();
		john.getMonitoramento();
		john.getTratamento();
		john.printar();
		

		AbstractPaciente moriarty = new Respiratoria();
		
		moriarty.getDoenca();
		moriarty.getMonitoramento();
		moriarty.getTratamento();
		moriarty.printar();
		

		AbstractPaciente sherlock = new Diabetes();
		
		sherlock.getDoenca();
		sherlock.getMonitoramento();
		sherlock.getTratamento();
		sherlock.printar();

	}

}
