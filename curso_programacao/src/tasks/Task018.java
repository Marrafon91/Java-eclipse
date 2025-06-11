package tasks;

import java.util.Scanner;

public class Task018 {

	public static void main(String[] args) {
//		Leia um valor inteiro X (1 <= X <= 10). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o 
//		X, se for o caso. 
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
				
		for(int i = 1; i <= x; i++) {
						
			if(i % 2 != 0) {
				System.out.println("Numero: " + (i) + " Impar " );
			} 
		}
		
		sc.close();

	}

}
