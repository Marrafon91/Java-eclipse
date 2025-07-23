package curso_programacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;

public class aula037Interface_Comparable {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();
		String path = "C:\\Users\\Guilherme\\Desktop\\File\\praticando1.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String employeeCsv = br.readLine();
			while (employeeCsv != null) {
				String[] fields = employeeCsv.split(",");
				list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
				employeeCsv = br.readLine();
			}
			Collections.sort(list);
			for (Employee emp : list) {
				System.out.println(emp.getName() + " , " + String.format("%.2f", emp.getSalary()));
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
