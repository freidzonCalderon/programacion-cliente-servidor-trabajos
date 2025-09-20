public class Audiovisual {

    private String title;
    private String genre;
    private double rating;
    private String[] reviews;

    public Audiovisual(String title, String genre, double rating, String[] reviews) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.reviews = reviews;
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

    public String[] getReviews() {
        return reviews;
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

    public void setReviews(String[] newReviews) {
        this.reviews = newReviews;
    }
}