import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite abaixo o valor dos gastos com: ");
		
		Double total = 0.0;
		
		System.out.print("Luz: R$");
		total += scanner.nextDouble();
		
		System.out.print("Água: R$");
		total += scanner.nextDouble();
		
		System.out.print("Telefone: R$");
		total += scanner.nextDouble();
		
		System.out.print("Escola: R$");
		total += scanner.nextDouble();
		
		System.out.print("Fatura do cartão: R$");
		total += scanner.nextDouble();
		
		System.out.print("Mercado: R$");
		total += scanner.nextDouble();
		
		System.out.println("Seu gasto mensal é de: R$" + total);

		scanner.close();
		
	}
	
}
