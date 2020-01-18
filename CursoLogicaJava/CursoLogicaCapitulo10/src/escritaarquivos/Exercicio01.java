package escritaarquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> tarefas = new ArrayList<String>();
		
		int i = 0;
		while (i >= 0) {
		
			System.out.println("Cadastre a " + (i + 1) + "ª Tarefa: ");
			String tarefa = scanner.nextLine();
			
			if ("x".equals(tarefa)) {
				break;
			}
			
			tarefas.add(tarefa);
			
			i++;
			
		}
		
		Path arquivo = Paths.get("/Users/felliperibeiro/git/AlgaWorksTraining/CursoLogicaCapitulo10/arquivo.txt");
		Files.write(arquivo, tarefas);
		
		scanner.close();
		
		System.out.println("Fim...");
		
	}

}
