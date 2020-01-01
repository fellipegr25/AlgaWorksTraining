import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");		
		Integer idade = scanner.nextInt();
		
		System.out.print("Digite o tempo de contribuição: ");
		Integer tempoContribuicao = scanner.nextInt();
		
		Boolean podeAposentar = idade >= 55 && tempoContribuicao >= 25;
		
		if(podeAposentar){
			System.out.println("Sim, pode aposentar!");
		}else {
			System.out.println("Não, pode aposentar!");
		}
		
		scanner.close();
		
	}

}
