import java.util.Scanner;

public class CalculaValorTroco {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.print("Digite o valor passado pelo cliente: ");
		Double valorPassadoPeloCliente = scanner.nextDouble();
		
		Double valorTroco = valorPassadoPeloCliente - valorProduto;
		
		System.out.println("Valor do troco: R$" + valorTroco);
		
		scanner.close();
	}
}
