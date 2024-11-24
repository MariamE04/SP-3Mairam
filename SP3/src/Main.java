import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FileIO fileIO = new FileIO();
        ArrayList<Movies> moviesList = fileIO.readMovieData();
        System.out.println("Movies List:");
        // Print out movie details to verify data
        for (Movies movie : moviesList) {
            System.out.println(movie.getTitel() + movie.getCategories() +" (" + movie.getReleaseDate() + ") - Rating: " + movie.getRating());
        }
    }
}
