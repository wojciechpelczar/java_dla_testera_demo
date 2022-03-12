package model.computer;

public class PC extends Computer {    //dziedziczenie EXTENDS (IS A)

    private boolean powerSupply;

    public PC(String name, String type, int disc, int ram) {
        super(name, type, disc, ram);    //wywołanie konstruktora z klasy matki
        powerSupply = false;
    }

    public void showComputerName() {
        System.out.println(name);
    }

    //nadpisywanie metod występuje tylko przy dziedziczeniu!
    @Override
    public void switchOn() {
        System.out.println("Checking connections to power suply");
        if (powerSupply) {
            super.switchOn();
        } else {
            System.out.println("Not connected to power supply");
        }
    }

    @Override
    public void switchOff() {
        System.out.println("Wyłączam PC: " + name);
        state = false;
    }

    public void setPowerSupply(boolean powerSupply) {
        this.powerSupply = powerSupply;
    }

    @Override
    public int volumeUp() {
        return volumeLevel += 1;
    }

    @Override
    public int volumeDown() {
        volumeLevel -= 1;
        if (volumeLevel <= 0) {
            return 0;
        } else {
            return volumeLevel;
        }
    }

    @Override
    public int volumeUp(int newVolumeLevel) {
        //TODO volume should be positive number
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
