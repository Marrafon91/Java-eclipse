package curso_programacao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import entities.Product047;

public class aula048Funcional {

	public static int globalValue = 3;

	public static int compareProducts(Product047 p1, Product047 p2) {
		return p1.getPrice().compareTo(p2.getPrice());
	}

	public static void main(String[] args) {

		int[] vect = new int[] { 3, 4, 5 };
		changeOddValues(vect);
		System.out.println(Arrays.toString(vect));

		List<Product047> list = new ArrayList<>();

		list.add(new Product047("TV", 900.0));
		list.add(new Product047("Notebook", 1200.00));
		list.add(new Product047("Table", 450.0));

		list.sort(aula048Funcional::compareProducts);

		list.forEach(System.out::println);
		
		System.out.println();

		double sum = list.stream().map(p -> p.getPrice()).reduce(0.0, Double::sum);
		System.out.println("Soma dos preços: " + sum);
	}

	public static void changeOddValues(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 != 0) {
				numbers[i] += globalValue;
			}
		}
	}
}
