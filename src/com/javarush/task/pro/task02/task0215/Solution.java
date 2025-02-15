package com.javarush.task.pro.task02.task0215;

import java.util.Scanner;

/* 
Чтение чисел

Считай с клавиатуры три целых числа. Выведи на экран их среднее арифметическое.
*/

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int avg = (a + b + c) / 3;
        System.out.println(avg);
    }
}
