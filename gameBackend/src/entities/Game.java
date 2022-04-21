package entities;

import abstracts.Entity;

public class Game implements Entity{
	private int id;
	private String gameName;
	private double price;
	private int campaignId;
	
	public Game() {
		// TODO Auto-generated constructor stub
	}

	public Game(int id, String gameName, double price, int campaignId) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.price = price;
		this.campaignId = campaignId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}
	
	

}
