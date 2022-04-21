package abstracts;

import java.util.List;

import entities.Campaign;
import entities.Game;
import entities.Gamer;
import entities.Sale;

public interface SaleService {
	void add(Game game,Gamer gamer,Sale sale ,Campaign campaign);
	void update(Game game,Gamer gamer,Sale sale ,Campaign campaign);
	void delete(Game game,Gamer gamer,Sale sale ,Campaign campaign);
	List<Sale>getAll();
	Sale get(int id);
	

}
