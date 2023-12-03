package com.site.homework4;

import java.util.Scanner;

public class homework4_task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите символы '<' '>' '-': ");
        String lines = scanner.nextLine();
        int check = 0;
        for (int i = 0; i < lines.length() - 4; i++) {
            if (lines.substring(i, i + 5).equals(">>-->")) {
                check++;
            } else if (lines.substring(i, i + 5).equals("<--<<")) {
                check++;
            }
        }

        System.out.println("Количество стрел составляет: " + check);
    }
}