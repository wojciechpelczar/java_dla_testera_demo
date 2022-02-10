package model.computer;

public class Laptop extends Computer {         //dziedziczenie EXTENDS (IS A)

    private int batteryLevel;

    public Laptop(String name, String type, int disc, int ram, int batteryLevel) {
        super(name, type, disc, ram);     //wywołanie konstruktora z klasy matki (musi być zawsze pierwsze, dopiero później rozszerzamy o kolejne pola)
        this.batteryLevel = batteryLevel;
    }

    //nadpisywanie metod występuje tylko przy dziedziczeniu!
    @Override
    public void switchOn() {
        System.out.println("Checking battery level");
        if (batteryLevel > 50) {
            super.switchOn();
        } else {
            System.out.println("Battery level to low!");
        }
    }

    public void setBatteryLevel(int newBatteryLevel) {
        batteryLevel = newBatteryLevel;
    }
}
