package model.computer;

public class Laptop extends Computer{         //dziedziczenie EXTENDS (IS A)

    public Laptop(String name, String type, int disc, int ram) {
        super(name, type, disc, ram);
    }
}
