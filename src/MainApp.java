public class MainApp {

    public static void main(String[] args) {
        //co to jest klasa
        //z czego sklada sie klasa

        //TYP nazwa = new obiekt()
        User wojtek = new User();
        wojtek.firstname = "Wojtek";
        wojtek.lastname = "Testowy";
        wojtek.email = "wojtek@test.pl";
        wojtek.age = 17;
        wojtek.isAdult = false;
        wojtek.getFullName();
        wojtek.getAllInfo();

        System.out.println(wojtek.getUserAge());  //wyświetlenie na konsolę metody typu int
        int wojtekUserAge = wojtek.getUserAge();  //przypisanie wartości zwracanej metody typu int do nowej zmiennej typu int
        System.out.println("Wojtek ma lat: " + wojtekUserAge);
        boolean isWojtekAdult = wojtek.isUserAdult();
        System.out.println("Czy Wojtek jest pełnoletni? " + isWojtekAdult);

        User tomek = new User();
        tomek.firstname = "Tomasz";
        tomek.lastname = "Booksy";
        tomek.email = "booksy@test.pl";
        tomek.age = 31;
        tomek.isAdult = true;
        tomek.getFullName();
        tomek.getAllInfo();

    }
}
