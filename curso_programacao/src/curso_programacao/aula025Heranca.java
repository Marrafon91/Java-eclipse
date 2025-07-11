package curso_programacao;

import java.util.Locale;
import java.util.Scanner;
import entity.BusinessAccount;

public class aula025Heranca {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		BusinessAccount account = new BusinessAccount();
				
		sc.close();
	}

}
