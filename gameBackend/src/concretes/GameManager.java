package concretes;

import java.util.List;

import abstracts.GameService;
import entities.Game;




public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName()+" adli oyun  eklendi.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName()+" adli oyun güncellendi.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName() +" adli oyun silindi.");
		
	}

	@Override
	public List<Game> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Game get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	



	

}
