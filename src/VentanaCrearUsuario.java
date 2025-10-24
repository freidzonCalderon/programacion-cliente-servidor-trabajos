import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

public class VentanaCrearUsuario extends JFrame {
    private JTextField usernameInput;
    private JTextField passwordInput;
    private JButton saveUser;
    private JPanel createUser;
    private JButton volverAtrasButton;
    private JLabel crearUsuarioLabel;

    private ArrayList<Usuario> usuarios;
    private static final String ARCHIVO_USUARIOS = "usuarios.dat";

    public VentanaCrearUsuario() {
        setTitle("Crear Usuario");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);

        setContentPane(createUser);

        usuarios = cargarUsuariosDesdeArchivo();

        saveUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameInput.getText().trim();
                String password = passwordInput.getText().trim();

                if (username.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(VentanaCrearUsuario.this,
                            "Por favor, completa ambos campos.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                for (Usuario u : usuarios) {
                    if (u.getName().equals(username)) {
                        JOptionPane.showMessageDialog(VentanaCrearUsuario.this,
                                "El usuario ya existe.", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }

                Usuario nuevo = new Usuario(username, password);
                usuarios.add(nuevo);

                if (guardarUsuariosEnArchivo()) {
                    JOptionPane.showMessageDialog(VentanaCrearUsuario.this,
                            "Usuario creado: " + username, "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    limpiarCampos();
                } else {
                    JOptionPane.showMessageDialog(VentanaCrearUsuario.this,
                            "Error al guardar.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        volverAtrasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }

    private void limpiarCampos() {
        usernameInput.setText("");
        passwordInput.setText("");
    }

    private ArrayList<Usuario> cargarUsuariosDesdeArchivo() {
        File file = new File(ARCHIVO_USUARIOS);
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                return (ArrayList<Usuario>) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return new ArrayList<>();
    }

    private boolean guardarUsuariosEnArchivo() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARCHIVO_USUARIOS))) {
            oos.writeObject(usuarios);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}