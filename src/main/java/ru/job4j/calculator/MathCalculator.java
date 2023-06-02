package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double differenceAndDivision(double first, double second) {
        return difference(first, second)
                + division(first, second);
    }

    public static double sumResult(double first, double second) {
        return sum(first, second)
                + multiply(first, second) + difference(first, second) + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Сумма суммы и умножения: " + sumAndMultiply(10, 20));
        System.out.println("Сумма вычитания и деления: " + differenceAndDivision(10, 20));
        System.out.println("Сумма всех операция: " + sumResult(10, 20));
    }
}
