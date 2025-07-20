package curso_programacao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class aula032FileWriter_BufferedWriter {

	public static void main(String[] args) {

		String[] lines = new String[] { "Good Morning", "Good Afternoon", "Good Night" };

		String path = "C:\\\\Users\\\\Guilherme\\\\Desktop\\\\PDF-logica de Programação\\\\aula1.txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
