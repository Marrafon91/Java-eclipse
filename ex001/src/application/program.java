package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangle;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Retangle retangle = new Retangle();

		System.out.println("Entre com a largura e altura do retangulo: ");
		retangle.base = sc.nextDouble();
		retangle.altura = sc.nextDouble();

		System.out.printf("AREA = %.2f%n", retangle.area());
		System.out.printf("PERIMETRO = %.2f%n", retangle.perimetro());
		System.out.printf("DIAGONAL = %.2f%n", retangle.diagonal());
		sc.close();
	}
}
