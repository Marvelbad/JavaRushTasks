package com.javarush.task.task25.task2506;

import java.io.IOException;

public class LoggingStateThread extends Thread {
    private Thread target;

    public LoggingStateThread(Thread target) {
        this.target = target;
    }

    @Override
    public void run() {
        State lastState = target.getState();
        System.out.println(lastState);

        while (lastState != State.TERMINATED) {
            State currentState = target.getState();
            if (currentState != lastState) {
                System.out.println(currentState);
                lastState = currentState;
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {

            }
        }
    }
}
