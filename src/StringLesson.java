public class StringLesson {
    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "hello";

        //porównywanie dwóch obiektów
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2)); //ta metoda zignoruje wielkość liter

        //zamiana tekstu
        String s = str1.toUpperCase();
        System.out.println(s);
        String s1 = str1.toLowerCase();
        System.out.println(s1);

        //czy tekst zaczyna/kończy się od jakiegoś "tekstu"
        boolean startsWith = str1.toLowerCase().startsWith("he");
        System.out.println(startsWith);
        boolean endsWith = str1.toUpperCase().endsWith("LO");
        System.out.println(endsWith);
        boolean contains = str1.contains("lll");
        System.out.println(contains);

        System.out.println("    a    ".isBlank());   // sprawdza długość stringa, ale ignoruje spacje
        System.out.println(" ".isEmpty());          //sprawdza długość stringa, wliczając w to spacje

        //zamienianie znaków
        String replace = str1.replace("llo", "QWE");
        System.out.println(replace);
        String replaceAll = str1.replaceAll("l", "x");
        System.out.println(replaceAll);

        //wyciągamy mniejszy tekst z większego tekstu
        String substring = str1.substring(1, 4);        //wyciąga od indeksu początkowego (0) do indeksu końcowego
        System.out.println(substring);                  //ostatni indeks NIE jest brany pod uwagę

        //długość znaków w tekście
        String textWithWhiteSpaces = "    to jest jakiś tekst    ";
        System.out.println(textWithWhiteSpaces.length());

        String strip = textWithWhiteSpaces.strip();     //usuwa białe znaki z początku i końca tekstu, pozostawiając spacje w środku!
        System.out.println(strip);
        System.out.println(strip.length());

    }
}
