package com.edacansu.javase;

import java.util.Scanner;

public class _05_String {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Lütfen bir şeyler yazınız: ");

        String word = klavye.nextLine();
        System.out.println(word.length());
        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase());

    }
}
