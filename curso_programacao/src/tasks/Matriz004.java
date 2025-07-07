package tasks;

import java.util.Locale;
import java.util.Scanner;

public class Matriz004 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[][] mat = new int[N][N];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		int soma = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = i + 1; j < mat[i].length; j++) {
				soma += mat[i][j];
			}
		}
		System.out.println(soma);
		sc.close();
	}
}
