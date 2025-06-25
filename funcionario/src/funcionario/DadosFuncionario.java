package funcionario;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class DadosFuncionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Funcionario funcionario = new Funcionario();

		funcionario.name = sc.nextLine();
		funcionario.salarioBruto = sc.nextDouble();
		funcionario.taxa = sc.nextDouble();

		System.out.println("Nome: " + funcionario.name());
		System.out.printf("Salario total: %.2f%n", funcionario.salarioTotal());
		System.out.printf("Taxa: %.2f%n", funcionario.taxa());
		System.out.println();
		System.out.println("Empregado: " + funcionario.name() + ", " + "$ " + funcionario.salarioLiquido());
		System.out.println();
		System.out.printf("Qual a porcentagem para aumento de salario ?");
		System.out.println();
		double porcentagem = sc.nextDouble();
		funcionario.aplicarReajuste(porcentagem);
		System.out.printf("Salario atualizado: %s, $ %.2f%n", funcionario.name(), funcionario.salarioLiquido());

		sc.close();
	}

}
