package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
    }

    static class HenFactory {

        static Hen getHen(String country) {
            if (Country.BELARUS.equals(country)) {
                return new BelarusianHen();
            } else if (Country.UKRAINE.equals(country)) {
                return new UkrainianHen();
            } else if (Country.MOLDOVA.equals(country)) {
                return new MoldovanHen();
            } else if (Country.RUSSIA.equals(country)) {
                return new RussianHen();
            }
            return null;
        }
    }
}
