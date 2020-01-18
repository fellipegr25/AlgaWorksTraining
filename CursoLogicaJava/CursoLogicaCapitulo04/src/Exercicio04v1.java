import java.util.Scanner;

public class Exercicio04v1 {

	static final Integer IDADE_MINIMA_PARA_APOSENTAR = 55;
	
	static final Integer TEMPO_MINIMO_DE_CONTRIBUICAO = 25;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a idade: ");
		Integer idade = scanner.nextInt();
		
		System.out.print("Digite o tempo de contribuição: ");
		Integer contribuicao = scanner.nextInt();
		
		Boolean temIdadeParaAposentar = idade >= IDADE_MINIMA_PARA_APOSENTAR;
		
		Boolean temTempoDeContribuicao = contribuicao >= TEMPO_MINIMO_DE_CONTRIBUICAO;
		
		Boolean podeAposentar = temIdadeParaAposentar && temTempoDeContribuicao;
		
		if(podeAposentar) {
			System.out.println("Sim, pode aposentar!");
		}else {
			System.out.println("Não, pode aposentar!");
		}
		
		scanner.close();

	}

}
