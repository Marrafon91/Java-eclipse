package curso_programacao;

import java.util.Scanner;

public class aula006_escopo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double price = 400.00;
		double desconto;
		
		if(price < 200.00) {
			 desconto = price * 0.1;
		} else {
			desconto = 0;
		}		
		
		System.out.println(desconto);		
		
		sc.close();
	}

}
