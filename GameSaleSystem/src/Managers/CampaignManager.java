package Managers;

import Entities.Campaign;
import Interfaces.CampaignService;

public class CampaignManager implements CampaignService {
	
	public void add() {
		
	}
	

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.campaignName+" Adlý Kampanya Eklenmiþtir");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.campaignName+" Adlý Kampanya Silinmiþtir");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.campaignName+" Adlý Kampanya Güncellenmiþtir");
		
	}

}
