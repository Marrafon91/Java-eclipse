package tasks;

import java.util.Scanner;

public class Task007 {

	public static void main(String[] args) {
//		Fazer um programa para ler um número inteiro,e 
//		depois dizer se este número é negativo ou não.
		
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		if(numero < 0) {
			System.out.println("Negativo");
		} else {
			System.out.println("Não Negativo");
		}
		
		sc.close();

	}

}
