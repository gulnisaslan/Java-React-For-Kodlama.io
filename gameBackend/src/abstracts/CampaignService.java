package abstracts;

import java.util.List;

import entities.Campaign;

public interface CampaignService {
	
	void Add(Campaign campaign);
	void upadte(Campaign campaign);
	void delete(Campaign campaign);
	List<Campaign> getAll();
	Campaign get(int id);

}
