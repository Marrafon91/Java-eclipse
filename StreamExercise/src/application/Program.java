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
				String[] fields = line.split(",");
				String name = fields[0];
				String email = fields[1];
				Double salary = Double.parseDouble(fields[2]);

				list.add(new Client(name, email, salary));

				line = br.readLine();
			}

			System.out.print("Enter Salary: ");
			double salary = sc.nextDouble();

			@SuppressWarnings("unused")
			List<Client> filteredClients = list.stream().filter(p -> p.getSalary() >= salary)
					.collect(Collectors.toList());

			System.out.printf("Email of people whose salary is more than %.2f:\n", salary);

			list.stream().filter(e -> e.getSalary() >= salary)
					.map(Client::getEmail).sorted()
					.forEach(System.out::println);

			double sum = list.stream().filter(c -> c.getName().startsWith("M"))
					.mapToDouble(Client::getSalary).sum();
			
			System.out.printf("Sum of salary of people whose name starts with 'M': %.2f%n", sum);

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());

		}
		sc.close();
	}

}
