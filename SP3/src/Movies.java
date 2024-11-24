import java.util.ArrayList;

public class Movies extends Media {

    Movies(String titel, int releaseDate, ArrayList<String> categories, double rating){
        super(titel, releaseDate, categories, rating);
    }
    public ArrayList<String> getCategories() {
        return categories;
    }

    public String getName() {
        return titel;
    }
}