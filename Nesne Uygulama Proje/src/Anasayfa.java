import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Anasayfa  extends JFrame{
    private JButton öğrenciKaydetButton;
    private JButton dersKaydetButton;

    public Anasayfa() {
        // Initialize buttons
        öğrenciKaydetButton = new JButton("Öğrenci Kaydet");
        dersKaydetButton = new JButton("Ders Kaydet");

        // Add action listeners to buttons
        öğrenciKaydetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openÖğrenciKayıtForm();
            }
        });

        dersKaydetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openDersKayıtForm();
            }
        });

        // Rest of your constructor code...
    }

    // Method to open Öğrenci Kayıt Form
    private void openÖğrenciKayıtForm() {
        JFrame öğrenciKayıtFormFrame = new JFrame("Öğrenci Kayıt Formu");
        // Add your code to configure and show the Öğrenci Kayıt Form here

        // For example:
        öğrenciKayıtFormFrame.setSize(400, 300);
        öğrenciKayıtFormFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        öğrenciKayıtFormFrame.setVisible(true);
    }

    // Method to open Ders Kayıt Form
    private void openDersKayıtForm() {
        JFrame dersKayıtFormFrame = new JFrame("Ders Kayıt Formu");
        // Add your code to configure and show the Ders Kayıt Form here

        // For example:
        dersKayıtFormFrame.setSize(400, 300);
        dersKayıtFormFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dersKayıtFormFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Create an instance of Anasayfa
                Anasayfa anasayfa = new Anasayfa();

                // Rest of your main method code...
            }
        });
    }
}
