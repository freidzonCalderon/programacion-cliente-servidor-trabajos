public class Serie extends Audiovisual implements Comparable<Serie> {
    private int noOfSeasons;

    public Serie(String title, String genre, double rating, int noOfSeasons) {
        super(title, genre, rating);
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
        System.out.println(" - Comentarios: " + Audiovisual.getReviews());
        System.out.println(" - Temporadas: " + this.getNoOfSeasons());
    }

    @Override
    public int compareTo(Serie otherSerie) {
        return this.getTitle().compareTo(otherSerie.getTitle());
    }
}
