package com.edacansu.javase;


import java.util.Random;
import java.util.Scanner;

public class _13_Conditional {
    public static void main(String[] args) {

        public static void main (String[]args){

            int number1 = 4;
            switch (number1) {
                case 1:
                    System.out.println("sayı 1");
                    break;

                case 2:
                    System.out.println("sayı 2");
                    break;

                case 3:
                    System.out.println("sayı 3");
                    break;

                default:
                    System.out.println("lütfen sayı giriniz");
                    break;
            }


            Scanner klavye = new Scanner(System.in);
            System.out.println("lütfen 1-10 arasında bir sayı giriniz");
            int number = klavye.nextInt();
            if (number < 0) {
                System.out.println("Lütfen negatif girmeyiniz");
            } else {
                //Rastgele sayı
                Random random = new Random();
                int computerNumber = random.nextInt(10) + 1;
                System.out.println(computerNumber);

                if (Math.abs(number) == computerNumber) {
                    System.out.println("bilgisayar:" + computerNumber + " kişi: " + number + "Doğru tahmin ettiniz:");
                } else if (number != computerNumber) {
                    System.out.println("bilgisayar:" + computerNumber + " kişi: " + number + "!!!! Doğru tahmin etmediniz:");
                } else {
                    System.out.println("lütfen sayı giriniz");
                }
            }
        }
    }
