import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		imprimirTraco();
		
		String[] cursos = new String[] {"JavaEE", "Spring", "Java OO Avançado"};
		
		System.out.println("Escolha dentre os cursos abaixo: ");
		
		for (int i = 0; i < cursos.length; i++) {
			System.out.println("[" + i + "]" + cursos[i]);
		}
		
		System.out.print("O curso que você deseja é o: ");
		Integer posicaoCursoEscolhido = scanner.nextInt();
		
		Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;
		
		if (!posicaoValida) {
			System.err.println("Posição inválida!");
			System.exit(1);
		}
		
		imprimirTraco();
		
		String[] formasPagamento = new String[] {"Cartão", "Boleto"};
		
		System.out.println("Escolha dentre as formas de pagamento abaixo: ");
		
		for (int i = 0; i < formasPagamento.length; i++) {
			System.out.println("[" + i + "]" + formasPagamento[i]);
		}
		
		System.out.print("Sua forma de pagamento escolhida é: ");
		Integer posicaoFormaDePagamentoEscolhida = scanner.nextInt();
		
		posicaoValida = posicaoFormaDePagamentoEscolhida >= 0 
				&& posicaoFormaDePagamentoEscolhida < formasPagamento.length;
		
		if (!posicaoValida) {
			System.err.println("Posição inválida!");
			System.exit(1);
		}
		
		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String formaPagamentoEscolhido = formasPagamento[posicaoFormaDePagamentoEscolhida];
		
		imprimirTraco();
		
		System.out.println("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhido);
		
		scanner.close();
		
	}

	static void imprimirTraco() {
		System.out.println("----------------------------------------");
	}
	
}
