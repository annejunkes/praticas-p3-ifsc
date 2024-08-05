package ex2;

public class Diabetes extends AbstractPaciente{
	
	String glicemia = "128mg/dl";
	
	public Diabetes() {
		super("Sherlock Holmes", 41);
	}
	
	@Override
	public String getDoenca() {
		return "Diabetes tipo 2";
	}
	
	public String getMonitoramento() {
		return "Nível de glicemia(em jejum): " + glicemia;
	}
	
	public String getTratamento() {
		return "Tratamento: uso de antidiabéticos orais e dieta com menos açúcar";
	}
}


