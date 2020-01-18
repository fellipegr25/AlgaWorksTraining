import java.util.Scanner;

public class Exercicio05 {
	
	static final Integer NOTA_MINIMA_PARA_PASSAR_DE_ANO = 70;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a nota do aluno: ");
		Double notaAluno = scanner.nextDouble();
		
		Boolean notaAprovacao = notaAluno >= NOTA_MINIMA_PARA_PASSAR_DE_ANO;
		
		if(notaAprovacao) {
			System.out.println("Aluno aprovado!");
		}else {
			System.out.println("Aluno reprovado!");
		}
		
		scanner.close();
	}
}
