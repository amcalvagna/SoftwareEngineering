package org.labisd.sum;

public class Sommatore {

    public int sum(int a, int b) {
        if (a < 0 || b < 0)
            throw new NegativeValuesException("values should be non negative");
        return a + b;
    }
}
