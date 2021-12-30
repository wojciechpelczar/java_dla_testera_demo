public class User {

    //1. POLA OBIEKTU
    //opisują z czego będzie składał się nowy obiekt

    String firstName;  //default: NULL
    String lastName;
    String email;
    int age;          //default: 0
    boolean isAdult;   //default: false
    //https://cs-fundamentals.com/java-programming/java-primitive-data-types

    //2. METODY
    //opisują co dany obiekt będzie mógł robić

    //zwracany typ + nazwa metody (+argument/parametr)
    void getFullName() {
        System.out.println(firstName + " " + lastName);
    }

    void getAllInfo() {
        System.out.println(firstName + " " + lastName + " " + email + " " + age + " " + isAdult);
    }

    int getUserAge() {
        return age;
    }

    boolean isUserAdult() {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    void greetings(String name) {
        System.out.println("Hi " + name + ". Nice to see you");
    }

    //przeciążanie metody (zamiast tworzyć nowe metodu greetingsFullName) - muszą się różnić ilością parametrów, lub typem
    void greetings(String firstName, String lastName ){
        System.out.println("Hi " + firstName + " " + lastName + ". Nice to see you.");
    }

    void howOldAreYou(String name, int userAge) {
        System.out.println("Hi " + name + ". You are " + userAge + " years old");
    }

    int yourAgePlus10(int userAge){
        return userAge+10;
    }

}
