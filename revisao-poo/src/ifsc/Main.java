package ifsc;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Tutor> tutores = new ArrayList<>();
		
		Tutor t1 = new Tutor();
		t1.getNomeCompleto();
		t1.setNomeCompleto("Camila Burkhardt Rosa");
		
		Gato g1 = new Gato();
		
		t1.getGato();
		t1.setGato(g1);
		
		g1.getClasse();
		g1.setClasse("Mammalia");	
		g1.getNomeCientifico();
		g1.setNomeCientifico("Felis catus");
		g1.getApelido();
		g1.setApelido("Garfield");
		g1.getPedigree();
		g1.setPedigree("Scottish Fold");
		
		tutores.add(t1);
		
		//////////////////////////////////////////////////
		
		Tutor t2 = new Tutor();
		t2.getNomeCompleto();
		t2.setNomeCompleto("Fabiano Marcelo Junkes");
		
		Gato g2 = new Gato();
		
		t2.getGato();
		t2.setGato(g2);
		
		g2.getClasse();
		g2.setClasse("Mammalia");
		g2.getNomeCientifico();
		g2.setNomeCientifico("Felis catus");
		g2.getApelido();
		g2.setApelido("Nathalia Dolberth");
		g2.getPedigree();
		g2.setPedigree("Munchkin");
		
		tutores.add(t2);
		
		////////////////////////////////////////////////////
		
		Tutor t3 = new Tutor();
		t3.getNomeCompleto();
		t3.setNomeCompleto("Amabile Burkhardt");
		
		Gato g3 = new Gato();
		
		t3.getGato();
		t3.setGato(g3);
		
		g3.getClasse();
		g3.setClasse("Mammalia");
		g3.getNomeCientifico();
		g3.setNomeCientifico("Felis catus");
		g3.getApelido();
		g3.setApelido("Muad D'ib");
		g3.getPedigree();
		g3.setPedigree("Himalaio");
		
		tutores.add(t3);
		
		for(Tutor tutor : tutores) {
			
			System.out.println("Nome do Tutor: " + tutor.getNomeCompleto());
			System.out.println("Classe do gato: " + tutor.getGato().getClasse());
			System.out.println("Nome cientifico: " + tutor.getGato().getNomeCientifico());
			System.out.println("Apelido do gato: " + tutor.getGato().getApelido());
			System.out.println("Pedigree: " + tutor.getGato().getPedigree() + "\n");
			
			
		}
		
	}

}
