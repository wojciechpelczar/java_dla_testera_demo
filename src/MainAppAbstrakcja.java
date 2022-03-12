import model.computer.Computer;
import model.computer.Laptop;
import model.computer.PC;

public class MainAppAbstrakcja {

    public static void main(String[] args) {

        Computer officeComputer = new PC("Office computer 1", "HP", 240, 16);
        Computer gamingLaptop = new Laptop("XPS15", "PRO", 1024, 64, 80);

        //ABSTRAKCJA vs. KONKRETNE ROZWIĄZANIA
        //pierwsza zaleta !  --> nie możemy utworzyć obiektu z klasy abstrakcyjnej (:Computer)
        //druga zaleta ! --> cały czas możemy używać typu 'Computer' jako referencji - typu klasy matki
        //jeżeli klasa posiada przynajmniej jedną metodę abstrakcyjną, to cała klasa też musi być abstrakcyjna
        //KALSY DZIEDZICZĄCE MUSZĄ(!!!) NADPISAĆ WSZYSTKIE METODY ABSTRAKCYJNE Z ABSTRAKCYJNEJ KLASY MATKI

        //samo określenie 'Computer' jest pewnego rodzaju abstrakcją -> abstrakcyjny byt
        //Computer computer = new Computer("test", "testowy", 123, 22);

//        System.out.println(officeComputer.volumeUp());
//        System.out.println(gamingLaptop.volumeUp());
//        System.out.println(officeComputer.volumeDown());
//        System.out.println(gamingLaptop.volumeDown());
//        System.out.println(gamingLaptop.volumeDown());
//        System.out.println(gamingLaptop.volumeDown());
//        System.out.println(gamingLaptop.volumeDown());
//        System.out.println(gamingLaptop.volumeDown());

        System.out.println(officeComputer.getVolumeLevel());
        System.out.println(officeComputer.volumeUp(56));
        System.out.println(officeComputer.volumeUp(56));
        System.out.println(officeComputer.volumeDown(31));
        System.out.println(officeComputer.volumeDown(51));
        System.out.println(officeComputer.volumeDown(31));
        System.out.println(officeComputer.volumeUp(11));

    }
}
