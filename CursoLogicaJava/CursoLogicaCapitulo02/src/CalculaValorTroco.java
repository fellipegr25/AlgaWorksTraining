import console.Interacao;

public class CalculaValorTroco {
	public static void main(String[] args) {

		Interacao interacao = new Interacao();
		
		Double valorProduto = interacao.LerDecimal("Digite o valor do produto: ");

		Double valorPassadoPeloCliente = interacao.LerDecimal("Digite o valor passado pelo cliente: ");
		
		Double valorTroco = valorPassadoPeloCliente - valorProduto;
		
		interacao.imprimir("Valor do troco: R$" + valorTroco);
		
		interacao.fechar();
		

	}
}
