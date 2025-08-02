package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Client;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter full file path: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			List<Client> list = new ArrayList<>();
			String line = br.readLine();

			while (line != null) {
				String[] campo = line.split(",");
				String name = campo[0];
				String email = campo[1];
				Double salary = Double.parseDouble(campo[2]);

				list.add(new Client(name, email, salary));

				line = br.readLine();
			}
			
			System.out.print("Enter salary: ");
			double salary = sc.nextDouble();
			
			List<String> emails = list.stream()
					.filter(s -> s.getSalary() > salary)
					.map(e -> e.getEmail())
					.sorted()
					.collect(Collectors.toList());
			
			System.out.println("Email of people whose salary is more than: " + String.format("$%.2f", salary));
			emails.forEach(System.out::println);
			
			double soma = list.stream()
					.filter(n -> n.getName().startsWith("M"))
					.mapToDouble(Client::getSalary)
					.sum();
			
			System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("$%.2f", soma));
			
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}
}
