package ru.job4j.calculator;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public double divide(int y) {
        return (double) y / x;
    }

    public double sumAllOperation(int y) {
        return sum(y) + minus(y) + this.multiply(y) + this.divide(y);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("10 + 5 = " + sum(10));
        System.out.println("10 - 5 = " + minus(10));
        System.out.println("10 * 5 = " + calculator.multiply(10));
        System.out.println("10 / 5 = " + calculator.divide(10));
        System.out.println("Сумма всех операций = " + calculator.sumAllOperation(10));
    }
}
