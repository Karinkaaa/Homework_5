package interfaceDemo.animalClasses;

import interfaceDemo.interfaces.IFish;

public class Shark implements IFish {
    @Override
    public void swim() {
        System.out.println("Shark swims.");
    }
}
