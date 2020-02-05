package harmonogram;

public class Spotkanie {
    String nazwa;
    int dzienMiesiaca;
    Miesiac miesiac;
    DzienTygodnia dzienTygodnia;

    public Spotkanie(String nazwa, int dzienMiesiaca, Miesiac miesiac, DzienTygodnia dzienTygodnia) {
        this.nazwa = nazwa;
        this.dzienMiesiaca = dzienMiesiaca;
        this.miesiac = miesiac;
        this.dzienTygodnia = dzienTygodnia;
    }

    public String getNazwa() {
        return nazwa;
    }

    public int getDzienMiesiaca() {
        return dzienMiesiaca;
    }

    @Override
    public String toString() {
        return "Spotkanie{" +
                "nazwa='" + nazwa + '\'' +
                ", dzienMiesiaca=" + dzienMiesiaca +
                '}';
    }
}
