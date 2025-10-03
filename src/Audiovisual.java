import java.util.ArrayList;

public abstract class Audiovisual {

    private String title;
    private String genre;
    private double rating;
    private static final ArrayList<String> reviews = new ArrayList<>();

    public Audiovisual(String title, String genre, double rating) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }

    public static ArrayList<String> getReviews() {
        return new ArrayList<>(reviews);
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public void setGenre(String newGenre) {
        this.genre = newGenre;
    }

    public void setRating(double newRating) {
        this.rating = newRating;
    }

    public static void addReview(String newReview) {
        reviews.add(newReview);
    }
}