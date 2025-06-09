package tasks;

import java.util.Locale;
import java.util.Scanner;

public class Task000 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double soma = x + y;
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int resultado = a + b;
		
		int c = sc.nextInt();
		int d = sc.nextInt();
		int resultado1 = c + d;
		
		System.out.printf("Soma = %.2f%n",  soma);
		System.out.println("Soma = " +  resultado);
		System.out.println("Soma = " +  resultado1);
		
		
		sc.close();
	}

}
