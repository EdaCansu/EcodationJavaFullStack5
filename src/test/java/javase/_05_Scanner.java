package javase;

import java.util.Scanner;

public class _05_Scanner {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");

        int value=klavye.nextInt();
        System.out.println(value*value);

    }
}
