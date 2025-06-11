package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class aula007_debug {

	public static void main(String[] args) {
//		Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma 
//		mensagem explicativa, conforme exemplos. 
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);
		
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("Area = %.2f%n",  area);
		System.out.printf("Preço = %.2f%n",  preco);
		
		
		sc.close();
	}

}
