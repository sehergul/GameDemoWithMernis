package entities;

import abstracts.Entity;

public class Game implements Entity{
	private String name;
	private double unitPrice;
	private String description;
	
	public Game() {}
	
	public Game(String name, double unitPrice, String description) {
		super();
		this.name = name;
		this.unitPrice = unitPrice;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	

}
