public class User {

    //1. POLA OBIEKTU
    //opisują z czego będzie składał się nowy obiekt

    String firstname;  //default: NULL
    String lastname;
    String email;
    int age;          //default: 0
    boolean isAdult;   //default: false
    //https://cs-fundamentals.com/java-programming/java-primitive-data-types

    //2. METODY
    //opisują co dany obiekt będzie mógł robić

    //zwracany typ + nazwa metody (+argument/parametr)
    void getFullName() {
        System.out.println(firstname + " " + lastname);
    }

    void getAllInfo() {
        System.out.println(firstname + " " + lastname + " " + email + " " + age + " " + isAdult);
    }

    int getUserAge(){
        return age;
    }

    boolean isUserAdult(){
        if(age>=18){
            return true;
        }else {
            return false;
        }
    }

}
