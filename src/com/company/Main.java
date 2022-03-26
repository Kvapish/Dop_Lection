package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main
{
    private static final Scanner scanner=new Scanner(System.in);
    public static void main(String[] args)
    {
        //Реализовать функцию перемешивания массива целых чисел (кол-во элементов > 100) блоками по K элементов N раз.
        task();
    }

    private static void task()
    {

        System.out.print("Введите количество элементов массива:\n");
        int Array_Size = 0;//Создаем переменную которая будет отвечать за размер массива
        Array_Size = scanner.nextInt();//Сканируем ее значение
            if (Array_Size < 100)//Сравниваем ее , чтобы не была меньше 100
            {
                System.out.print("Количество элементов массива не может быть меньше 100.\n");
            }
            else
            {
                System.out.print("Введите размер блока: \n");//Считываем данные по блокам и количеству перемешиваний
                int K = scanner.nextInt();
                System.out.print("Введите число перемешиваний : \n");
                int N = scanner.nextInt();
                int[] array = new int[Array_Size];//Задаем массиву считанное значение
                Random random = new Random();
                for (int i = 0; i < Array_Size; i++)
                {
                    array[i] = random.nextInt(200);//Заполняем рандомными числами массив в пределах 200
                }
                System.out.println(Arrays.toString(array));
                int b = Array_Size / K;//Присваиваем переменной b, количество элементов деленное на размерность блоков
                for (int i = 0; i < b * K; i += K) //Создаем счетик
                {
                    int index = random.nextInt(b);
                    for (int j = 0; j < K; j++) //Создаем счетик
                    {
                        int tmp = array[i + j];//Создаем переменную которой присваиваем значение массива
                        array[i + j] = array[j + (index * K)];
                        array[j + (index * K)] = tmp;
                    }
                }
                System.out.println(Arrays.toString(array));//Выводим результат
            }
    }
}

