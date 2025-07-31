package curso_programacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product049;
import model.service.ProductService;

public class aula052Function {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Product049> list = new ArrayList<>();

		list.add(new Product049("Tv", 900.00));
		list.add(new Product049("Mouse", 50.00));
		list.add(new Product049("Tablet", 350.00));
		list.add(new Product049("HD Case", 80.90));

		ProductService ps = new ProductService();

		double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');

		System.out.println("Sum = " + String.format("%.2f", sum));

	}

}
