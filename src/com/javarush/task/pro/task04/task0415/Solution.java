package com.javarush.task.pro.task04.task0415;

import java.util.Scanner;

/* 
Площадь круга

Для решения этой задачи нужно:
1. Ввести с клавиатуры положительное целое число radius. Это будет радиус окружности.
2. Вывести на экран площадь круга, рассчитанную по формуле: S = pi * radius * radius.

Результатом должно стать целое число (тип int). Для этого нужно привести к типу int результат умножения (отбросить дробную часть, округлив вниз до целого числа). В качестве значения pi используй 3.14.
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        float pi = 3.14f;
        int s = (int) (pi * radius * radius);
        System.out.println(s);
    }
}