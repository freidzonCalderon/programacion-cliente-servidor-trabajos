import java.io.Serializable;

public class Usuario implements Comparable<Usuario>, Serializable {
    private String name;
    private String password;

    public Usuario(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setPassword(String newPassword) {
        this.password = newPassword;
    }

    @Override
    public int compareTo(Usuario otherUser) {
        return this.name.compareTo(otherUser.getName());
    }
}