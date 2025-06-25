package entities;

public class Funcionario {

	public String name;
	public double salarioBruto;
	public double taxa;

	public String name() {
		return name;
	}

	public double salarioTotal() {
		return salarioBruto;
	}

	public double taxa() {
		return taxa;
	}

	public double salarioLiquido() {
		return salarioBruto - taxa;
	}

	public double aplicarReajuste(double porcentagem) {
		double aumento = salarioBruto * (porcentagem / 100);
		salarioBruto += aumento;
		return aumento;
	}
}
