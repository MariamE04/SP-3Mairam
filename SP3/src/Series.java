import java.util.ArrayList;

public class Series extends Media{

    int season;
    // ArrayList<Integer> seasonList;

    int episode;
    // ArrayList<Integer> episodeList;


    Series(String titel, int releaseDate, ArrayList<String> categories, double rating, ArrayList<String> episodesPerSeason) {
        super(titel, releaseDate, categories, rating);
        this.season = season;
        this.episode = episode;
    }

    public ArrayList<String> getCategories() {
        return categories;
    }

}