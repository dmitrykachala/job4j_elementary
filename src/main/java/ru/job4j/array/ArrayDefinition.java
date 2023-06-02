package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] names = new String[4];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        names[0] = "Vasya Petrov";
        names[1] = "Petya Vasechkin";
        names[2] = "Eneken Skayvokerov";
        names[3] = "Dart Veiderov";
        System.out.println("Размер массива ages равен: " + ages.length);
        System.out.println("Размер массива surnames равен: " + surnames.length);
        System.out.println("Размер массива prices равен: " + prices.length);
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
