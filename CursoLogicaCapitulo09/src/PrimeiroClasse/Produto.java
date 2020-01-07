package PrimeiroClasse;

public class Produto {

	String nome;
	
	Integer quantidadeEstoque;
	
	String avaliaEstoque() {
		String posicaoEstoque;
		
		if (quantidadeEstoque >= 10) {
			posicaoEstoque = "Quantidade em estoque para o produto: " + nome + " esta OK! com: " + quantidadeEstoque + " unidades.";
		} else {
			posicaoEstoque = "Quantidade em estoque para o produto: " + nome + " esta baixa! com: " + quantidadeEstoque + " unidades.";
		}
		
		return posicaoEstoque;
	}
	
}
