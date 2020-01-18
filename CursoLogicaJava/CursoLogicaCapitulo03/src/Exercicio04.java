import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor unitário do produto: R$");
		Double valorProduto = scanner.nextDouble();
		
		System.out.print("Digite a quantidade de produtos: ");
		Integer quantidadeProdutos = scanner.nextInt();
		
		Double subtotal = valorProduto * quantidadeProdutos;
		
		Double desconto = 0.0;
		
		Boolean aplicaDesconto = quantidadeProdutos >= 10;
		
		if(aplicaDesconto) {
			desconto = 10.0;
		}
		
		Double valorDesconto = subtotal * desconto / 100;
		Double valorTotal = subtotal - valorDesconto;
		
		System.out.println("Subtotal: R$" + subtotal);
		System.out.println("Total: R$" + valorTotal);
		
		scanner.close();
		
	}
	
}
