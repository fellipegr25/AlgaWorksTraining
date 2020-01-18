package Exercicio03;

public class PedidoDeVendas {

	public static void main(String[] args) {

		Pedido pedido = new Pedido();
		
		pedido.setCodigo(000001);
		pedido.setDesconto(10.0);
		pedido.setSubtotal(100.0);
		pedido.setTotal();
		
		System.out.println("Código: " + pedido.getCodigo());
		System.out.println("Desconto: " + pedido.getDesconto());
		System.out.println("Subtotal: " + pedido.getSubtotal());
		System.out.println("Total: " + pedido.getTotal());
	}

}
