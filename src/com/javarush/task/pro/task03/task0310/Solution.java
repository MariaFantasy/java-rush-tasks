package com.javarush.task.pro.task03.task0310;

import java.util.Scanner;

/*
Через тернии...

Эта программа написана с использованием тернарного оператора, но не совсем понятно, что она делает. Думаем, если избавиться от тернарного оператора, то станет намного понятнее. Перепиши программу без использования тернарного оператора.
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        // String result = number < 5 ? "число меньше 5" : number > 5 ? "число больше 5" : "число равно 5";
        if (number < 5) {
            System.out.println("число меньше 5");
        } else if (number > 5) {
            System.out.println("число больше 5");
        } else {
            System.out.println("число равно 5");
        }
    }
}
