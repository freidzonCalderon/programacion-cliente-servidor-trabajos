public class Serie extends Audiovisual {
    private int noOfSeasons;

    public Serie(String title, String genre, double rating, String[] reviews, int noOfSeasons) {
        super(title, genre, rating, reviews);
        this.noOfSeasons = noOfSeasons;
    }

    public int getNoOfSeasons() {
        return noOfSeasons;
    }

    public void setNoOfSeasons(int newNoOfSeasons) {
        this.noOfSeasons = newNoOfSeasons;
    }

    public void printSeriesDetails() {
        System.out.println(" ");
        System.out.println("Serie creada:");
        System.out.println(" - Título: " + this.getTitle());
        System.out.println(" - Género: " + this.getGenre());
        System.out.println(" - Calificación: " + this.getRating());
        System.out.println(" - Comentarios: " + java.util.Arrays.toString(this.getReviews()));
        System.out.println(" - Temporadas: " + this.getNoOfSeasons());
    }
}
