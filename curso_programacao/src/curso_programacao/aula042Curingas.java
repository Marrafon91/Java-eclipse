package curso_programacao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class aula042Curingas {

	public static void main(String[] args) {

		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));

		List<Circle> myCircle = new ArrayList<Circle>();
		myCircle.add(new Circle(2.0));

		System.out.println("Total area Rectangle: " + totalArea(myShapes));
		System.out.println("Total area Circle: " + totalArea(myCircle));

		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDouble = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<Object>();

		copy(myInts, myObjs);
		printList(myObjs);
		copy(myDouble, myObjs);
		printList(myObjs);

	}

	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		for (Number number : source) {
			destiny.add(number);
		}
	}
	
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.print(obj + ", ");
		}
		System.out.println();
	}

	public static String totalArea(List<? extends Shape> list) {
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return String.format("%.2f", sum);
		// Nao consegue add elementos a List
	}

}
