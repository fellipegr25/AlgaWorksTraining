package PrimeiroClasse;

public class PrimeiraClasse {

	public static void main(String[] args) {

		Produto produto = new Produto();
		
		produto.nome = "Smartphone";
		
		produto.quantidadeEstoque = 9;
		
		System.out.println(produto.avaliaEstoque());
		
	}
	
}
