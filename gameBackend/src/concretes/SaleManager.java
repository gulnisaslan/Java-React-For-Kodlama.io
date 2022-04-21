package concretes;

import java.util.List;

import abstracts.SaleService;
import entities.Campaign;
import entities.Game;
import entities.Gamer;
import entities.Sale;

public class SaleManager implements SaleService{

	@Override
	public void add(Game game, Gamer gamer, Sale sale, Campaign campaign) {
		System.out.println(gamer.getGamerName()+" "+gamer.getGamerSurname()+" adlı oyuncu "+ game.getGameName()+ 
				" adlı oyunu "+ game.getPrice() +" fiyata " + sale.getId() +" nolu satis ile satin aldı. ");
	
	}

	@Override
	public void update(Game game, Gamer gamer, Sale sale, Campaign campaign) {
		System.out.println(gamer.getGamerName()+" "+gamer.getGamerSurname()+" adlı oyuncu "+ game.getGameName()+ 
				" adlı oyunu "+ game.getPrice() +" fiyata " + sale.getId() +" nolu satis güncellendi. ");
		
	}

	@Override
	public void delete(Game game, Gamer gamer, Sale sale, Campaign campaign) {
		System.out.println(gamer.getGamerName()+" "+gamer.getGamerSurname()+" adlı oyuncu "+ game.getGameName()+ 
				" adlı oyunu "+ game.getPrice() +" fiyata " + sale.getId() +" nolu satis silindi. ");
		
	}

	@Override
	public List<Sale> getAll() {
		//
		return null;
	}

	@Override
	public Sale get(int id) {
		// 
		return null;
	}

}
