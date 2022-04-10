package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ведомость оценок");

        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество предметов: ");
        int countSubject = in.nextInt();
        in.nextLine();

        String[] arrSubject = new String[countSubject]; //массив для предметов
        int[][] arrMarks = new int[countSubject][]; // массив для оценок по предметам

        for (int i = 0; i < arrSubject.length; i++) {
            System.out.print("Введите название предмета : " + (i + 1) + " ");
            arrSubject[i] = in.nextLine();

            for (int j = i; j < i + 1; j++) {
                System.out.print("Укажите количество оценок: " + arrSubject[i] + ": ");
                int countMarks = in.nextInt();
                in.nextLine();

                System.out.println("Оценки: ");
                arrMarks[i] = new int[countMarks]; //создали массив для оценок
                for (int k = 0; k < countMarks; k++) {
                    for (; ; ) {
                        arrMarks[j][k] = in.nextInt();
                        in.nextLine();
                        if (arrMarks[j][k] < 6 && arrMarks[j][k] > 1) {
                            break;
                        } else {
                            System.out.print("Вы ввели некорректную оценку! Введите от 2 до 5 баллов! ");
                        }
                    }
                }
            }
        }

        System.out.println("Ведомость оценок: ");  //делаем отступ перед выводом массива
        // выводим массив
        for (int i = 0; i < arrSubject.length; i++) {
            System.out.print(i + 1 + ". " + arrSubject[i] + ": ");
//            System.out.println();
            for (int k = 0; k < arrMarks[i].length; k++) {
                System.out.print(" " + arrMarks[i][k] + " ");
                //   System.out.println();
            }
        }
        //Выводим максимальную оценку
        System.out.println();//пробел между выводом
        System.out.print("Ввывести максимальную оценку? ДА = 1; Нет =2: "); // запрашиваем у пользователя
        // хочет ли вывести максимальную оценку
        int maximumMark = in.nextInt();
        in.nextLine();
        if (maximumMark == 1) {
            for (int i = 0; i < arrMarks.length; i++) {
                Arrays.sort(arrMarks[i]);
            }
            for (int i = 0; i < arrSubject.length; i++) {
                System.out.printf("Максимальная оценка по предмету : %s : %d \n", arrSubject[i], arrMarks[i][arrMarks[i].length - 1]); // если ДА
            }
        }

        System.out.println();//пробел между выводом
        System.out.print("Ввывести минимальную оценку? ДА = 1; Нет =2: "); // запрашиваем у пользователя
        // хочет ли вывести минимальную оценку
        int minimumMark = in.nextInt();
        //Выводим минимальную оценку
        if (minimumMark == 1) {
            for (int i = 0; i < arrMarks.length; i++) {
                Arrays.sort(arrMarks[i]);
            }
            for (int i = 0; i < arrSubject.length; i++)
                System.out.printf("Минимальная оценка по предмету %s : %d \n", arrSubject[i], arrMarks[i][0]);
        }
        // Выводим средний балл
        System.out.println("\n");//пробел между выводом
        System.out.print("Хотите вывести средний бал по предметам? ДА = 1; Нет =2: ");
        int middleMark = in.nextInt();
        double sum = 0;//переменная для накопления оценок
        double gpa = 0;//вспомогательная переменная

        int res = 0;
        in.nextLine();
        if (middleMark == 1) { // если введена цифра 1, то считаем средний балл
            for (int[] mark : arrMarks) {
                for (int i : mark) {
                    sum += i;
                    res++;
                    gpa = sum / res;
                }
            }
            System.out.printf("Ваш средний балл по всем предметам : %.2f", gpa);
        }
        System.out.print("\n");//пробел между строками

    }
}

