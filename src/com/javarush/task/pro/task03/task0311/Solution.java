package com.javarush.task.pro.task03.task0311;

import java.util.Locale;
import java.util.Scanner;

/* 
Высокая точность

Напиши программу, которая считывает с клавиатуры два вещественных числа (double) и выдает сообщение о том, равны ли эти числа с точностью до одной миллионной.
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        //напишите тут ваш код
        if (Math.abs(a - b) < 0.000001) {
            System.out.println("числа равны");
        } else {
            //напишите тут ваш код
            System.out.println("числа не равны");
        }
    }
}
