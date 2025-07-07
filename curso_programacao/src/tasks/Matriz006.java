package tasks;

import java.util.Locale;
import java.util.Scanner;

public class Matriz006 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		double[][] mat = new double[N][N];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextDouble();
			}
		}

		double positivos = 0.0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] > 0) {
					positivos += mat[i][j];
				}
			}
		}

		int linha = sc.nextInt();
		int coluna = sc.nextInt();

		System.out.printf("SOMA DOS POSITIVOS: %.1f%n", positivos);

		System.out.print("LINHA ESCOLHIDA: ");
		for (int j = 0; j < mat.length; j++) {
			System.out.printf("%.1f ", mat[linha][j]);
		}

		System.out.println();
		System.out.print("COLUNA ESCOLHIDA: ");
		for (int i = 0; i < mat.length; i++) {
			System.out.printf("%.1f ", mat[i][coluna]);
		}

		System.out.println();
		System.out.print("DIAGONAL PRINCIPAL: ");
		for (int i = 0; i < mat.length; i++) {
			System.out.printf("%.1f ", mat[i][i]);
		}

		System.out.println();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0.0) {
					mat[i][j] *= mat[i][j];
				}
			}
		}
		System.out.println("MATRIZ ALTERADA: ");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.printf("%.1f ", mat[i][j]);
			}
			System.out.println();
		}
		sc.close();
	}

}
