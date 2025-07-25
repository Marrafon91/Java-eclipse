package curso_programacao;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class aula042Curingas {

	public static void main(String[] args) {

		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));

		System.out.println("Total area: " + totalArea(myShapes));

	}

	public static String totalArea(List<Shape> list) {
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return String.format("%.2f", sum);
	}

}
