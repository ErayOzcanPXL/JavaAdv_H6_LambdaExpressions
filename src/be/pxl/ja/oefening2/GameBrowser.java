package be.pxl.ja.oefening2;

import java.util.List;
import java.util.function.Predicate;

public class GameBrowser {
	private GameCollection gameCollection;

	public GameBrowser(GameCollection gameCollection) {
		this.gameCollection = gameCollection;
	}

	public List<VideoGame> showFreeGames() {
        return gameCollection.selectGames((videoGame) -> videoGame.getPrice() == 0);
	}

	public List<VideoGame> showGamesInGenre(String action) {
        return gameCollection.selectGames((videoGame) -> videoGame.getGenres().toString().toLowerCase().contains(action.toLowerCase()));
	}

	public List<VideoGame> showGamesForSearch(String cd) {
        Predicate<VideoGame> filter = new Predicate<>() {
            @Override
            public boolean test(VideoGame videoGame) {
                return videoGame.getName().toLowerCase().contains(cd.toLowerCase());
            }
        };

        return gameCollection.selectGames(filter);
	}
}
