import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
				
		Double primeiroNumero = informeNumero(scanner);
		
		imprimirTraco();
		
		Integer selecionaOperacao = escolhaAOperacao(scanner);
				
		imprimirTraco();
		
		Double segundoNumero = informeNumero(scanner);
		
		imprimirTraco();
		
		Double resultado = realizaCalculo(selecionaOperacao, primeiroNumero, segundoNumero);
		
		imprimir("Resultado: " + resultado);
		
		scanner.close();
		
	}
	
	static void imprimirTraco () {
		System.out.println("======================================");
	}

	static void imprimir (String texto) {
		System.out.println(texto);
	}
	
	static void imprimirMesmaLinha (String texto) {
		System.out.print(texto);
	}
	
	static Double realizaCalculo(Integer operacao, Double primeiroNumero, Double segundoNumero) {
		Double resultado = null;
		
		switch (operacao) {
		case 1:
			resultado = soma(primeiroNumero, segundoNumero);
			break;
		case 2:
			resultado = subtracao(primeiroNumero, segundoNumero);
			break;
		case 3:
			resultado = multiplicacao(primeiroNumero, segundoNumero);
			break;
		case 4:
			resultado = divisao(primeiroNumero, segundoNumero);
			break;

		default:
			System.err.println("Escolha inválida!");
			System.exit(1);
		}
		
		return resultado;
	}
	
	static Double soma(Double primeiroNumero, Double segundoNumero) {
		return primeiroNumero + segundoNumero;
	}
	static Double subtracao(Double primeiroNumero, Double segundoNumero) {
		return primeiroNumero - segundoNumero;
	}
	static Double multiplicacao(Double primeiroNumero, Double segundoNumero) {
		return primeiroNumero * segundoNumero;
	}
	static Double divisao(Double primeiroNumero, Double segundoNumero) {
		return primeiroNumero / segundoNumero;
	}
	
	static Integer escolhaAOperacao(Scanner scanner) {
		System.out.println("Escolha a operação");
		
		String[] escolherOperacoes = new String[] {"Soma", "Subtracao", "Multiplicação", "Divisão"};
		
		for (int i = 0; i < escolherOperacoes.length; i++) {
			imprimir("[" + (i + 1) + "]" + escolherOperacoes[i]);
		}
				
		System.out.print("Digite a operação: ");
		
		return scanner.nextInt();
	}
	
	static Double informeNumero (Scanner scanner) {
		System.out.print("Informe o número: ");
		return scanner.nextDouble();
	}
		
}
