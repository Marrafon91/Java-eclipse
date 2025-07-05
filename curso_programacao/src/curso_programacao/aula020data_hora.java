package curso_programacao;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class aula020data_hora {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html

		LocalDate d04 = LocalDate.parse("2025-07-05");
		LocalDateTime d05 = LocalDateTime.parse("2025-07-05T18:22:26");
		Instant d06 = Instant.parse("2025-07-05T18:28:26Z");

		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

		System.out.println("d04 = " + d04.format(fmt1));
		System.out.println("d04 = " + fmt1.format(d04));
		System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("---------------------");
		System.out.println("d05 = " + d05.format(fmt1));
		System.out.println("d05 = " + fmt2.format(d05));
		System.out.println("d05 = " + d05.format(fmt4));
		System.out.println("---------------------");
		System.out.println("d06 = " + d06);
		System.out.println("d06 = " + fmt3.format(d06));
		System.out.println("d06 = " + fmt5.format(d06));

		sc.close();
	}

}
