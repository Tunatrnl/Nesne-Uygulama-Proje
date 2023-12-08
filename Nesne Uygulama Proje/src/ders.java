import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ders implements Serializable {
    private String dersAd;
    private String dersKredi;
    private String dersDonem;

    public ders(String dersAd, String dersKredi) {
        this.dersAd = dersAd;
        this.dersKredi = dersKredi;
    }
    public String getDersAd() {
        return dersAd;
    }
    public void setDersAd(String dersAd) {
        this.dersAd = dersAd;
    }
    public String getDersKredi() {
        return dersKredi;
    }
    public void setDersKredi(String dersKredi) {
        this.dersKredi = dersKredi;
    }
    public String getDersDonem() {
        return dersDonem;
    }
    public void setDersDonem(String dersDonem) {
        this.dersDonem = dersDonem;
    }

    public static void main(String[] args) {
        List<ders> ozelDersListesi = ozelDersListesiOlustur();

        for (ders ders : ozelDersListesi) {
            System.out.println("Ders Adı :" + ders.getDersAd() + ", Ders Kredisi: " + ders.getDersKredi() + ", Ders Dönemi: " + ders.getDersDonem());
        }
    }
    public static List<ders> ozelDersListesiOlustur() {
        List<ders> dersListesi = new ArrayList<>();

        ders ders1 = new ders("Yazılım Test ve Kalitesi", "5");
        ders1.setDersDonem("Güz");

        ders ders2 = new ders("Elektronik", "4");
        ders2.setDersDonem("Güz");

        ders ders3 = new ders("Nesneye Dayalı Programlama", "3");
        ders3.setDersDonem("Yaz");

        ders ders4 = new ders("Tür Dili ve Edebiyatı", "2");
        ders4.setDersDonem("Yaz");

        ders ders5 = new ders("Görsel Programlama", "3");
        ders5.setDersDonem("Yaz");

        dersListesi.add(ders1);
        dersListesi.add(ders2);
        dersListesi.add(ders3);
        dersListesi.add(ders4);
        dersListesi.add(ders5);

        return dersListesi;
    }
}