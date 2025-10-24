import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class VentanaInicioSesion extends JFrame {
    private JTextField usernameInput;
    private JButton logIn;
    private JButton createNewUser;
    private JPasswordField passwordField;
    private JPanel panel1;
    private static final String ARCHIVO_USUARIOS = "usuarios.dat";

    public VentanaInicioSesion() {
        setTitle("Inicio de Sesión");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setContentPane(panel1);

        logIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameInput.getText().trim();
                String password = new String(passwordField.getPassword());

                if (username.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(VentanaInicioSesion.this,
                            "Por favor, completa ambos campos.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                Usuario usuario = validarUsuario(username, password);
                if (usuario != null) {
                    dispose();
                    new VentanaMenuPrincipal(usuario.getName()).setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(VentanaInicioSesion.this,
                            "Usuario o contraseña incorrectos.", "Acceso Denegado", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        createNewUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new VentanaCrearUsuario().setVisible(true);
            }
        });
    }

    private Usuario validarUsuario(String username, String password) {
        ArrayList<Usuario> usuarios = cargarUsuariosDesdeArchivo();
        for (Usuario u : usuarios) {
            if (u.getName().equals(username) && u.getPassword().equals(password)) {
                return u;
            }
        }
        return null;
    }

    private ArrayList<Usuario> cargarUsuariosDesdeArchivo() {
        File file = new File(ARCHIVO_USUARIOS);
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                return (ArrayList<Usuario>) ois.readObject();
            } catch (IOException | ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(this, "Error al cargar usuarios.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        return new ArrayList<>();
    }
}
