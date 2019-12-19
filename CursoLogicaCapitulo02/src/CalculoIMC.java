import java.util.Scanner;

public class CalculoIMC {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite seu peso em Kilos: ");
		Double peso = scanner.nextDouble();
		
		System.out.print("Digite sua altura em metros: ");
		Double altura = scanner.nextDouble();
		
		Double valorIMC = peso / (altura * altura);
		System.out.println("Seu IMC: " + valorIMC);
		
		scanner.close();
		
	}
	
}
