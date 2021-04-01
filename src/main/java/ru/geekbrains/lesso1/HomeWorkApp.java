package ru.geekbrains.lesso1;

public class HomeWorkApp {
    static void printThreeWords() {
        System.out.println("_Orange");
        System.out.println("_Banana");
        System.out.println("_Apple");
    }
    static void checkSumSign(int a, int b) {
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    static void printColor(int value){
        if (value <= 0) {
        System.out.println("Red");
        } else if (value <= 100) {
            System.out.println("yellow");
        } else {
            System.out.println("green");
        }
    }

    static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }

    }

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign( 0 , -2);
        printColor(-214);
        printColor(120);
        printColor(85);
        compareNumbers(6,6);
    }
    }




