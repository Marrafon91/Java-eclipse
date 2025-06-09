package tasks;

import java.util.Locale;
import java.util.Scanner;

public class Task005 {

	public static void main(String[] args) {
//	Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o 
//	código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago. 	
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo1, quantidade1,codigo2, quantidade2;
		double preco1, preco2;
		double resultado;
		
		codigo1 = sc.nextInt();
		quantidade1 = sc.nextInt();
		preco1 = sc.nextDouble();
				
		codigo2 = sc.nextInt();
		quantidade2 = sc.nextInt();
		preco2 = sc.nextDouble();
		
		resultado = quantidade1 * preco1 + quantidade2 * preco2;
		
		System.out.printf("Valor a Pagar: %.2f%n", resultado);
				
		sc.close();
	}

}
