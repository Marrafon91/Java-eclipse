package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Date date;
	private OrderStatus orderStatus;

	private Client client;
	private List<OrderItem> items = new ArrayList<>();

	public Order() {
		this.date = new Date();
	}

	public Order(Date date, OrderStatus orderStatus, Client client) {
		this.date = date;
		this.orderStatus = orderStatus;
		this.client = client;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public void addItem(OrderItem item) {
		items.add(item);
	}

	public void removeItem(OrderItem item) {
		items.remove(item);
	}

	public double total() {
		double sum = 0.0;
		for (OrderItem item : items) {
			sum += item.subTotal();
		}
		return sum;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ").append(sdf.format(date)).append("\n");
		sb.append("Order status: ").append(orderStatus).append("\n");
		sb.append("Client: ").append(client).append("\n");
		sb.append("Order items:\n");
		for (OrderItem item : items) {
			sb.append(item).append("\n");
		}
		sb.append("Total price: $").append(String.format("%.2f", total()));
		return sb.toString();
	}
}
