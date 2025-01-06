package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen {
    public int getCountOfEggsPerMonth() {
        return 100;
    }

    @Override
    public String getDescription() {
        return super.getDescription() +
                String.format(" Моя страна - %s. Я несу %d яиц в месяц.",Country.BELARUS, getCountOfEggsPerMonth());
    }
}
