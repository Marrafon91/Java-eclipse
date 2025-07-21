package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarrRental;
import model.entities.Vehicle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm");

		System.out.println("Entre com os dados do aluguel: ");
		System.out.print("Modelo do carro: ");
		String carrModel = sc.nextLine();
		System.out.print("Retirada (dd/MM/yyyy): ");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.print("Retorno (dd/MM/yyyy): ");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

		CarrRental cr = new CarrRental(start, finish, new Vehicle(carrModel));

		sc.close();
	}

}
