package org.iesfm.aumulator.withSyncronized;

public class DecTask implements Runnable {

    private int n;
    private Accumulator acc;

    public DecTask(int n, Accumulator acc) {
        this.n = n;
        this.acc = acc;
    }

    @Override
    public void run() {
        for (int i = 0; i < n; i++) {
            acc.dec();
        }
    }
}
