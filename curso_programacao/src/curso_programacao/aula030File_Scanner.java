package curso_programacao;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class aula030File_Scanner {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = null;

		File file = new File("C:\\Users\\Guilherme\\Desktop\\PDF-logica de Programação\\aula.txt");

		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			if (sc != null)
			sc.close();
		}
	}
}
