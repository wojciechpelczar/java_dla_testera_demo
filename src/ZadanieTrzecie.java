import model.Zad3Bug;

public class ZadanieTrzecie {

    public static void main(String[] args) {

        Zad3Bug bug1 = new Zad3Bug("Aplikacja zamyka się samoczynnie", "wijpe@o2.ok", 2);
        Zad3Bug bug2 = new Zad3Bug("Aplikacja przestała działać", "mizzo@o2.ok", 5);
        Zad3Bug bug3 = new Zad3Bug("Aplikacja nie reaguje", "frappe@o2.ok", 1);
        Zad3Bug bug4 = new Zad3Bug("Aplikacja zacina się", "mozibo@o2.ok", 3);

        //1)
//        bug1.showAllInfo();
//        bug1.setBugDescription("3123 dadasdas");
//        bug1.showAllInfo(); //przy krótkim opisie, pole bugDescription się nie ustawił


        //2)
//        bug1.showAllInfo();
//        bug1.setEmail("sdasdadasdado2@pl");
//        bug1.showAllInfo();

        //3)
        bug1.showAllInfo();
        bug1.setPriority(-5);
        bug1.showAllInfo();

    }
}

