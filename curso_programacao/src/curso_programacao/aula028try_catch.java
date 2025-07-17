package curso_programacao;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class aula028try_catch {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		method1();
		
		System.out.println("End of Program");
		
		sc.close();
	}
	
	public static void method1() {
		System.out.println("***METHOD1 START***");
		method2();
		System.out.println("***METHOD1 END***");
	}

	public static void method2() {
		System.out.println("***METHOD2 START***");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid! position!");
		} catch (InputMismatchException e) {
			System.out.println("Input error!");
		}
		sc.close();
		System.out.println("***METHOD2 END***");
	}
}
