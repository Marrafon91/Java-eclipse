package tasks;

import java.util.Locale;
import java.util.Scanner;

public class Task024 {

	public static void main(String[] args) {
//	Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas, 
//	começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme 
//	exemplo. 
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			 
			int primeiro = i;
			int segundo = i * i;
			int terceiro = i * i * i;
			System.out.printf("saida: %-5d saida: %-7d saida: %-10d%n", primeiro, segundo, terceiro);			
		}
		
		sc.close();

	}

}
