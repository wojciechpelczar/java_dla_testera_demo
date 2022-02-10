import model.computer.Laptop;
import model.computer.PC;

public class MainAppDziedziczenie {

    public static void main(String[] args) {

        //1. IS A - (coś) jest czymś --> DZIEDZICZENIE
        //2. HAS A - posiada coś / składa się z czegoś (obiekt będzie mógł się składać z innych obiektów) --> KOMPOZYCJA

        //pytanie: czy jedna klasa ma dziedziczyć po drugiej klasie?
        //musimy odpowiedzieć na pytanie: czy pomiędzy tymi klasami będzie zachodziła relacja 'IS A', a może 'HAS A'?

        PC pc1 = new PC("Dell", "stacjonarny", 240, 16);
        PC pc2 = new PC("HP", "stacjonarny", 512, 32);
        Laptop laptop1 = new Laptop("XPS15", "laptop", 1024, 64, 80);

//        String name = pc1.getName();
//        System.out.println(name);
//        pc1.switchOn();
//        boolean statePC1 = pc1.getState();
//        System.out.println(statePC1);
//        boolean stateLaptop1 = laptop1.getState();
//        System.out.println(stateLaptop1);
//
//        pc1.showComputerName();


        //SUPER - zastosowanie:
        //1. odnosi się do klasy matki, możemy wywołać metodę z klasy matki o tej samej nazwie metody
        //2. wywołanie konstruktora z klasy matki


        pc2.switchOn();                 //najpierw wywołujemy metodę z klasy dziecko, gdyż jest bardziej 'precyzyjna'
        System.out.println(pc2.getState());
        pc2.setPowerSupply(true);
        pc2.switchOn();
        System.out.println(pc2.getState());

        laptop1.setBatteryLevel(0);    //utworzenie nowego settera - pobiera on nowy poziom baterii = 0
        laptop1.switchOn();             //gdy w klasie dziecko nie ma takiej metody, to wywołujemy z klasy matki
        System.out.println(laptop1.getState());
    }
}
