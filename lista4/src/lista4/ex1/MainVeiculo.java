package lista4.ex1;

import java.util.ArrayList;

public class MainVeiculo {

	public static void main(String[] args) {
		

		Veiculo fusca = new Veiculo();		
		fusca.setNome("Fusca");
		fusca.setAno(1970);
		fusca.setNumRodas(4);
		fusca.setFabricante("Volkswagen");
		fusca.setCor("Amarelo");
		
		Veiculo van = new Veiculo();
		van.setNome("Ducato");
		van.setAno(2010);
		van.setNumRodas(4);
		van.setFabricante("Fiat");
		van.setCor("Branco");

		Veiculo moto = new Veiculo();
		moto.setNome("Biz");
		moto.setAno(2015);
		moto.setNumRodas(2);
		moto.setFabricante("Honda");
		moto.setCor("Prata");
		
		ArrayList<Veiculo> veiculos = new ArrayList<>();
		veiculos.add(fusca);
		veiculos.add(van);
		veiculos.add(moto);
		
		for(Veiculo veiculo : veiculos) {
			System.out.println(veiculo.getNome());
			System.out.println(veiculo.getAno());
			System.out.println("Numero de Rodas: " + veiculo.getNumRodas());
			System.out.println(veiculo.getFabricante());
			System.out.println(veiculo.getCor());
			System.out.println("");
		}
	}

}
