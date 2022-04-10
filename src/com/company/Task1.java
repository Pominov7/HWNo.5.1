package com.company;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        //1.Объявление переменных, ввод данных
        Scanner in = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String str = in.nextLine();
        System.out.print("Введите символ: ");
        String symB = in.nextLine();
        in.close();
        int index = str.indexOf(symB); // начинаем поиск
        int sum = 0;//переменная для накопления

        //2.Решение:
        if (str.contains(symB)) {// если строка содержит хотя бы одно совпадение с введенным символом,то true
            //Так как нам неизвестно количество итераций, применем цикл while
            while (index >= 0) {
                System.out.println("Символ " + "\"" + symB + "\"" + " найден,его индекс: " + index);
                //начинаем поиск с введенного символа + длина введенных символов
                index = str.indexOf(symB, index + symB.length());
                sum++;//накапливаем количество совпадений
            }
            System.out.println("Количество совпадений: " + sum);//вывод в консоль
        } else {
            System.out.println("Символ " + "\"" + symB + "\"" + " не найден");
        }
    }
}

