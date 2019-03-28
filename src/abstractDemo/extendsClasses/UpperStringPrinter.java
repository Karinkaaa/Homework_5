package abstractDemo.extendsClasses;

import abstractDemo.abstractClass.AbstractStringPrinter;

public class UpperStringPrinter extends AbstractStringPrinter {
    @Override
    public void print(String str) {
        System.out.println(str.toUpperCase());
    }
}
