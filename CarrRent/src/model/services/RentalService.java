package model.services;

import model.entities.CarrRental;
import model.entities.Invoice;

public class RentalService {
	private Double pricePerHour;
	private Double pricePerDay;

	private BrazilTaxService taxService;

	public RentalService(Double pricePerHour, Double pricePerDay, BrazilTaxService taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}

	public void precessInvoice(CarrRental carrRental) {

		carrRental.setInvoice(new Invoice(50.0, 10.0));
	}
}
