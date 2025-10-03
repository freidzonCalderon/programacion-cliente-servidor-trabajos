import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws UserNotFound {
        Usuario newUser = new Usuario("Freidzon");
        Usuario.logIn(newUser);

        Audiovisual.addReview("A one-of-a-kind mind-blowing masterpiece!");
        Audiovisual.addReview("Generation defining.");

        Pelicula newMovie = new Pelicula("Inception", "Sci-fi", 8.8, 148);
        newMovie.printMovieDetails();

        Serie newSeries = new Serie("Breaking Bad", "Psychological Drama", 9.5, 5);
        newSeries.printSeriesDetails();

        Documental newDocumentary = new Documental("Blackfish", "Nature Documentary", 8.1, "Nature");
        newDocumentary.printDocumentaryDetails();

        ArrayList<Usuario> users = new ArrayList<>();
        users.add(new Usuario("Kevin"));
        users.add(new Usuario("Luisa"));
        users.add(new Usuario("Gabriel"));
        users.add(new Usuario("Sofia"));
        users.add(new Usuario("David"));
        users.add(new Usuario("Maria"));
        users.add(new Usuario("Esteban"));
        users.add(new Usuario("Laura"));
        users.add(new Usuario("Carlos"));
        users.add(new Usuario("Cecilia"));

        String userToRemove = "David";
        if (!users.removeIf(user -> user.getName().equals(userToRemove))) {
            throw new UserNotFound("El usuario: '" + userToRemove + "' no existe en la lista");
        }

        Collections.sort(users);

        System.out.println(" ");
        System.out.println("Usuarios ordenados:");
        for (Usuario user : users) {
            System.out.println("- " + user.getName());
        }

        newUser = null;
        newMovie = null;
        newSeries = null;
        newDocumentary = null;
        users = null;
    }
}