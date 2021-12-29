public class InstrukcjeSterujące {

    public static void main(String[] args) {

        int numOne = 1;
        int numTwo = 2;

//        instrukcje sterujące
//        if(true){
//
//        }

        if (numOne < numTwo) {
            System.out.println("Number one is less then number two");
        } else {
            System.out.println("Number one is greater then number two");
        }

        //SWITCH
        String homePage = "Home";
        String loginPage = "Login";
        String contactPage = "Contact";

        String page = contactPage;
//        String page = "jakas strona";   --> default

        switch (page) {
            case "Home":
                System.out.println("Przelaczam sie do strony Home");
                break;
            case "Login":
                System.out.println("Przelaczam sie do strony Login");
                break;
            case "Contact":
                System.out.println("Przelaczam sie do strony Contact");
                break;
            default:
                System.out.println("Nie znalazlem takiej strony");
        }


        //Modulo - reszta z dzielenia
        System.out.println(10 % 5);
        System.out.println(10 % 3);
        System.out.println(10 % 4);

        if (10 % 2 == 0) {
            System.out.println("jest liczba parzysta");
        } else {
            System.out.println("nie jest liczba parzysta");
        }
    }
}
