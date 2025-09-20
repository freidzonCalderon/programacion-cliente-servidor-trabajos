public class Documental extends Audiovisual{
    private String topic;

    public Documental(String title, String genre, double rating, String[] reviews, String topic) {
        super(title, genre, rating, reviews);
        this.topic = topic;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String newTopic) {
        this.topic = newTopic;
    }

    public void printDocumentaryDetails() {
        System.out.println(" ");
        System.out.println("Documental creado:");
        System.out.println(" - Título: " + this.getTitle());
        System.out.println(" - Género: " + this.getGenre());
        System.out.println(" - Calificación: " + this.getRating());
        System.out.println(" - Comentarios: " + java.util.Arrays.toString(this.getReviews()));
        System.out.println(" - Tema: " + this.getTopic());
    }
}
