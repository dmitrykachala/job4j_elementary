package ru.job4j.conditon;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (third >= first && third >= second) {
            result = third;
        }
        if (second >= first && second >= third) {
            result = second;
        }
        return result;
    }
}
