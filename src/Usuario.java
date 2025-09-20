public class Usuario {
    private String name;

    public Usuario(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public static void logIn(Usuario usuario) {
        System.out.println("¡Bienvenido " + usuario.getName() + "!");
    }
}
