import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número para o calculo de seu quadrado: ");
		Integer numeroRecebido = scanner.nextInt();
		
		Integer numeroAoQuadrado = numeroRecebido * numeroRecebido;
		System.out.println("O número ao quadrado é: " + numeroAoQuadrado);
		
		scanner.close();
	}
}
