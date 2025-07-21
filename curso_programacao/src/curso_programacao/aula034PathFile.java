package curso_programacao;

import java.io.File;
import java.util.Scanner;

public class aula034PathFile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("Nome: " + path.getName());		
		System.out.println("Caminho: " + path.getParent());		
		System.out.println("Caminho Inteiro: " + path.getPath());		
		
		sc.close();
	}
}
