package com.javarush.task.pro.task02.task0203;

/* 
Последняя цифра числа

В переменной number записано число. В переменную lastDigit нужно записать последнюю цифру этого числа. Для вычисления используй переменную number и оператор «остаток от деления». Для объявления и инициализации lastDigit используй одну команду.
*/

public class Solution {

    public static void main(String[] args) {
        int number = 546;

        int lastDigit = number % 10; //напишите тут ваш код

        System.out.println(lastDigit);
    }
}