package com.edacansu.javase;


import java.util.Scanner;

public class _15_isDigit {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen bir şey giriniz: ");
        char value = inp.nextLine().charAt(0);

        if (Character.isDigit(value)){
            System.out.println("Bu bir sayıdır.");
        } else if(Character.isLetter(value)){
            System.out.println("Bu bir harftir.");
        } else {
            System.out.println("Bu bir özel karakterdir.");
        }

    }
}
