package interfaceDemo.mainClass;

import interfaceDemo.animalClasses.Dolphin;
import interfaceDemo.animalClasses.Duck;
import interfaceDemo.animalClasses.Shark;
import interfaceDemo.animalClasses.Sparrow;

public class UsingInterfaces {
    public static void main(String[] args) {

        /* Создать интерфейсы IAnimal, Swimable, Flyable, IBird, IFish, придумать в них тестовые методы,
        создать несколько классов которые имплементируют эти интерффейсы. Решение можно оформить в одном
        файле java - интерфейсы и классы просто объявлять не public. */

       getInfoAboutSparrow();
       getInfoAboutDuck();
       getInfoAboutShark();
       getInfoAboutDolphin();

    }

    public static void getInfoAboutSparrow() {
        Sparrow sparrow = new Sparrow();
        sparrow.sing();
        sparrow.fly();
        System.out.println();
    }

    public static void getInfoAboutShark() {
        Shark shark = new Shark();
        shark.swim();
        System.out.println();
    }

    public static void getInfoAboutDuck() {
        Duck duck = new Duck();
        duck.sing();
        duck.fly();
        duck.swim();
        duck.hatchesEggs();
        System.out.println();
    }

    public static void getInfoAboutDolphin() {
        Dolphin dolphin = new Dolphin();
        dolphin.sing();
        dolphin.swim();
        System.out.println();
    }
}
