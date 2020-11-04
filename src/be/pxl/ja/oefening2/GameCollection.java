package be.pxl.ja.oefening2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class GameCollection {
	private List<VideoGame> videoGames = new ArrayList<>();

	public void addGame(VideoGame game) {
		videoGames.add(game);
	}

    public List<VideoGame> selectGames(Predicate<VideoGame> filter) {
        List<VideoGame> filteredVideoGames = new ArrayList<>();

        for (VideoGame videoGame : videoGames) {
            if (filter.test(videoGame)) {
                filteredVideoGames.add(videoGame);
            }
        }

        return filteredVideoGames;
    }
}
