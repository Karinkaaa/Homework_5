package interfaceDemo.animalClasses;

import interfaceDemo.interfaces.Swimable;

public class Dolphin implements Swimable {
    @Override
    public void sing() {
        System.out.println("Dolphin sings.");
    }

    @Override
    public void swim() {
        System.out.println("Dolphin swims.");
    }
}
