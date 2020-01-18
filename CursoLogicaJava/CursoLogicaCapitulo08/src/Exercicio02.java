import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in);
		
		imprimirTraco();
		
		String[] cursos = new String[] {"JavaEE", "Spring", "Java OO Avançado"};
		
		imprimir("Escolha dentre os cursos abaixo: ");
		
		iteraElementosArray(cursos);
		
		imprimirNaMesmaLinha("O curso que você deseja é o: ");
		Integer posicaoCursoEscolhido = scanner.nextInt();
		
		Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;
		
		if (!posicaoValida) {
			encerraPrograma();
		}
		
		imprimirTraco();
		
		String[] formasPagamento = new String[] {"Cartão", "Boleto"};
		
		imprimir("Escolha dentre as formas de pagamento abaixo: ");
		
		iteraElementosArray(formasPagamento);
		
		imprimirNaMesmaLinha("Sua forma de pagamento escolhida é: ");
		Integer posicaoFormaDePagamentoEscolhida = scanner.nextInt();
		
		posicaoValida = posicaoFormaDePagamentoEscolhida >= 0 
				&& posicaoFormaDePagamentoEscolhida < formasPagamento.length;
		
		if (!posicaoValida) {
			encerraPrograma();
		}
		
		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String formaPagamentoEscolhido = formasPagamento[posicaoFormaDePagamentoEscolhida];
		
		imprimirTraco();
		
		imprimir("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhido);
		
		scanner.close();
		
	}

	static void imprimirTraco() {
		System.out.println("----------------------------------------");
	}
	
	static void encerraPrograma() {
		System.err.println("Posição inválida!");
		System.exit(1);
	}
	
	static void iteraElementosArray(String[] texto) {
		for (int i = 0; i < texto.length; i++) {
			System.out.println("[" + i + "]" + texto[i]);
		}
	}
	
	static void imprimir(String texto) {
		System.out.println(texto);
	}
	
	static Boolean verificaPosicaoEscolhida(Integer posicao, String[] vetor) {
		Boolean posicaoValida = posicao >= 0 && posicao < vetor.length;
		return posicaoValida;
	}
	
	static void imprimirNaMesmaLinha(String texto) {
		System.out.print(texto);
	}

}
