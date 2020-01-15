import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import jdk.nashorn.internal.runtime.ListAdapter;

public class Exercicio01 {
	
	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
				
//		ListaAlunos listaAlunos = new ListaAlunos();
		
		ArrayList<String> registroDeAlunos = new ArrayList<String>();
		
		String registrodeAluno;
		
		int tamanhoDaLista = 0;
		
		while (true) {
			System.out.print("Cadastre o aluno: ");
			registrodeAluno = scanner.nextLine();
			
			if ("x".equals(registrodeAluno)) {
				System.out.println("Cadastro concluido.");
				break;
			}
			
			registroDeAlunos.add(registrodeAluno);
			
			tamanhoDaLista++;
			
		}
		
		criaArquivoListaDeAlunos("/Users/felliperibeiro/git/AlgaWorksTraining/CursoLogicaCapitulo12/arquivo.txt", registroDeAlunos);
		
		scanner.close();
		
		System.out.println("---------------------------------------------");
		
		System.out.println("Lista de Alunos");
		acessaListaDeAlunos("/Users/felliperibeiro/git/AlgaWorksTraining/CursoLogicaCapitulo12/arquivo.txt", registroDeAlunos);
		
		
		
	}

	static void acessaListaDeAlunos(String arquivo, List<String> registros) throws IOException {
		Path path = Paths.get(arquivo);
		registros = Files.readAllLines(path);
		
		for (int i = 0; i < registros.size(); i++) {
			String registro = registros.get(i);
			
			System.out.println(registro);
		}
	}
	
	static void criaArquivoListaDeAlunos(String arquivo, ArrayList<String> registros) throws IOException {
		Path path = Paths.get(arquivo);
		Files.write(path, registros);
	}
	
	void ordenaListaDeAlunos(String arquivo, ArrayList<String> registros) throws IOException {
		acessaListaDeAlunos(arquivo, registros);
		
		Integer[] quantidadeDaLista;
		
		for (int i = 0; i <registros.size() ; i++) {
			
			int posicaoRegistro = quantidadeDaLista[i]; 
			
			while(posicaoRegistro > 0) {
				int posicaoRegistoAnterior = posicaoRegistro - 1;
				
				
			}
		}
		
	}
	
}