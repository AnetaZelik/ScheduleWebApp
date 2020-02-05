package harmonogram;

import java.util.ArrayList;
import java.util.List;

public class Harmonogram {
    List<Spotkanie> spotkania = new ArrayList<>();

    public void ustawSpotkanie(Spotkanie spotkanie) {
        spotkania.add(spotkanie);
    }

    public void ustawSpotkanie(String nazwa, int dzienMiesiaca, Miesiac miesiac, DzienTygodnia dzienTygodnia) {
        Spotkanie nastepneSpotkanie = new Spotkanie(nazwa, dzienMiesiaca, miesiac, dzienTygodnia);
        spotkania.add(nastepneSpotkanie);
    }

    void wyswietlWszystkieSpotkania() {
        System.out.println(spotkania);
    }

    int liczbaSpotkan() {
        return spotkania.size();


    }
}
