import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> registroDeAlunos = new ArrayList<String>();
		
		String registrodeAluno;
		
		int i = 0;
		
		while (true) {
			System.out.println("Cadastre o aluno: ");
			registrodeAluno = scanner.nextLine();
			
			if ("x".equals(registrodeAluno)) {
				break;
			}
			
			registroDeAlunos.add(registrodeAluno);
			
			i++;
			
		}
		
		arquivoListaDeAlunos("/Users/felliperibeiro/git/AlgaWorksTraining/CursoLogicaCapitulo12/arquivo.txt", registroDeAlunos);
		
		scanner.close();
		
	}

	static void arquivoListaDeAlunos(String arquivo, ArrayList<String> linhas) throws IOException {
		Path path = Paths.get(arquivo);
		Files.write(path, linhas);
	}
	
}