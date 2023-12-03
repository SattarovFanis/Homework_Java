package com.site.homework2;

import java.util.Scanner;

public class homework2_task1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите градусы в фаренгейтах: ");
        double farenheit = in.nextDouble();
        double celsius = (farenheit - 32) * 5/9;
        System.out.println("Градусы в цельсиях = "  + celsius);
    }
}
