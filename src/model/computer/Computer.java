package model.computer;

public class Computer {

    //MODYFIKATORY DOSTĘPU - access modifier
    // DOMYŚLNY  - działa TYLKO w obrębie jednego pakietu - nie podajemy go
    // PUBLICZNY - daje dostęp (do konstruktora, pól i metod) w CAŁYM projekcie
    // PRIVATE   - dostęp do pola/metody TYLKO w obrębie danej klasy
    // PROTECTED - będzie omówiony przy dziedziczeniu

    //opisujemy jak będzie wyglądać nasz PC i z czego będzie się składać
    protected String name;
    protected String type;
    protected int disc;
    protected int ram;
    protected boolean state;

    public Computer(String name, String type, int disc, int ram) {
        this.name = name;
        this.type = type;
        this.disc = disc;
        this.ram = ram;
        this.state = false;     //ustawiamy domyślnie (ręcznie) na fałsz i nie pobieramy w konstruktorze !
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDisc() {
        return disc;
    }

    public void setDisc(int disc) {
        this.disc = disc;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void switchOn() {
        System.out.println("SUPER - ustawiam pole state na true");
        state = true;
    }

    public void switchOff() {
        state = false;
    }

    public boolean getState() {
        return state;
    }

}
