public class Bug {

    //POLA OBIEKTU
    String bugDescription;
    String email;
    int priority;
    boolean status;

    //KONTRUKTOR
    Bug(String bugDescription, String email, int priority) {
        this.bugDescription = bugDescription;
        this.email = email;
        this.priority = priority;
        this.status = false;
    }

    //METODY
    void showAllInfo() {
        System.out.println("OPIS: " + bugDescription + ". EMAIL: " + email + ". PRIORYTET: " + priority + ". STATUS: "
                + status);
    }

    void showCreator() {
        System.out.println("Email: " + email);
    }

    void showBugStatus() {
        System.out.println("Status: " + status);
    }

    int getPriority() {
        return priority;
    }
}
