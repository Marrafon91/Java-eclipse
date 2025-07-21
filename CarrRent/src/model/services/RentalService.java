package model.services;

import java.time.Duration;

import model.entities.CarrRental;
import model.entities.Invoice;

public class RentalService {

	private Double pricePerHour;
	private Double pricePerDay;

	private TaxService taxService;

	public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}

	public void processInvoice(CarrRental carrRental) {

		double minutes = Duration.between(carrRental.getStart(), carrRental.getFinish()).toMinutes();
		double hours = minutes / 60.0;

		double basicPayment;
		if (hours <= 12) {
			basicPayment = pricePerHour * Math.ceil(hours);
		} else {
			basicPayment = pricePerDay * Math.ceil(hours / 24.0);
		}

		double tax = taxService.tax(basicPayment);
		carrRental.setInvoice(new Invoice(basicPayment, tax));
	}
}
