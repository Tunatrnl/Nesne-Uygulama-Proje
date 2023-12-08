import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DersKayitForm extends JFrame{
    private JTextField txtOgrenciAdi;
    private JTextField txtOgrenciSoyadi;
    private JTextField txtOgrenciNo;
    private JButton btnKaydet;
    private JPanel panel1;

    public DersKayitForm() {
        btnKaydet.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kaydetButtonAction(e);
            }
        });
    }

    private void kaydetButtonAction(ActionEvent e) {
        String ogrenciAdi = txtOgrenciAdi.getText();
        String ogrenciSoyadi = txtOgrenciSoyadi.getText();
        String ogrenciNo = txtOgrenciNo.getText();

        String csvFilePath = "ogrenciler.csv";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(csvFilePath, true))) {
            // CSV dosyasına öğrenci bilgilerini ekleyin
            writer.write(ogrenciAdi + "," + ogrenciSoyadi + "," + ogrenciNo);
            writer.newLine();
            writer.flush();

            // Veri ekledikten sonra alanları temizleyin
            txtOgrenciAdi.setText("");
            txtOgrenciSoyadi.setText("");
            txtOgrenciNo.setText("");

            JOptionPane.showMessageDialog(null, "Öğrenci bilgileri başarıyla kaydedildi.");
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Hata: Öğrenci bilgileri kaydedilemedi.");
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("DersKayitForm");
        frame.setContentPane(new DersKayitForm().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
