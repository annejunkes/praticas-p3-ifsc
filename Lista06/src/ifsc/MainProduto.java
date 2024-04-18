package ifsc;

import java.util.ArrayList;

public class MainProduto {

	public static void main(String[] args) {

		///////////////DESKTOPS//////////////////////////////////////////////////////////////////////////////////////
		
		ArrayList<Desktop> desktops = new ArrayList<>();
		
		Desktop ryzen = new Desktop();
		ryzen.setFabricante("Dell");
		ryzen.setCodBarras(112134l);
		ryzen.setGamer(true);
	
		ArrayList<String> pecasRyzen = new ArrayList<>();
		pecasRyzen.add("CPU");
		pecasRyzen.add("Bateria");
		pecasRyzen.add("HD");
		
		ryzen.setPecas(pecasRyzen);
		
		desktops.add(ryzen);
		
		/////////////////////////////////////////////////////////////
		
		Desktop inspiron = new Desktop();
		inspiron.setFabricante("Dell");
		inspiron.setCodBarras(33412l);
		inspiron.setGamer(true);
		
		ArrayList<String> pecasInspiron = new ArrayList<>();
		pecasInspiron.add("Teclado");
		pecasInspiron.add("LED");
		pecasInspiron.add("Placa de video");
		
		inspiron.setPecas(pecasInspiron);
		
		desktops.add(inspiron);
		
		///////////////////////////////////////////////////////////////
		
		Desktop galaxy = new Desktop();
		galaxy.setFabricante("Samsung");
		galaxy.setCodBarras(687801l);
		galaxy.setGamer(false);
		
		ArrayList<String> pecasGalaxy = new ArrayList<>();
		pecasGalaxy.add("Teclado");
		pecasGalaxy.add("HD");
		pecasGalaxy.add("CPU");
		
		galaxy.setPecas(pecasGalaxy);
		
		desktops.add(galaxy);
		
		
		///////////////////SMARTPHONES/////////////////////////////////////////////////////////////////////////////////
		
		ArrayList<Smartphone> smartphones = new ArrayList<>();
		
		Smartphone redmi = new Smartphone();
		redmi.setFabricante("Xiaomi");
		redmi.setCodBarras(124467l);
		redmi.setDimensoesTela("5'(polegadas)");
		redmi.setArmazenamento(64);
		
		smartphones.add(redmi);
		
		///////////////////////////////////////////////////////////////////
		
		Smartphone iphone = new Smartphone();
		iphone.setFabricante("Apple");
		iphone.setCodBarras(345545l);
		iphone.setDimensoesTela("6'(polegadas)");
		iphone.setArmazenamento(32);
		
		smartphones.add(iphone);
		
		///////////////////////////////////////////////////////////////////
		
		Smartphone g5 = new Smartphone();
		g5.setFabricante("Motorola");
		g5.setCodBarras(122392l);
		g5.setDimensoesTela("5.7'(polegadas)");
		g5.setArmazenamento(128);
		
		smartphones.add(g5);
		
		
		///////OUTPUT////////OUTPUT///////OUTPUT///////OUTPUT//////////OUTPUT///////////////////////////////////////////
		
		System.out.println("--------Desktops---------");
		System.out.println();
		
		for(Desktop desktop : desktops) {
			
			System.out.println("Fabricante: " + desktop.getFabricante());
			System.out.println("Cod. de Barras: " + desktop.getCodBarras());
			System.out.println("Gamer: " + desktop.isGamer());
			
			System.out.println("Pecas:");
			for(String peca : desktop.getPecas()) {
			System.out.println(peca);
		}
			System.out.println();
			
		}
		
		System.out.println("--------Smartphones---------");
		System.out.println();
		
		for(Smartphone smartphone : smartphones) {
			
			System.out.println("Fabricante: " + smartphone.getFabricante());
			System.out.println("Cod. de Barras: " + smartphone.getCodBarras());
			System.out.println("Tela: " + smartphone.getDimensoesTela());
			System.out.println("Armazenamento(gb): " + smartphone.getArmazenamento());
			System.out.println();
		}

	}

}
