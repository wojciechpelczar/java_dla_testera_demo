public class User {

    //1. POLA OBIEKTU
    //opisują z czego będzie składał się nowy obiekt

    String firstName;  //default: NULL
    String lastName;
    String email;
    int age;          //default: 0
    boolean isAdult;   //default: false
    //https://cs-fundamentals.com/java-programming/java-primitive-data-types

    //3. KONSTRUKTOR - służy do tworzenia instancji obiektu
    //- nazwa konstruktora jest taka sama jak nazwa klasy
    //- konstruktor piszemy wielką lierą
    //- konstruktor nie ma zwracanego typu

//      domyślny konstruktor - tworzy pusty obiekt !!!
//    User() {
//
//    }

    //w Java jest konwencja, że nazwy parametrów są takie same jak nazwy pól obiektów
    //słówko this. jest to wskaźnik na dany obiekt
    User(String firstName, String lastName, String email, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.isAdult = isUserAdult();
    }

    //2. METODY
    //opisują co dany obiekt będzie mógł robić

    //zwracany typ + nazwa metody (+argument/parametr)
//    void getFullName() {
//        System.out.println(firstName + " " + lastName);
//    }

    void getAllInfo() {
        System.out.println(firstName + " " + lastName + " " + email + " " + age + " " + isAdult);
    }

//    int getUserAge() {
//        return age;
//    }

    boolean isUserAdult() {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

//    void greetings(String name) {
//        System.out.println("Hi " + name + ". Nice to see you");
//    }
//
//    //przeciążanie metody (zamiast tworzyć nowe metody greetingsFullName) - muszą się różnić ilością parametrów, lub typem
//    void greetings(String firstName, String lastName) {
//        System.out.println("Hi " + firstName + " " + lastName + ". Nice to see you.");
//    }
//
//    void howOldAreYou(String name, int userAge) {
//        System.out.println("Hi " + name + ". You are " + userAge + " years old");
//    }
//
//    int yourAgePlus10(int userAge) {
//        return userAge + 10;
//    }

}
