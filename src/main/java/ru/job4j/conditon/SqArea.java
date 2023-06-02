package ru.job4j.conditon;

public class SqArea {

    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double s = l * h;
        return s;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = " + result1);
        result1 = SqArea.square(31, 1.5);
        System.out.println(" p = 31, k = 1.5, s = " + result1);
        result1 = SqArea.square(14, 3);
        System.out.println(" p = 14, k = 3, s = " + result1);
        result1 = SqArea.square(711.11, 4.13);
        System.out.println(" p = 711.11, k = 4.13, s = " + result1);
    }

}
