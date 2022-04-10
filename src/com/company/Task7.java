package com.company;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Character.isDigit;

public class Task7 {
    public static <chars> void main(String[] args) {
        //1.Объявление переменных, ввод данных
        Scanner in = new Scanner(System.in);
        System.out.print("Введите предложение:");
        String str1 = in.nextLine();
        in.close();

        //Решение:
        char[] chars = str1.toCharArray();//создаём массив символов
        //Проходим циклом for по массиву
        for (int i = 0; i < chars.length; i++) {
            char symB = chars[i];
            if (Character.isUpperCase(symB)) {//если символ находится в вернем регистре
                chars[i] = Character.toLowerCase(symB);//то записываем его в нижний регистр
            } else if (Character.isLowerCase(symB)) {//если символ находится в нижнем регистре
                chars[i] = Character.toUpperCase(symB);//то записываем его в верхний регистр
            } else if (isDigit(symB)) { // если символ является  цифрой
                chars[i] = '_';// то записываем вместо цифры нижнее подчеркивание
            }
        }
        System.out.print(chars);
    }
}


