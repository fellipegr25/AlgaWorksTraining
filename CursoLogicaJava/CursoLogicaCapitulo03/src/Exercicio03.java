import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a nota do aluno: ");
		Double notaAluno = scanner.nextDouble();
		
		Boolean notaAprovacao = notaAluno >= 70;
		
		if(notaAprovacao) {
			System.out.println("Aluno aprovado!");
		}else {
			System.out.println("Aluno reprovado!");
		}
		
		scanner.close();
	}
	
}
