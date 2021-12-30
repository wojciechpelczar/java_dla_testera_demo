public class MainApp {

    public static void main(String[] args) {
        //co to jest klasa
        //z czego sklada sie klasa

        //TYP nazwa = new obiekt()
        User wojtek = new User("Wojtek", "Testowy", "wojtek@test.pl", 17);  //wywołanie konstruktora

        wojtek.getAllInfo();
//        User wojtek1 = new User("WOJTEK1", "TESTOWY1", "WOJTEK1@TEST.PL", 65, true);
//        System.out.println(wojtek1.firstName);

//        //ustawianie pól, stara metoda zanim poznałem konstruktor (zostało przeniesione do obiektu 'wojtek')
//        wojtek.firstName = "Wojtek";
//        wojtek.lastName = "Testowy";
//        wojtek.email = "wojtek@test.pl";
//        wojtek.age = 17;
//        wojtek.isAdult = false;

//        //metody bez parametrów
//        //typu: void
//        wojtek.getFullName();
//        wojtek.getAllInfo();
//        //typu: int/boolean
//        System.out.println(wojtek.getUserAge());  //wyświetlenie na konsolę metody typu int
//        int wojtekUserAge = wojtek.getUserAge();  //przypisanie wartości zwracanej z metody typu int do nowej zmiennej typu int
//        System.out.println("Wojtek ma lat: " + wojtekUserAge);
//        boolean isWojtekAdult = wojtek.isUserAdult();
//        System.out.println("Czy Wojtek jest pełnoletni? " + isWojtekAdult);
//
//        //metody z parametrami
//        wojtek.greetings("Joanna");
//        wojtek.greetings("Ignacy");
//        //przeciążanie metody greetings
//        wojtek.greetings("Zygmunt", "Małolepszy");
//        wojtek.howOldAreYou("Maurycy", 17);
//        wojtek.howOldAreYou("Izabela", 12);
//        int wojtekAgePlus10 = wojtek.yourAgePlus10(13);
//        System.out.println(wojtekAgePlus10);

        //TYP nazwa = new obiekt()
        User tomek = new User("Tomasz", "Booksy", "booksy@test.pl", 31);

        tomek.getAllInfo();
//        tomek.firstName = "Tomasz";
//        tomek.lastName = "Booksy";
//        tomek.email = "booksy@test.pl";
//        tomek.age = 31;
//        tomek.isAdult = true;

//        //metody bez parametrów
//        //typu: void
//        tomek.getFullName();
//        tomek.getAllInfo();
//
//        //metody z parametrami
//        System.out.println(tomek.yourAgePlus10(tomek.age));

    }
}
