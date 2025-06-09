package tasks;

import java.util.Locale;
import java.util.Scanner;

public class Task004 {

	public static void main(String[] args) {
//	Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
//	hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas 
//	decimais. 	
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int funcionarios;
		double horas;
		double valor;
		double valorTotal;
		
		funcionarios = sc.nextInt();
		horas = sc.nextDouble();
		valor = sc.nextDouble();
		
		valorTotal = horas * valor;
		
		System.out.println("Numero = " + funcionarios);
		System.out.printf("Salario = %.2f%n ", valorTotal);
		
		
		
		
		
		sc.close();
	}

}
