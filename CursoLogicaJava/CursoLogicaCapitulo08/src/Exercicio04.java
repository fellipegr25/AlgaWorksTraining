import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
										
		imprimirNaMesmaLinha("Digite um número inteiro: ");
		Integer numero = scanner.nextInt();
		
		imprimirProximaLinha("----------------------------");
		
		imprimirTabuada(numero, 0);
		
		scanner.close();

	}
	
	static void imprimirNaMesmaLinha(String texto) {
		System.out.print(texto);
	}
	
	static void imprimirProximaLinha(String texto) {
		System.out.println(texto);
	}
	
	static void imprimirTabuada(Integer multiplicando, Integer multiplicador) {
		System.out.println(multiplicando + " x " + multiplicador + " = " + (multiplicando * multiplicador));
		
		if (++multiplicador <= 10) {
			imprimirTabuada(multiplicando, multiplicador);
		}
		
	}
	
}
