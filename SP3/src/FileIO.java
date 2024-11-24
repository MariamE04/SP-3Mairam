import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO {

    private  ArrayList<Movies> moviesList = new ArrayList<>(); //A list to store Media objects representing movies.

    private  ArrayList<Series> seriesList = new ArrayList<>(); //A list to store Media objects representing TV series

    public  ArrayList<Movies> readMovieData() {
        try (Scanner scan = new Scanner(new File("Data/film.txt"))){
            while (scan.hasNextLine()) {          //Reads each line in
                String line = scan.nextLine();  // the file until the end.
                String[] lineData = line.split(";"); //Splits each line into an array of strings based on the semicolon.

                String movieName = lineData[0].trim(); //Movie name: lineData[0] (e.g., "The Godfather").
                int movieYear = Integer.parseInt(lineData[1].trim()); //Release year: lineData[1] (e.g., "1972").

                ArrayList<String> movieCategories = new ArrayList<>();
                String[] categoryArray = lineData[2].split(","); //Splits lineData[2] into individual categories
                for (String category : categoryArray) {
                    movieCategories.add(category.trim());
                }
                double movieRating = Double.parseDouble(lineData[3].trim().replace(',', '.')); //Replace ',' with '.' for proper parsing
                // Convert string to double

                Movies movie = new Movies(movieName, movieYear, movieCategories, movieRating); //Constructs a Movies object using the name, year, and rating.
                moviesList.add(movie); //Adds the Movies object to the movies list.
            }
        } catch(FileNotFoundException e){
            System.out.println("File not found: " + e.getMessage());
        }
        return moviesList;
    }

    public  ArrayList<Series> readSeries() {
        try( Scanner scan = new Scanner(new File("Data/serier.txt"));) {
            while(scan.hasNextLine()){
                String line = scan.nextLine();
                String[] lineData = line.split(";");

                String seriesName = lineData[0].trim();
                int seriesYears = Integer.parseInt(lineData[1].trim());

                ArrayList<String> seriesCategories = new ArrayList<>();
                String[] seriesCategory = lineData[2].split(",");
                for(String category: seriesCategory){
                    seriesCategories.add(category.trim());
                }
                double seriesRating = Double.parseDouble(lineData[3].trim().replace(',', '.'));

                ArrayList<String> episodesPerSeason = new ArrayList<>();
                String[] seasonsData = lineData[4].split(",");
                for (String season : seasonsData) {
                    episodesPerSeason.add(season.trim());
                }
                Series series = new Series(seriesName, seriesYears, seriesCategories, seriesRating, episodesPerSeason);
                seriesList.add(series); // Populate the existing list
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());

        } return seriesList;
    }

}