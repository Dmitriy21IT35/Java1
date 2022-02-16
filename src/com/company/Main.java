package com.company;

import java.io.OptionalDataException;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        int counter;
        int counter1;
        int num;
        int num2;
        int[][]array;

        //Создаем объект Scanner для считывания чисел, введенных пользователем
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        num = input.nextInt();
        num2 = input.nextInt();
                // Создаем массив введенного пользователем размера
        array = new int[num][num2];

        System.out.println("Введите " + num + " строк " +num2+ " Столбца " );

        //Заполняем массив, вводя элементы в консоль
        int i;
        int j;
        for (i = 0; i < num; i++) {
            for (j = 0; j < num2; j++)
            array[i][j] = input.nextInt();
        }


        // сортируем массив
        bubbleSort(array);

        // печатаем массив после пузырьковой сортировки
        for (i = 0; i < num; i++) {  //идём по строкам
            for (j = 0; j < num2; j++) {//идём по столбцам
                System.out.print(" " + array[i][j] + " "); //вывод элемента
            }
            System.out.println();//перенос строки ради визуального сохранения табличной формы
        }
    }

    private static OptionalDataException hp;
    private static OptionalDataException hp2;
    // метод пузырьковой сортировки
    public static void bubbleSort(int[][] array) {
        int j;
        int i;

                    boolean flag = true;   // устанавливаем наш флаг в true для первого прохода по массиву
                    int temp;   // вспомогательная переменная

                    while (flag) {
                        flag = false;    // устанавливаем флаг в false в ожидании возможного свопа (замены местами)

                        for (i = 0; i < array.length-1; i++) {
                                for (j = 0; j < array.length-1; j++)
                                if (array[i][j] > array[i][j+1]) { // измените на > для сортировки по возрастанию
                                temp = array[i][j];         // меняем элементы местами
                                    array[j][i] = array[i][j+1];
                                    array[i][j+1] = temp;
                    flag = true;  // true означает, что замена местами была проведена
                }
            }
        }
    }
}
