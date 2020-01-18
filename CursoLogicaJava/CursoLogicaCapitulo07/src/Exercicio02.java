import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Double[] semanaUm = new Double[7]; 
		Double[] semanaDois = new Double[7]; 
		Double[] semanaTres = new Double[7]; 
		Double[] semanaQuatro = new Double[7]; 
		
		Double[][] mes = new Double[][]{semanaUm, semanaDois, semanaTres, semanaQuatro};
		
		Double maiorFaturamento = 0.0;
		Integer semanaDeMaiorFaturamento = null;
		
		for (int i = 0; i < mes.length; i++) {
			System.out.println("Preencha o faturamento para a " + (i + 1) + "ª semana do mês: ");
			
			Double[] semana = mes[i];
			
			for (int j = 0; j < semana.length; j++) {
			
				System.out.print("Entre com o faturamento para o " + (j + 1) + "º dia da semana: ");
				semana[j] = scanner.nextDouble();
												
			}
			
		}
		
		System.out.println("==========================================");
		
		System.out.println("Faturamento total por semana: ");
		
		System.out.println("==========================================");
		
		for (int i = 0; i < mes.length; i++) {
			
			Double[] semana = mes[i];
			
			Double soma = 0.0;
			
			for (int j = 0; j < semana.length; j++) {
				
			soma += semana[j];
							
			}
				
			System.out.println("Total para " + (i + 1) + "ª semana: R$ " + soma);

			Boolean eOMaiorFaturamento = soma > maiorFaturamento; 
			
			if (eOMaiorFaturamento) {
				maiorFaturamento = soma;
				semanaDeMaiorFaturamento = i + 1;
			}
		}
		
		System.out.println("==========================================");

		System.out.println("Semana de maior faturmanto " + semanaDeMaiorFaturamento + " total " + maiorFaturamento);
		
		scanner.close();

	}

}
