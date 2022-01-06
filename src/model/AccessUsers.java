package model;

public class AccessUsers {

    //ENKAPSULACJA - ukrywanie danych albo ukrywanie implementacji
    //utworzyliśmy prywatne pola obiektów i do tych pól obiektów wystawiliśmy publiczne metody (*publiczne gettery i settery)
    // - ukryliśmy dane (dostęp do danych), ale udostępniliśmy gettery i settery (dodaliśmy walidację podczas wystawiania pól)

    //pola obiektu
    //dobrą praktyką programistyczną jest ustawianie pól na 'private'
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private boolean isAdult;

    //konstruktor - pobiera jakieś parametry, a później ustawia pola obiektów wartościami parametrów
    public AccessUsers(String firstName, String lastName, String email, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.isAdult = isUserAdult();
    }

    public String getEmail() {      //gettery są tego samego typu co pole obiektu
        return email;
    }

    public void setEmail(String email) {                        //settery są metodami void'owymi
        if (email.endsWith(".ru")) {                            //możemy dodać walidację, natomiast nie mamy takiej możliwości jeżeli pola tworzymy publiczne
            System.out.println("RU domain is not allowed!");
        } else {
            this.email = email;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }

    //METODY
    public void getAllInfo() {
        System.out.println(firstName + " " + lastName + " " + email + " " + age + " " + isAdult);
    }

    public void getFullName() {
        System.out.println(firstName + " " + lastName);
    }

    public int getUserAge() {
        return age;
    }

    public boolean isUserAdult() {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public void greetings(String name) {
        System.out.println("Hi " + name + ". Nice to see you");
    }

    //przeciążanie metody (zamiast tworzyć nowe metody greetingsFullName) - muszą się różnić ilością parametrów, lub typem
    public void greetings(String firstName, String lastName) {
        System.out.println("Hi " + firstName + " " + lastName + ". Nice to see you.");
    }

    public void howOldAreYou(String name, int userAge) {
        System.out.println("Hi " + name + ". You are " + userAge + " years old");
    }

    public int yourAgePlus10(int userAge) {
        return userAge + 10;
    }
}
