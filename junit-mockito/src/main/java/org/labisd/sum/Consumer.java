package org.labisd.sum;

public class Consumer {
    private Sommatore sommatore;

    public Consumer(Sommatore sommatore) {
        this.sommatore = sommatore;
    }

    public int sumTwice(int a, int b) {
        return 2 * sommatore.sum(a, b);
    }
}
