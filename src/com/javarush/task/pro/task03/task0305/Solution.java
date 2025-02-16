package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

/* 
Три числа

Ввести с клавиатуры три целых числа. Определить, есть ли среди них хотя бы одна пара равных между собой чисел. Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.
Примеры:
a) при вводе чисел 1 2 2 получим вывод 2 2
b) при вводе чисел 2 2 2 получим вывод 2 2 2
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean isAEqualsB = a == b;
        boolean isBEqualsC = b == c;
        boolean isAEqualsC = a == c;

        if (isAEqualsB) {
            if (isBEqualsC) {
                System.out.println(a + " " + b + " " + c);
            } else {
                System.out.println(a + " " + b);
            }
        } else if (isAEqualsC) {
            System.out.println(a + " " + c);
        } else if (isBEqualsC) {
            System.out.println(b + " " + c);
        }
    }
}
