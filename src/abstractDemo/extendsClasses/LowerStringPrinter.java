package abstractDemo.extendsClasses;

import abstractDemo.abstractClass.AbstractStringPrinter;

public class LowerStringPrinter extends AbstractStringPrinter {
    @Override
    public void print(String str) {
        System.out.println(str.toLowerCase());
    }
}
