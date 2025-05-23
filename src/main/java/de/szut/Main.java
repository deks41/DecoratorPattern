package de.szut;

public class Main {

    public static void main(String[] args) {
        BonusCalculator calculator = new BonusCalculator(
                1,
                6,
                10,
                true
        );
        System.out.println(calculator.calculate());
    }
}