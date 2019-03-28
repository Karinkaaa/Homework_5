package staticDemo.staticClasses;

import java.util.Random;

public class IntUtils {

    private IntUtils() {
    }

    public static int plus(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static double pow(int number, int pow) {
        if (pow > 0) {
            return involution(number, pow);
        } else if (pow < 0) {
            return 1.0 / involution(number, Math.abs(pow));
        } else {
            return 1;
        }
    }

    private static int involution(int number, int pow) {
        int res = 1;
        for (int i = 0; i < pow; i++) {
            res *= number;
        }
        return res;
    }

    public static int getRandomInt(int minBound, int maxBound) {
        Random random = new Random();
        if(minBound > maxBound) {
            return random.nextInt(minBound - maxBound) + maxBound;
        }
        return random.nextInt(maxBound - minBound) + minBound;
    }
}
