import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		
		String[] tarefasDoDia = new String[5];
		
		for (int i = 0; i < tarefasDoDia.length; i++) {

			
			System.out.print("Digite a "+ (i + 1) + "ª tarefa: ");
			tarefasDoDia[i] = scanner.nextLine();
						
		}
		
		System.out.println("=======================================");
		
		System.out.println("As cinco tarefas mais importantes do dia: ");
		
		System.out.println("=======================================");
		
		for (int i = 0; i < tarefasDoDia.length; i++) {
			System.out.println((i + 1) + "ª Tarefa: " + tarefasDoDia[i]);
		}
		
		scanner.close();
	}

}
