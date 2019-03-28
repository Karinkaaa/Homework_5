package interfaceDemo.animalClasses;

import interfaceDemo.interfaces.IBird;

public class Duck implements IBird {
    @Override
    public void fly() {
        System.out.println("Duck flies.");
    }

    @Override
    public void swim() {
        System.out.println("Duck swims.");
    }

    @Override
    public void sing() {
        System.out.println("Duck sings.");
    }

    @Override
    public void hatchesEggs() {
        System.out.println("Duck hatches eggs.");
    }
}
