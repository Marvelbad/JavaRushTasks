package com.javarush.task.jdk13.task41.task4120.games;

public abstract class BoardGame {
    private int playersAmount;

    public void setPlayersAmount(int playersAmount) {
        this.playersAmount = playersAmount;
    }


    protected abstract void initialize();

    protected abstract void play();

    protected abstract void end();

    protected void printWinner() {
        System.out.println("");
    }

    public final void start(int number) {
        setPlayersAmount(playersAmount);
        play();
        end();
        printWinner();
    }
}
