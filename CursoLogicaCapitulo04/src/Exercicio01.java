import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		Double primeiroValor = scanner.nextDouble();
		
		System.out.print("Selecione a operação: 1 'Adição' 2 'Subtração' 3 'Multiplicação' 4 'Divisão' ");
		Integer operacao = scanner.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		Double segundoValor = scanner.nextDouble();
		
		Double resultado = null;
		
		if (operacao.equals(1)) {
			resultado = primeiroValor + segundoValor;
		}
		if (operacao.equals(2)) {
			resultado = primeiroValor - segundoValor; 
		}
		if (operacao.equals(3)) {
			resultado = primeiroValor * segundoValor;
		}
		if (operacao.equals(4)) {
			resultado = primeiroValor / segundoValor;
		}
		
		System.out.println("Resultado: " + resultado);
		
		scanner.close();
		
	}
	
}
