import model.AccessUsers;

public class AccessModifiers {
    public static void main(String[] args) {

        //MODYFIKATORY DOSTĘPU - access modifier

        // DOMYŚLNY  - działa TYLKO w obrębie jednego pakietu
        // PUBLICZNY - daje dostęp (do konstruktora, pól i metod) w CAŁYM projekcie
        // PROTECTED - będzie omówiony przy dziedziczeniu
        // PRIVATE   - dostęp do pola/metody TYLKO w obrębie danej klasy
        AccessUsers accessUsers = new AccessUsers("Wojtek", "Pelczar", "wdasda@o2.pl", 19); //konstruktor
//        System.out.println(accessUsers.firstName);
//        boolean userAdult = accessUsers.isUserAdult();
//        System.out.println(userAdult);

        System.out.println(accessUsers.getEmail());
        accessUsers.setEmail("tomaszowski@o2.ru");
        System.out.println(accessUsers.getEmail());
//        System.out.println(accessUsers.isUserAdult());

    }
}
