package org.iesfm.aumulator.withSyncronized;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Accumulator acc = new Accumulator();

        Thread t1 = new Thread(new AccTask(1000, acc));
        acc.inc();

        Thread t2 = new Thread(new DecTask(1000, acc));
        acc.dec();

        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


       log.info("El resultado es " + acc.getValue());

    }
}
