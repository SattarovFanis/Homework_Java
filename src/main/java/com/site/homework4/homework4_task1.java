package com.site.homework4;

import java.util.Objects;
import java.util.Scanner;

public class homework4_task1 {
    public static void main(String[] args) {
        String letters = "qwertyuiopasdfghjklzxcvbnm";
        char[] lettersArray = letters.toCharArray();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите букву английского алфавита: ");
        String letter = in.nextLine();
        int i = letters.indexOf(letter);
        int j = i - 1;
        if (j < -1 || j >= 26) {
            System.out.println("Неверные данные");
        } else if (j < 0) {
            System.out.println("Полученный результат:" + letters.charAt(25));
        } else {
            System.out.println("Полученный результат:" + letters.charAt(j));
        }

    }
}