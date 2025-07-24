package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

import services.PrintService;

public class aula039generics {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		PrintService<String> ps = new PrintService<>();

		System.out.print("How many value: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			String value = sc.next();
			ps.addValue(value);
		}

		ps.print();
		String x = ps.first();
		System.out.println("Frist: " + x);

		sc.close();
	}

}
