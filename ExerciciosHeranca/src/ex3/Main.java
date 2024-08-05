package ex3;

public class Main {

	public static void main(String[] args) {

		AbstractMembro laios = new Aluno();
		
		laios.getAcao();		
		laios.printar();
		

		AbstractMembro chilchuck = new Funcionario();
		
		chilchuck.getAcao();		
		chilchuck.printar();
		

		AbstractMembro marcille = new Professor();
		
		marcille.getAcao();		
		marcille.printar();

}
}
