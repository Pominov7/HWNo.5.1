package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        //1.Объявление переменных, ввод данных
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое предложение: ");
        String s1 = in.nextLine();
        System.out.print("Введите второе предложение: ");
        String s2 = in.nextLine();

        //2.Решение: избавляемся от всех пробелов и символов пунктуации
        String str1 = s1.replaceAll("\\p{Punct}", "");//удаляем все символы пунктуации
        String str2 = s2.replaceAll("\\p{Punct}", "");//удаляем все символы пунктуации
        String spaceStr1 = str1.replaceAll(" ", "");//удаляем все пробелы
        String spaceStr2 = str2.replaceAll(" ", "");//удаляем все пробелы
        String s1Low = spaceStr1.toLowerCase();//записываем все буквы в первой строке в нижний регистр
        String s2Low = spaceStr2.toLowerCase();//записываем все буквы во второй строке в нижний регистр
        //Этот пункт можно убрать, написал для проверки
        System.out.println(s1Low);//проверяем удалились ли пробелы и запятые, и регистр
        System.out.println(s2Low);//проверяем удалились ли пробелы, и регистр
        // Создаем массивы из строк
        char[] s1AsChar = s1Low.toCharArray();//создаём из строки s1 массив
        char[] s2AsChar = s2Low.toCharArray();//создаём из строки s2 массив
        Arrays.sort(s1AsChar);//сортируем массив s1
        Arrays.sort(s2AsChar);//сортируем массив s2
        //сравниваеем содержимое двух массивов поэлементно
        if (Arrays.equals(s1AsChar, s2AsChar)) {
            //если количество элементов равно и все элементы эквиваленты
            System.out.print("YES");
        } else {//если количество элементов не равно или  элементы неэквиваленты
            System.out.print("NO");
        }
    }
}

