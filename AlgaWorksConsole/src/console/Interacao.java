package console;

import java.util.Scanner;

public class Interacao {

		Scanner scanner = new Scanner(System.in);
		
		public Integer LerNumero(String texto) { 
			System.out.print(texto);
			return scanner.nextInt();
		}
		
		public Double LerDecimal(String texto) {
			System.out.print(texto);
			return scanner.nextDouble();
		}
		
		public String LerLinha(String texto) {
			System.out.print(texto);
			return scanner.nextLine();
		}
			
		public void fechar() {
			scanner.close();
		}
	
		public void imprimir(String texto) {
			System.out.println(texto);
		}
		
		public void erro(String texto) {
			System.err.println(texto);
		}
		
}
