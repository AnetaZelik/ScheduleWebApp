package harmonogram;


import static harmonogram.DzienTygodnia.PON;
import static harmonogram.DzienTygodnia.WT;
import static harmonogram.Miesiac.STYCZEN;

public class HarmonogramSterowanie {
    public static void main(String[] args) {
        Harmonogram harmonogram = new Harmonogram();

        harmonogram.ustawSpotkanie("spotkanie1", 1, STYCZEN, PON);
        harmonogram.ustawSpotkanie("spotkanie2", 2, STYCZEN, WT);

        Spotkanie spotkanie3 = new Spotkanie("spotkanie3", 3, STYCZEN, WT);
        Spotkanie spotkanie4 = new Spotkanie("spotkanie4", 4, STYCZEN, WT);
        harmonogram.ustawSpotkanie(spotkanie3);
        harmonogram.ustawSpotkanie(spotkanie4);

        harmonogram.wyswietlWszystkieSpotkania();

        harmonogram.liczbaSpotkan();
        System.out.println(harmonogram.liczbaSpotkan());

    }
}
