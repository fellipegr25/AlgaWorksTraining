import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: R$");
		Double valorProduto = scanner.nextDouble();
		
		Double valorFrete = 0.0;
		
		Boolean valorProdutoMaiorQueCem = valorProduto >= 100;
		
		if (!valorProdutoMaiorQueCem) {
			valorFrete = 15.0;
		}
		
		Double valorTotal = valorProduto + valorFrete;
		System.out.println("O valor total com frete é de: R$" + valorTotal);
		
		scanner.close();
		
	}
	
}
