import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a meta do faturamento anual: R$");
		Double metaFaturamentoAnual = scanner.nextDouble();
		
		System.out.print("Digite o faturamento real: R$");
		Double faturamentoReal = scanner.nextDouble();
		
		System.out.print("Digite a média salarial: R$");
		Double mediaSalarial = scanner.nextDouble();
		
		Double mediaSalariaParcial = (mediaSalarial * 80) / 100;
		Double metaParcial = (metaFaturamentoAnual * 80) / 100;
		
		Boolean atingiuMetaParaBonusTotal = faturamentoReal >= metaFaturamentoAnual;
		Boolean atingiuMetaParcial = (faturamentoReal >= metaParcial) && (faturamentoReal <= metaFaturamentoAnual);
		
		if(atingiuMetaParaBonusTotal) {
			System.out.println("O bônus recebido foi: R$" + mediaSalarial);
		} else if (atingiuMetaParcial) {
			System.out.println("O bônus será de 80%: R$" + mediaSalariaParcial);
		} else {
			System.out.println("Não há bônus a receber.");
		}
		
		scanner.close();
		
	}

}
