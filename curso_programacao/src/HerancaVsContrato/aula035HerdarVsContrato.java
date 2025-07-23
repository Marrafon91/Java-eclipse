package HerancaVsContrato;

import HerancaVsContrato.enums.Color;
import java.util.Locale;
import java.util.Scanner;

public class aula035HerdarVsContrato { // HERANÇA E INTERFACES.

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// RELAÇÃO É-UM.
		// GENERALIZAÇÃO/ESPECIALIZAÇÃO.
		// POLIMORFISMO.
		// HERANÇA => REUSO.
		// INTERFACES => CONTRATO A SER CUMPRIDO.

		AbstractShape s1 = new Circle(Color.BLACK, 2.0);
		AbstractShape s2 = new Rectangle(Color.WHITE, 3.0, 3.0);

		System.out.println("Circle color: " + s1.getColor());
		System.out.println("Circle area: " + String.format("%.3f", s1.area()));
		System.out.println("Rectangle color: " + s2.getColor());
		System.out.println("Rectangle area: " + String.format("%.3f", s2.area()));

		sc.close();
	}

}
