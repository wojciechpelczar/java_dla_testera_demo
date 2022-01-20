package utils;

public class StringUtils {

    //praktyczne zastosowanie statycznych metod - obliczenia/formatowania podczas automatyzacji
    public static String getFormattedText(String text) {    //metoda ta pobiera jakiś tekst (String) jako parametr, ale też zwraca jakiś tekst (String)
        if (text.length() > 10) {
            return text.substring(0,7) + "...";
        }else {
            return text;
        }
    }
}
