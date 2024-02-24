package com.test.idea;

import java.util.Scanner;

public class seminar4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        String result1 = scan.nextLine();
        System.out.println("Введите вторую строку: ");
        String result2 = scan.nextLine();
        System.out.println("Введите первый индекс: ");
        int index1 = scan.nextInt();
        System.out.println("Введите второй индекс: ");
        int index2 = scan.nextInt();




        System.out.println("Первая строка: " + result1);
        System.out.println("Вторая строка: " + result2);
        String res = result1 + result2;
        System.out.println(res.substring(index1, index2));
        System.out.println("Верхний регистр первой строки: " + result1.toUpperCase());
        System.out.println("Верхний регистр второй строки: " + result2.toUpperCase());
        System.out.println("Нижний регистр первой строки: " + result1.toLowerCase());
        System.out.println("Нижний регистр второй строки: " + result2.toLowerCase());








//        if ((result1.length() & result2.length()) >= 50) {
//            System.out.println("Первая строка: " + result1);
//            System.out.println("Вторая строка: " + result2);
//            System.out.println(result1.substring(1));
//
//        }
//        else {
//            System.out.println("Длина строк менее 50 символов");
//        }



    }
}
