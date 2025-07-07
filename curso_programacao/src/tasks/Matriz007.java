package tasks;

import java.util.Locale;
import java.util.Scanner;

public class Matriz007 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();

		int[][] mat = new int[M][N];

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		int fila = sc.nextInt();
		fila = fila - 1;

		int ultimo = mat[fila][N - 1];

		for (int j = N - 1; j > 0; j--) {
			mat[fila][j] = mat[fila][j - 1];
		}
		mat[fila][0] = ultimo;

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
