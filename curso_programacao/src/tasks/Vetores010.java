package tasks;

import java.util.Locale;
import java.util.Scanner;

public class Vetores010 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados? ");
		int N = sc.nextInt();
		
		String[] nomes = new String[N];
		double[] nota1 = new double[N];
		double[] nota2 = new double[N];
		
		
		for (int i = 0; i < N; i++) {
			System.out.println("Digite nome, primeira e segunda nota do "+ (i + 1) + " aluno:");
			sc.nextLine();
			nomes[i] = sc.nextLine();
			nota1[i] = sc.nextDouble();
			nota2[i] = sc.nextDouble();
		}
		System.out.println("Alunos aprovados:");
		double media;
		for (int i = 0; i < N; i++) {
			media = (nota1[i] + nota2[i]) / 2;
			
			if(media >= 6.0) {
				System.out.printf("%s\n", nomes[i]);
			}
		}
		
		
		
		sc.close();
	}

}
