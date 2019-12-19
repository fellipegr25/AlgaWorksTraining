import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite seu primeiro nomme: ");
		String nome = scanner.nextLine();
		
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = scanner.nextLine();
		
		//String nomeSobrenome = nome + ' ' + sobrenome;
		
		//System.out.println("Nome completo: " + nomeSobrenome);
		
		System.out.println("Nome completo: " + nome + ' ' + sobrenome);
		
		scanner.close();
		
	}
	
}
