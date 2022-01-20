import utils.StringUtils;
import utils.WeekUtils;

public class StringUtilsMainApp {

    public static void main(String[] args) {

        //dotyczy statycznych metod
        String to_jest_nowy_tekst = StringUtils.getFormattedText("To jest długi tekst");   //gdy zwraca coś innego niż void, to trzeba przypisać do zmiennej (alt + enter)
        System.out.println(to_jest_nowy_tekst);

        String to_jest_inny_tekst = StringUtils.getFormattedText("Bartek");
        System.out.println(to_jest_inny_tekst);

        //Math.max();  // w klasie matematycznej (pomocniczej dla obliczeń), wszystkie metody są metodami statycznymi

        //dotyczy statycznych pól
        System.out.println(WeekUtils.MONDAY);
        //WeekUtils.MONDAY = "Sunday";           // nie można zmieniać FINALnej zmiennej

        //Math.PI;   // w klasie matematycznej, wartości stałe (jak PI = 3,14...) są statyczne i FINALne
    }
}
