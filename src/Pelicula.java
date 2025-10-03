public class Pelicula extends Audiovisual implements Comparable<Pelicula> {
    private int duration;

    public Pelicula(String title, String genre, double rating, int duration) {
        super(title, genre, rating);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int newDuration) {
        this.duration = newDuration;
    }

    public void printMovieDetails() {
        System.out.println(" ");
        System.out.println("Película creada:");
        System.out.println(" - Título: " + this.getTitle());
        System.out.println(" - Género: " + this.getGenre());
        System.out.println(" - Calificación: " + this.getRating());
        System.out.println(" - Comentarios: " + Audiovisual.getReviews());
        System.out.println(" - Duración: " + this.getDuration());
    }

    @Override
    public int compareTo(Pelicula otherMovie) {
        return this.getTitle().compareTo(otherMovie.getTitle());
    }
}
