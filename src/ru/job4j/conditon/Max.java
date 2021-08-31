package ru.job4j.conditon;

public class Max {
    public static int max(int left, int right) {
        return left >= right ? left : right;
    }

    public static int max(int first, int second, int third) {
        return Max.max(first, second) >= third ? Max.max(first, second) : third;
    }

    public static int max(int first, int second, int third, int fourth) {
        return Max.max(first, second, third) >= fourth ? Max.max(first, second, third) : fourth;
    }

    public static void main(String[] args) {
        System.out.println(Max.max(5, 7));
        System.out.println(Max.max(50, -77, 33));
        System.out.println(Max.max(15, 72, 13, 0));
    }
}
