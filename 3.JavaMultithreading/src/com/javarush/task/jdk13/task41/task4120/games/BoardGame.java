package com.javarush.task.jdk13.task41.task4120.games;

import lombok.Setter;

import java.util.Random;

@Setter
public abstract class BoardGame {
    private int playersAmount;

    protected abstract void initialize();

    protected abstract void play();

    protected abstract void end();

    protected void printWinner() {
        System.out.println("Победил игрок № " + (new Random().nextInt(playersAmount) + 1));
    }

    public final void start(int playersAmount) {
        setPlayersAmount(playersAmount);
        initialize();
        play();
        end();
        printWinner();
    }
}
