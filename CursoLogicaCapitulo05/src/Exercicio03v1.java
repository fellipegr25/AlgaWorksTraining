import java.util.Scanner;

public class Exercicio03v1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número entre 1 e 7, referente ao dia da semana: ");
		Integer diaSelecionado = scanner.nextInt();
		
		String diaDaSemana = null;
		
		switch (diaSelecionado) {
		case 1: diaDaSemana = "Domingo";
			break;
		case 2: diaDaSemana = "Segunda-feira";
			break;
		case 3: diaDaSemana = "Terça-feira";
			break;
		case 4: diaDaSemana = "Quarta-feira";
			break;
		case 5: diaDaSemana = "Quinta-feira";
			break;
		case 6: diaDaSemana = "Sexta-feira";
			break;
		case 7: diaDaSemana = "Sábado";
			break;
		
		default:
			System.err.println("Digite um número correspondente.");
			System.exit(1);
		}

		System.out.println("O dia selecionado foi: " + diaDaSemana);
		
		scanner.close();
		
	}

}
