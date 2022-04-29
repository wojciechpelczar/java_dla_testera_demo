package model.computer;

//klasa abstrakcyjna - jakoś opisuje komputer, natomiast nie będzie to żaden konkretny komputer
//będzie słyżyła po to by inne klasy mogły dziedziczyć z tej klasy (pola, metody) - sama klasa nie będzie służyła do tworzenia obiektów
abstract public class Computer {

    //MODYFIKATORY DOSTĘPU - access modifier
    // DOMYŚLNY  - działa TYLKO w obrębie jednego pakietu - nie podajemy go
    // PUBLICZNY - daje dostęp (do konstruktora, pól i metod) w CAŁYM projekcie
    // PRIVATE   - dostęp do pola/metody TYLKO w obrębie danej klasy
    // PROTECTED - będzie omówiony przy dziedziczeniu

    //opisujemy jak będzie wyglądać nasz PC i z czego będzie się składać
    //są to pola obiektu i klasy które dzieciczą, będą dziedziczyły również też te pola obiektu
    protected String name;
    protected String type;
    protected int disc;
    protected int ram;
    protected boolean state;
    protected int volumeLevel;

    public Computer(String name, String type, int disc, int ram) {
        this.name = name;
        this.type = type;
        this.disc = disc;
        this.ram = ram;
        state = false;     //ustawiamy domyślnie (ręcznie) na fałsz i nie pobieramy w konstruktorze !
        volumeLevel = 50;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        this.volumeLevel = volumeLevel;
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
        System.out.println("Wyłączam komputer: " + name);
        state = false;
    }

    public boolean getState() {
        return state;
    }

    //metod abstrakcyjne nie posiadają swojego ciała, podajemy tylko nazwę i zwracany typ (czyli sygnaturę)
    //po dodaniu metody abstrakcyjnej, to WSZYSTKIE klasy, które będą dziedziczyły po tej klasie abstrakcyjnej, muszą tę metodę zaimplementować (czyli dodać/nadpisać w swojej klasie)
    public abstract int volumeUp();
    public abstract int volumeDown();

    public abstract int volumeUp(int newVolumeLevel);
    public abstract int volumeDown(int newVolumeLevel);

}
