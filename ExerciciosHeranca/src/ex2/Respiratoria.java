package ex2;

public class Respiratoria extends AbstractPaciente{
	
	String inflamacao = "leve";
	
	public Respiratoria() {
		super("James Moriarty", 38);
	}
	
	@Override
	public String getDoenca() {
		return "Asma";
	}
	
	public String getMonitoramento() {
		return "Inflamacao dos bronquios: " + inflamacao;
	}
	
	public String getTratamento() {
		return "Tratamento: uso de broncodilatadores e anti-inflamatórios";
	}
}


