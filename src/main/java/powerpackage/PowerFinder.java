package powerpackage;

public class PowerFinder {
    public static int of(int base, int exponent) {
        int p = 1;
        for (int i = 0; i<exponent; i++) {
            p *= base;
        }
        return p;
    }
}
