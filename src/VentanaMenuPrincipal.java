import javax.swing.*;
import java.awt.*;

public class VentanaMenuPrincipal extends JFrame {
    private JPanel panel1;
    private JLabel welcomeText;

    public VentanaMenuPrincipal(String username) {
        setTitle("Menú Principal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setContentPane(panel1);

        welcomeText.setText("Bienvenido " + username);
        welcomeText.setFont(new Font("Arial", Font.BOLD, 18));
        welcomeText.setHorizontalAlignment(SwingConstants.CENTER);
    }
}
