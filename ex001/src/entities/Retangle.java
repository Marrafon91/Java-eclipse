package entities;

public class Retangle {

	public double base;
	public double altura;

	public double area() {
		return base * altura;
	}

	public double perimetro() {
		return 2 * (base + altura);
	}

	public double diagonal() {
		return Math.sqrt(base * base + altura * altura);
	}
}
