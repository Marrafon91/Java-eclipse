package curso_programacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product040;
import services.CaculationService;

public class aula040genericsDelimitados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product040> list = new ArrayList<>();

		String path = "C:\\Users\\Guilherme\\Desktop\\File\\praticando1.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Product040(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			Product040 x = CaculationService.max(list);
			System.out.println("Most Expensive:");
			System.out.println(x);
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}
}
