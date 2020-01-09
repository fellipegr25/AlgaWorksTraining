package escritaarquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01v1 {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> tarefas = new ArrayList<String>();
		
		String tarefa;
		
		int i = 0;
		while (true) {
		
			System.out.println("Cadastre a " + (i + 1) + "ª Tarefa: ");
			tarefa = scanner.nextLine();
			
			if ("x".equals(tarefa)) {
				break;
			}
			
			tarefas.add(tarefa);
			
			i++;
			
		}
		
		escreverNoArquivo("/Users/felliperibeiro/git/AlgaWorksTraining/CursoLogicaCapitulo10/arquivo.txt", tarefas);
		
		scanner.close();
		
		System.out.println("Fim...");
		
	}
	
	static void escreverNoArquivo(String arquivo, ArrayList<String> linhas) throws IOException{
		Path path = Paths.get(arquivo);
		Files.write(path, linhas);
	}

}
