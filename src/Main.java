//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Usuario newUser = new Usuario("Freidzon");
        Usuario.logIn(newUser);

        String[] reviewsMovie = {"A one-of-a-kind mind-blowing masterpiece!", "Generation defining."};
        Pelicula newMovie = new Pelicula("Inception", "Sci-fi", 8.8, reviewsMovie, 148);
        newMovie.printMovieDetails();

        String[] reviewsSeries = {"Really Great!", "Breaking Bad is the GOAT"};
        Serie newSeries = new Serie("Breaking Bad", "Psychological Drama", 9.5, reviewsSeries, 5);
        newSeries.printSeriesDetails();

        String[] reviewsDocumentary = {"Man is the best", "Shocked & upset"};
        Documental newDocumentary = new Documental("Blackfish", "Nature Documentary", 8.1, reviewsDocumentary, "Nature");
        newDocumentary.printDocumentaryDetails();
    }
}