package com.javarush.task.pro.task03.task0312;

import java.util.Scanner;

/* 
Сравним строки

Напиши программу, которая считывает с клавиатуры две строки и выдает сообщение о том, одинаковые ли эти строки.
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();

        //напишите тут ваш код
        if (line1.equals(line2)) {
            System.out.println("строки одинаковые");
        } else {
            //напишите тут ваш код
            System.out.println("строки разные");
        }
    }
}
