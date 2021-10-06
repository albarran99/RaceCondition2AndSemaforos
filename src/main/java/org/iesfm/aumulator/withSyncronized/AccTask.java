package org.iesfm.aumulator.withSyncronized;

public class AccTask implements Runnable{

    private int n;
    private Accumulator acc;

    public AccTask(int n, Accumulator acc) {
        this.n = n;
        this.acc = acc;
    }

    @Override
    public void run() {
        for (int i = 0; i < n; i++) {
            acc.inc();
        }
    }
}
