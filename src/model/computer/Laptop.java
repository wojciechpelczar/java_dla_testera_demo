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

    @Override
    public void switchOff() {
        System.out.println("Wyłączam Laptop: " + name);
        state = false;
    }

    public void setBatteryLevel(int newBatteryLevel) {
        batteryLevel = newBatteryLevel;
    }

    @Override
    public int volumeUp() {
        return volumeLevel += 5;
    }

    @Override
    public int volumeDown() {
        volumeLevel -= 2;
        if (volumeLevel <= 0) {
            return 0;
        } else {
            return volumeLevel;
        }
    }

    @Override
    public int volumeUp(int newVolumeLevel) {
        volumeLevel += newVolumeLevel;
        if (volumeLevel >= 100) {
            volumeLevel = 100;
        }
        return volumeLevel;
    }

    @Override
    public int volumeDown(int newVolumeLevel) {
        volumeLevel -= newVolumeLevel;
        if (volumeLevel <= 0) {
            volumeLevel = 0;
        }
        return volumeLevel;
    }
}
