package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //1.Объявление переменных, ввод данных
        Scanner in = new Scanner(System.in);
        System.out.print("Введите предложение:");
        String str1 = in.nextLine();
        in.close();
        double sum = 0;//переменная для накопления суммы символов в строке
        //2.Решение:
        String str = str1.replaceAll("\\p{Punct}", "");//удаляем все символы пунктуации
        String str1S[] = str.split("\\s+");//возвращаем массив строк, разбивая строку на части
        System.out.println(Arrays.toString(str1S));//вывод маасива в консоль
        //Проходим циклом for по массиву, и считаем общее количество символов
        for (int i = 0; i < str1S.length; i++) {
            sum += str1S[i].length();
        }
        //считаем среднюю длину слова, количество символов делим на количество слов
        double average = sum / str1S.length;
        System.out.printf("Средняя длина слова в тексте - %.2f", average);//вывод в консоль
    }
}


