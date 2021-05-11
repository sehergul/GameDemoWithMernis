package entities;

import abstracts.Entity;

public class Campaign implements Entity {
	private String campaignName;
	private String description;
	private double rateOfDiscount;
	
	public Campaign() {}
	
	public Campaign(String campaignName, String description, double rateOfDiscount) {
		super();
		this.campaignName = campaignName;
		this.description = description;
		this.rateOfDiscount = rateOfDiscount;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getRateOfDiscount() {
		return rateOfDiscount;
	}

	public void setRateOfDiscount(double rateOfDiscount) {
		this.rateOfDiscount = rateOfDiscount;
	}
	
	
	
	
	

}
