package com.site.homework2;

import java.util.Scanner;

public class homework2_task2 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое целое число: ");
        a = in.nextInt();
        System.out.println("Введите второе целое число: ");
        b = in.nextInt();
        int sum = a + b;
        System.out.println("Сумма чисел = " + sum);
        int differences = a - b;
        if (differences < 0) {
            int i = b - a;
            System.out.println("Разница чисел = " + i);
        } else {
            System.out.println("Разница чисел = " + differences);
        }
        int proizvedenie = a * b;
        System.out.println("Произведение чисел = " + proizvedenie);
        int average = sum / 2;
        System.out.println("Среднее значение = " + average);
        int distance = a - b;
        if (distance < 0) {
            int j = b - a;
            System.out.println("Расстояние чисел = " + j);
        } else {
            System.out.println("Расстояние чисел = " + distance);
        }
        if (a > b) {
            System.out.println("Максимальное число = " + a);
            System.out.println("Минимальное число = " + b);
        } else {
            System.out.println("Максимальное число = " + b);
            System.out.println("Минимальное число = " + a);

        }

    }
}
