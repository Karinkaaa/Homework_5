package interfaceDemo.animalClasses;

import interfaceDemo.interfaces.Flyable;

public class Sparrow implements Flyable {
    @Override
    public void fly() {
        System.out.println("Sparrow flies.");
    }

    @Override
    public void sing() {
        System.out.println("Sparrow sings.");
    }
}
