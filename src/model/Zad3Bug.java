package model;

public class Zad3Bug {

    //POLA OBIEKTU
    private String bugDescription;
    private String email;
    private int priority;
    private boolean status;

    //KONTRUKTOR
    public Zad3Bug(String bugDescription, String email, int priority) {
        this.bugDescription = bugDescription;
        this.email = email;
        this.priority = priority;
        this.status = false;
    }

    //gettery i settery
    public String getBugDescription() {
        return bugDescription;
    }

    public void setBugDescription(String bugDescription) {
        if (bugDescription.length() < 10) {
            System.out.println("Ten opis ma mniej niż 10 znaków");
        } else {
            this.bugDescription = bugDescription;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (!email.contains("@")) {
            System.out.println("To NIE jest poprawny email");
        } else {
            this.email = email;
        }
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        switch (priority) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                this.priority = priority;
                break;
            default:
                System.out.println("niepoprawny priorytet błędu");
        }
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //METODY
    public void showAllInfo() {
        System.out.println("OPIS: " + bugDescription + ". EMAIL: " + email + ". PRIORYTET: " + priority + ". STATUS: "
                + status);
    }

    public void showCreator() {
        System.out.println("Email: " + email);
    }

    public void showBugStatus() {
        System.out.println("Status: " + status);
    }


}
