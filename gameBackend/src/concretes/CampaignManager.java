package concretes;

import java.util.List;

import abstracts.CampaignService;
import entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void Add(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+"Eklendi.");
		
	}

	@Override
	public void upadte(Campaign campaign) {
	System.out.println(campaign.getCampaignName()+"Güncellendi.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+"Silindi.");
		
	}

	@Override
	public List<Campaign> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Campaign get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
