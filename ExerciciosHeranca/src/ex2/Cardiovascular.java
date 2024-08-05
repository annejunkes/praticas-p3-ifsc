package ex2;

public class Cardiovascular extends AbstractPaciente{
	
	String pressaoArterial = "130 x 80 mmHg";
	
	public Cardiovascular() {
		super("John Watson", 43);
	}
	
	@Override
	public String getDoenca() {
		return "Hipertensao";
	}
	
	public String getMonitoramento() {
		return "Pressao arterial: " + pressaoArterial;
	}
	
	public String getTratamento() {
		return "Tratamento: Dieta pobre em sal e visitas frequentes no clinico geral";
	}
}
