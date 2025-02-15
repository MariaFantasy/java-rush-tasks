package com.javarush.task.pro.task02.task0214;

import java.util.Scanner;

/* 
Чтение и преобразование строк

Считай с клавиатуры три строки. А затем:
1. Выведи на экран третью строку в неизменном виде.
2. Выведи на экран вторую строку, предварительно преобразовав ее к верхнему регистру.
3. Выведи на экран первую строку, предварительно преобразовав ее к нижнему регистру.
*/

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        String line3 = scanner.nextLine();
        System.out.println(line3);
        System.out.println(line2.toUpperCase());
        System.out.println(line1.toLowerCase());
    }
}
