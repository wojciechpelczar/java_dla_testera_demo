import model.computer.Computer;
import model.computer.Laptop;
import model.computer.PC;

public class MainAppPolimorfizm {

    public static void main(String[] args) {

        //POLIMORFIZM = WIELE FORM


        //tworzymy referencje (zmienne) do obiektu jednego typu --> Computer (klasa matki, najwyższego typu)
        //zmienne (referencje do obiektu) może być najwyższego typu --> w naszym wypadku Computer
        //do jednego typu zmiennej możemy przypisać obiekty z różnych klas / różne formy (implementacje, które dziedziczą po klasie matce, ale te klasy mogą być różne, mogą mieć różne formy (PC/Laptop))
        //"generalna referencja do obiektu"
        PC officeComputer1 = new PC("Office computer 1", "HP", 240, 16);
        Computer officeComputer2 = new PC("Office computer 2", "HP", 512, 32);
        Computer officeComputer3 = new PC("Office computer 3", "Dell", 512, 32);
        Computer gamingLaptop = new Laptop("XPS15", "PRO", 1024, 64, 80);
        Computer macbookLaptop = new Laptop("mac book", "PRO", 1024, 64, 80);

        //w tablicy można zapisać tylko jeden typ
        // przechowujemy w tablicy referencje do obiektów (nie przechowujemy samych obiektów)
        Computer[] computers = {officeComputer1, officeComputer2, officeComputer3, gamingLaptop, macbookLaptop};

        //for each - zmienna computer typu Computer (klasy matki)
        //gdy dodamy metodę switchOff() do klasy dziecko (nadpiszemy metodę z klasy matki) --> gdy wywołujemy metodę, to najpierw sprawdzamy klasę dziecko, jeżeli tam nie istnieje, to idziemy do klasy matki
        for (Computer computer: computers) {
            computer.switchOff();
        }

        //RZUTOWANIE typów -> rzutowanie na inny typ / zmiana typu --> gdy w klasie 'dziecko' istnieje metoda, które nie istnieje w klasie 'matce'
        officeComputer1.showComputerName();
        ((PC)officeComputer2).showComputerName();

    }
}
