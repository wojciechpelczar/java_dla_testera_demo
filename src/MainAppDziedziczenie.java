import model.computer.Laptop;
import model.computer.PC;

public class MainAppDziedziczenie {

    public static void main(String[] args) {

        //1. IS A - jest czymś - DZIEDZICZENIE
        //2. HAS A - posiada coś / składa się z czegoś - KOMPOZYCJA

        //pytanie: czy jedna klasa ma dziedziczyć po drugiej klasie?
        //musimy odpowiedzieć na pytanie: czy pomiędzy tymi klasami będzie zachodziła relacja IS A, a może HAS A?

        PC pc1 = new PC("Dell", "stacjonarny", 240, 16);
        PC pc2 = new PC("HP", "stacjonarny", 512, 32);
        Laptop laptop1 = new Laptop("XPS15", "laptop", 1024, 64);

        String name = pc1.getName();
        System.out.println(name);
        pc1.switchOn();
        boolean statePC1 = pc1.getState();
        System.out.println(statePC1);
        boolean stateLaptop1 = laptop1.getState();
        System.out.println(stateLaptop1);

    }
}
