import java.util.ArrayList;
import java.util.List;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Netflix {
    private List<User> users;
    private TextUI ui;
    private FileIO io;
    private ArrayList<Movies> moviesList;
    private ArrayList<Series> seriesList;

    public Netflix() {
        ui = new TextUI();
        this.io = new FileIO(); // Create an instance of FileIO
        this.users = new ArrayList<>();
        this.moviesList = io.readMovieData(); // Use instance method
        this.seriesList = io.readSeries(); // Use instance method
    }

    public void printMovies() {
        for (Movies movie : moviesList) {
            System.out.println("Movie: " + movie.getName());
            System.out.println("Categories:");
            for (String category : movie.getCategories()) {
                System.out.println(" - " + category);
            }
        }
    }
}