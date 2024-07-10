package ifsc;

import java.util.ArrayList;

public class MainProduto {

	public static void main(String[] args) {

		ArrayList<Produto> produtos = new ArrayList<>();

		Produto camiseta = new Produto();
		
		camiseta.getNome();
		camiseta.setNome("camiseta");
		camiseta.getCodBarras();
		camiseta.setCodBarras(12333);
		camiseta.getFornecedor();
		camiseta.setFornecedor("nike");
		camiseta.getPreco();
		camiseta.setPreco(50.65);
		
		Cliente anne = new Cliente();
		
		anne.getOpiniao();
		anne.setOpiniao("preco condiz com a qualidade");
		anne.getNota();
		anne.setNota(5);
		
		camiseta.getCliente();
		camiseta.setCliente(anne);
		
		produtos.add(camiseta);
		

		Produto legging = new Produto();
		
		legging.getNome();
		legging.setNome("legging");
		legging.getCodBarras();
		legging.setCodBarras(347775);
		legging.getFornecedor();
		legging.setFornecedor("adidas");
		legging.getPreco();
		legging.setPreco(39.99);
		
		Cliente fernanda = new Cliente();
		
		fernanda.getOpiniao();
		fernanda.setOpiniao("tecido muito fino");
		fernanda.getNota();
		fernanda.setNota(2);
		
		legging.getCliente();
		legging.setCliente(fernanda);
		
		produtos.add(legging);
		

		Produto jaqueta = new Produto();
		
		jaqueta.getNome();
		jaqueta.setNome("jaqueta");
		jaqueta.getCodBarras();
		jaqueta.setCodBarras(58834);
		jaqueta.getFornecedor();
		jaqueta.setFornecedor("nike");
		jaqueta.getPreco();
		jaqueta.setPreco(83.99);
		
		Cliente mariana = new Cliente();
		
		mariana.getOpiniao();
		mariana.setOpiniao("esquenta bastante");
		mariana.getNota();
		mariana.setNota(4);
		
		jaqueta.getCliente();
		jaqueta.setCliente(mariana);
		
		produtos.add(jaqueta);
		
		for(Produto produto : produtos) {
			
			System.out.println("Produto: " + produto.getNome());
			System.out.println("Codigo de barras: " + produto.getCodBarras());
			System.out.println("Fornecedor: " + produto.getFornecedor());
			System.out.println("Preco: " + produto.getPreco());
			System.out.println("Opiniao(cliente): " + produto.getCliente().getOpiniao());
			System.out.println("Nota(cliente): " + produto.getCliente().getNota() + "/5\n");
		}
	}

}
