package aluno;

import java.util.Locale;
import java.util.Scanner;

import entities.AlunosMedia;

public class Media {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		AlunosMedia media = new AlunosMedia();
		
		media.name = sc.nextLine();
		media.nota1 = sc.nextDouble();
		media.nota2 = sc.nextDouble();
		media.nota3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", media.trimestre());
		if(media.trimestre() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", media.pontoFaltante());
		} else {
			System.out.println("PASS");
		}		
		sc.close();		
	}
}
