package model.computer;

public interface Music {

    //interface - DRUGI sposób na abstrakcję w Java

    //1. NIE MOŻNA DODAWAĆ PÓL OBIEKTU
            // pola obiektu opisują stan obiektu
            // metody opisują zachowanie  <-- w interfejsie dozwolone są tylko metody

    //2. MOŻNA TWORZYĆ TYLKO STAŁE - DOMYŚLNIE 'public static final' (więc to usuwamy z pól obiektów, bo jest domyślne)
            //do stałej przypisujemy wartość raz i już nie będziemy mogli jej zmienić
            //public static final String NAME = "MUSIC";
    String NAME = "MUSIC";


    //3. TYLKO METODY ABSTRAKCYJNE (nie zawierają ciała) - - DOMYŚLNIE 'public abstract'
    void playMusic();
    void pauseMusic();
    void stopMusic();

    //od JAVY 8
    //4. możemy tworzyć normalne/zwykłe METODY domyślene (z ciałem, które możemy dodać do interfejsu) - należy dodać słówko 'default'
    default void sayHelloFromMusic() {
        System.out.println("Hello from default");
    }

    //5. METODY STATYCZNE - metoda należy do interfejsu, wywołujemy ją Music.getName();
    static String getName() {
        privateMethod();     //<-- możemy wywołać w kodzie prywatną statyczną metodę
        return NAME;
    }

    //od JAVY 9
    //6. PRYWATNE STATYCZNE METODY
    private static void privateMethod() {
        System.out.println("hello from private method");
    }
}
