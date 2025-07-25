package curso_programacao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class aula042Curingas {

	public static void main(String[] args) {

		// Lista de formas (Shape pode ser um círculo, retângulo, etc.)
		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0)); // Área = 6.0
		myShapes.add(new Circle(2.0));         // Área ≈ 12.57

		// Lista contendo apenas círculos
		List<Circle> myCircle = new ArrayList<Circle>();
		myCircle.add(new Circle(2.0));

		// Calcula e imprime a área total da lista de Shapes
		System.out.println("Total area Rectangle: " + totalArea(myShapes));
		// Calcula e imprime a área total da lista de Circles (funciona pois Circle estende Shape)
		System.out.println("Total area Circle: " + totalArea(myCircle));

		// Listas com números inteiros, números decimais e objetos genéricos
		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDouble = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<Object>();

		// Copia números inteiros para uma lista de Object (Number -> Object)
		copy(myInts, myObjs);
		printList(myObjs); // Saída: 1, 2, 3, 4,

		// Copia números decimais para a mesma lista de Object
		copy(myDouble, myObjs);
		printList(myObjs); // Saída: 1, 2, 3, 4, 3.14, 6.28,
	}

	// Método genérico para copiar elementos de uma lista de Number ou subclasses
	// para uma lista que aceita Number ou superclasses (como Object)
	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		for (Number number : source) {
			destiny.add(number); // Adiciona cada número da origem no destino
		}
	}

	// Método que imprime qualquer lista (tipo desconhecido com '?')
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.print(obj + ", ");
		}
		System.out.println(); // Quebra de linha após imprimir
	}

	// Método que calcula a área total de uma lista de Shape (ou subclasses)
	public static String totalArea(List<? extends Shape> list) {
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area(); // Usa polimorfismo: chama area() de Circle ou Rectangle
		}
		return String.format("%.2f", sum); // Formata a área com 2 casas decimais
		// OBS: Não conseguimos adicionar elementos à lista 'list' pois o tipo é desconhecido (extends Shape)
	}
}
