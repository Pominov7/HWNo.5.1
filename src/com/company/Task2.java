package com.company;

import java.util.Scanner;

public class Task2 {
    //1.Объявление переменных, ввод данных
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер позиции от 1 до 1000: ");
        int pos = in.nextInt();
        in.close();

        //Решение:
        String str1 = "";//создали пустую строку, в которую будут записываться числа
        String str2 = "";//создали пустую строку
        //Так как нам известно количество итераций, применем цикл for
        for (int i = 1; str1.length() < 1000; i++) {//начинаем нумерацию с 1
            str1 += i;
        }
        System.out.println(str1);//вывод в консоль заполненной строки целыми числами
        //Находим число, которое находится на введенной с клавиатуры позиции
        for (int i = 0; i <= 999; i++) {
            str2 += str1.charAt(i);//возвращает символ из строки по индексу
        }
        System.out.println("На позиции " + pos + " находится число " + str2.charAt(pos - 1));//вывод в консоль
    }
}

