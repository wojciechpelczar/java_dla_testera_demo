public class Tablice {

    public static void main(String[] args) {

        //1. Tablica - zbiór danych tego samego typu!!!
        //2. Zawsze musimy podać rozmiar tablicy (minus tablic!)
        //3. Ostatni element = długość tablicy - 1
        //4. [] - tablica
        //5. int[] numbers = new int[10]     //nazwę tablicy podajemy w liczbie mnogiej (s)
        //6. Listy wyparły tablice!

        String[] names = new String[5];
        //String[] newNames = {"Igor", "Patrycja", "Zosia"};     //inny sposób tworzenia tablic
        //int[] numbers = {1,2,3,4,5,6,7};                       //inny sposób tworzenia tablic

        // wartości tablicy ["Bartek", "Asia", "Monika", "Grzegorz", "Roman"]
        // index tablicy    [    0   ,    1  ,    2    ,      3    ,    4   ]

        //names[0] = "Bartek";       // domyślną wartością dla typu String jest null
        names[0] = "Bartek";
        names[1] = "Asia";
        names[2] = "Monika";
        names[3] = "Grzegorz";
        names[4] = "Roman";

        //różnica: musimy znać index tablicy (możemy przeskakiwać pomiędzy tablicami lub przejdzie przez wszystkie elementy tablicy)
        //for (licznik; warunek; zmiana licznika);
        for (int i = 0; i < names.length; i++) {
            if (i % 2 == 0) {                          //reszta z dzielenia = 0 (modulo) --> wyświetlimy tylko elementy z {parzystych} indeksów
                System.out.println(names[i].toLowerCase());   //zamieniamy na małe litery
            }
        }

        //różnica: zawsze przechodzi przez wszystkie elementy tablicy
        //foreach (podajemy jakie elementy będziemy pobierać z naszej tablicy (każdy element będzie stringiem 'name' (liczba pojedyńcza))
        //po :(dwukropku) podajemy z jakiej tablicy chcemy wyciągać te wartości (names)
        for (String name : names) {
            System.out.println(name.toUpperCase());      //zamieniamy na wielkie litery
        }

        System.out.println(names.length);
        System.out.println(names[0]);    //wyświetlenie pierwszej wartości z tablicy
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[4]);
        //System.out.println(names[5]);   //ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5

        //zwiększanie o 1 na różne sposoby
        int number = 10;
        number = number +1;
        System.out.println(number);
        number += 1;
        System.out.println(number);

        System.out.println(number++);  //post inctrement - zwiększanie wartości o 1 przy następnym użyciu zmiennej
        System.out.println(number);

        System.out.println(++number);  //pre inctrement - najpierw zwiększamy wartość i wyświetlona (możemy używać od razu zwiększonej wartości)
    }
}
