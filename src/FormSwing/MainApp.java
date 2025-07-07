package FormSwing;

import javax.swing.SwingUtilities;

public class MainApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new FormSwing(); // Crea e visualizza il form Swing
        });
    }
}