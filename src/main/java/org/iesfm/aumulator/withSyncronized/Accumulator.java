package org.iesfm.aumulator.withSyncronized;

public class Accumulator {

    private int value = 0;

    public synchronized void inc() {
        value++;
    }

    public synchronized void dec() {
        value--;
    }

    public int getValue() {
        return value;
    }
}
