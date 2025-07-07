package curso_programacao;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;

public class aula022data_hora {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		LocalDate d04 = LocalDate.parse("2025-07-07");
		LocalDateTime d05 = LocalDateTime.parse("2025-07-07T18:22:26");
		Instant d06 = Instant.parse("2025-07-07T01:30:26Z");
		
		LocalDate pastWeek = d04.minusDays(7);
		LocalDate nextWeek = d04.plusDays(7);
		LocalDate nextYear = d04.plusYears(1);
		
		System.out.println("PastWeek = " + pastWeek);
		System.out.println("nextWeek = " + nextWeek);
		System.out.println("nextYear = " + nextYear);
		System.out.println("----------------------");
		
		LocalDateTime pastWeekTime = d05.minusDays(7);
		LocalDateTime nextWeekTime = d05.plusDays(7);
		LocalDateTime nextYearTime = d05.plusYears(1);
		
		System.out.println("PastWeek = " + pastWeekTime);
		System.out.println("nextWeek = " + nextWeekTime);
		System.out.println("nextYear = " + nextYearTime);
		System.out.println("----------------------");
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		
		
		System.out.println("PastWeek = " + pastWeekInstant);
		System.out.println("nextWeek = " + nextWeekInstant);
		System.out.println("----------------------");
		
		Duration t1 = Duration.between(pastWeek.atStartOfDay(), d04.atStartOfDay());
		Duration t2 = Duration.between(pastWeekTime, d05);
		Duration t3 = Duration.between(pastWeekInstant, d06);
		Duration t4 = Duration.between(d06, pastWeekInstant);
		
		System.out.println("t1 dias = " + t1.toDays());
		System.out.println("t2 dias = " + t2.toDays());
		System.out.println("t3 dias = " + t3.toDays());
		System.out.println("t4 dias = " + t4.toDays());
		
		sc.close();
	}

}
