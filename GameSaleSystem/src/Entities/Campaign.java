package Entities;

public class Campaign {
	
	public int campaignId;
	public String campaignName;
	public int discount;
	public Campaign(int campaignId, String campaignName, int discount) {
		this.campaignId = campaignId;
		this.campaignName = campaignName;
		this.discount = discount;
	}

}
