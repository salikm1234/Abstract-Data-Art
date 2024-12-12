import org.code.theater.*;
import org.code.media.*;
import java.util.*;

public class DataScene extends Scene {

    // Arrays to store movie data
    private String[] names;  
    private double[] ratings;     
    private int[] years;     
    private String[] genres;  

    // Arrays to categorize movies based on ratings
    private String[] goodMovies;  
    private String[] midMovies;  
    private String[] badMovies;  

    // Counters for each movie category
    private int goodMoviesCount = 0;
    private int midMoviesCount = 0;
    private int badMoviesCount = 0;

    // Array to store y-coordinates for movie visualizations
    private int[] y_list;     

    // Array of stroke colors for rectangles
    private String[] colors = {"black", "purple", "blue", "orange"};

    // Array of available note frequencies (MIDI values)
    private int[] notes = {261, 277, 293, 311, 329, 349, 369, 392, 415, 440, 466, 493, 523};

    /**
     * Constructor initializes the data arrays using FileReader
     * and prepares the arrays needed for visualization and sorting.
     */
public DataScene() {
        // Load data from files
        names = FileReader.toStringArray("names.txt");
        ratings = FileReader.toDoubleArray("ratings.txt");
        years = FileReader.toIntArray("years.txt");
        genres = FileReader.toStringArray("genres.txt");

        // Initialize arrays for categories and positions
        goodMovies = new String[names.length];
        midMovies = new String[names.length];
        badMovies = new String[names.length];
        y_list = new int[names.length];
    }

    /**
     * Main method to draw the scene.
     * Iterates through movies, sorts them into categories, assigns colors,
     * and draws rectangles with appropriate sizes and positions.
     */
    public void drawScene() {
    System.out.println("Canvas Dimensions: " + getWidth() + "x" + getHeight());

        // Generate y-coordinates based on movie years
generateHeights();

        for (int i = 0; i < names.length; i++) {
            // Determine fill color based on movie rating
            String fillColor = sortMovies(i);
            setFillColor(fillColor);

            // Play notes based on rating category
            if (fillColor.equals("green")) {
                // Play a higher note for good movies
                playNoteAndPause((int) (Math.random() * (15) + 60), 1);
            }
            if (fillColor.equals("red")) {
                // Play a lower note for bad movies
                playNoteAndPause((int) (Math.random() * (15) + 46), 1);
            }

            // Debugging output
            System.out.println("Drawing movie: " + names[i] + " with color " + fillColor);

            // Assign a random stroke color
            int random_color = (int) (4 * Math.random());
            setStrokeColor(colors[random_color]);
            System.out.println("Stroke color: " + colors[random_color]);

            // Calculate x and y positions and size for the rectangle
            int x = setXFromGenre(i);
            int y = y_list[i];
            int size = setSizeFromRating(i);

            // Debugging output for position and size
            System.out.println("Position: (" + x + ", " + y + "), Size: " + size);

            // Draw the rectangle
            drawRectangle(x, y, size, size);
        }
    }

    /**
     * Sort movies into categories (good, mid, bad) based on their ratings.
     * Returns the fill color for the rectangle visualization.
     */
private String sortMovies(int index) {
double rating = ratings[index];
        if (rating >= 7) {
            goodMovies[goodMoviesCount] = names[index];
            goodMoviesCount++;  // Increment good movies counter
            return "green";  // Good movies are green
        } else if (rating < 7 && rating >= 3) {
            midMovies[midMoviesCount] = names[index];
            midMoviesCount++;  // Increment mid movies counter
            return "yellow";  // Mid movies are yellow
        } else {
            badMovies[badMoviesCount] = names[index];
            badMoviesCount++;  // Increment bad movies counter
            return "red";  // Bad movies are red
        }
    }

    /**
     * Generate y-coordinates for movies based on their release year.
     * Ensures the rectangles are positioned within the canvas.
     */
    private void generateHeights() {
         int height = getHeight(); // Total canvas height
 for (int i = 0; i < names.length; i++) {
            // Scale y-coordinates based on the squared year value
            y_list[i] = (int) ((Math.pow(years[i], 2) % height * 1.2));
        }
    }

    /**
     * Calculate rectangle size based on movie rating.
     * Returns a size between 25 and 50.
     */
    private int setSizeFromRating(int index) {
 int rating = (int) Math.round(ratings[index]);
        if (rating > 9) {
            return 50;
        } else if (rating <= 9 && rating > 7) {
            return 45;
        } else if (rating <= 7 && rating > 5) {
            return 40;
        } else if (rating <= 5 && rating > 3) {
            return 35;
        } else if (rating <= 3 && rating > 1) {
            return 30;
        } else {
            return 25;
        }
    }

    /**
     * Calculate the x-coordinate based on the movie genre.
     * Returns a fixed position for Drama, Action, and Sci-Fi.
     */
            private int setXFromGenre(int index) {
        String genre = genres[index];
        if (genre.equals("Drama")) {
            return 100;
        } else if (genre.equals("Action")) {
            return 200;
        } else if (genre.equals("Sci-Fi")) {
            return 300;
        }
        return 0;  // Default position for unrecognized genres
    }
}