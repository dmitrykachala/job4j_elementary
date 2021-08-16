package ru.job4j.conditon;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        double interRsl1 = Math.pow(x2 - x1, 2);
        double interRsl2 = Math.pow(y2 - y1, 2);
        double rsl = Math.sqrt(interRsl1 + interRsl2);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        result = Point.distance(-1, 0, 2, -7);
        System.out.println("result (-1, 0) to (2, -7) " + result);
        result = Point.distance(5, 13, -11, -33);
        System.out.println("result (5, 13) to (-11, -33) " + result);
        result = Point.distance(701, -303, 21, 87);
        System.out.println("result (701, -303) to (21, 87) " + result);
    }

}
