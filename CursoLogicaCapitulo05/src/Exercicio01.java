import java.util.Scanner;

public class Exercicio01 {
	
	static final Double NOTA_MINIMA_POR_MATERIA = 60.0;
	
	static final Double NOTA_MINIMA_TOTAL = 150.0;

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a nota de português: ");
		Double notaPortugues = scanner.nextDouble();
		
		System.out.print("Digite a nota de matemática: ");
		Double notaMatematica = scanner.nextDouble();
		
		Boolean temNotaminimaPorMateria = (notaPortugues >= NOTA_MINIMA_POR_MATERIA) && (notaMatematica >=
				NOTA_MINIMA_POR_MATERIA);
		
		Double notaTotal = notaPortugues + notaMatematica;
		
		Boolean temNotaMinimaTotal = notaTotal >= 
				NOTA_MINIMA_TOTAL;
		
		Boolean alunoPassou = temNotaminimaPorMateria && temNotaMinimaTotal;
		
		
		if(alunoPassou) {
			System.out.println("Aluno Passou! com " + notaTotal + " pontos.");
		} else {
			System.out.println("Aluno Reprovado! com " + notaTotal + " pontos.");
		}
		
		
		scanner.close();

	}

}
