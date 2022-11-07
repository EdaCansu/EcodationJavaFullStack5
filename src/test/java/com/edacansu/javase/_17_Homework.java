package com.edacansu.javase;


import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class _17_Homework {
    public static void main(String[] args) {

        // Kullanıcı tarafından alınan bir sayıya göre ceza kesilecektir.
        // Hızı:1-79 kadar ise para cezası  : 0 TL      ==>  1<=speed<=79
        // Hızı:80-4 ise para cezası : 800 TL hızlısınız   ==>  80<=speed<=94
        // Hızı:95-119 ise para cezası : 1200 TL çok hızlısınız   ==>  95<=speed<=119
        // Hızı:120 ve yukarı ise para cezası: 2000 TL  tehlikeli hızlısınız ==>  speed>=120
        // Soför kaç kere trafik cezası yediğini ve toplam para cezasını
        // ve eğer toplam ceza sayısı 5 ve üstüne ise ehliyetine el konulsun  hesaplayan algoritma yazalım ?

       /* int speed, counter = 0, sum = 0;
        Scanner inp = new Scanner(System.in);
            while (counter < 5) {
                System.out.print("\nPlease enter your speed: ");
                speed = inp.nextInt();
                if (speed < 1) {
                    System.out.println("The speed should be bigger than 1. Please try again.");
                } else if (speed <= 79) {
                    System.out.println("The amount of your penalty is 0 €!");
                    System.out.print("The total amount of penalty is: " + sum + " € and the number of penalty is " + counter + ".\n");
                } else if (speed <= 94) {
                    System.out.println("You are fast. The amount of your penalty is 800 €!");
                    counter++;
                    sum += 800;
                    System.out.print("The total amount of penalty is: " + sum + " € and the number of penalty is " + counter + ".\n");
                } else if (speed <= 119) {
                    System.out.println("You are too fast. The amount of your penalty is 1200 €!");
                    counter++;
                    sum += 1200;
                    System.out.print("The total amount of penalty is: " + sum + " € and the number of penalty is " + counter + ".\n");
                } else if (speed >= 120) {
                    System.out.println("You are dangerously fast. The amount of your penalty is 2000 €!");
                    counter++;
                    sum += 2000;
                    System.out.print("The total amount of penalty is: " + sum + " € and the number of penalty is " + counter + ".\n");
                }
            }

        if (counter == 5) {
            System.out.print("\nYour license has been seized! Please contact with the X.");
        }*/


        // Kullanıcı tarafından girilen haftanın gününü bulan algoritma
        /*int day;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the day: ");
        day = input.nextInt();

        Integer gun = day > 7 ? day = day % 7 : day;
            switch (day) {
                case 1:
                    System.out.println("It is monday!");
                    break;
                case 2:
                    System.out.println("It is tuesday!");
                    break;
                case 3:
                    System.out.println("It is wednesday!");
                    break;
                case 4:
                    System.out.println("It is thursday!");
                    break;
                case 5:
                    System.out.println("It is friday!");
                    break;
                case 6:
                    System.out.println("It is saturday!");
                    break;
                case 7:
                    System.out.println("It is sunday!");
                    break;
                default:
                    System.out.println("Wrong data! Please try again.");
            }*/


        // Örnek: 1-10 arasında 5 tane random sayı üretelim ?
        // Bu sayıları toplayalım
        // Bu sayılar içinde tek sayı toplamı
        // Bu sayılar içinde tek sayı adeti

        /*int sum = 0, oddCounter = 0, oddSum = 0;
        String numberAll = "", oddNumber = "";
        Random number = new Random();

        for (int i = 1; i <= 5; i++) {
            int randomNumber = number.nextInt(10) + 1;
            sum += randomNumber;
            numberAll += randomNumber + " ";
            if (randomNumber % 2 == 1) {
                oddSum += randomNumber;
                oddCounter++;
                oddNumber += randomNumber + " ";
            }
        }
        System.out.print("Numbers => " + numberAll +
                "\nSum => " + sum +
                "\nThe number of odd number => " + oddCounter +
                "\nOdd Numbers => " + oddNumber +
                "\nOdd Sum => " + oddSum);*/

        // Vize Final Ödevi
        // kullanıcıdan alınan vize ve final notuna göre geçme(ortalama) Algoritması
        // eğer kullanıcı vize veya final 0(sıfır) bir değer girerse sistemden atsın
        // ekranda "Sifir disiplin hatasi Sistemden cikiliyor"
        // bunun haricinde sürekli vize final sorsun
        // Not Harfleri ==> AA BA BB FF
        // not ortalaması: ortalama<50 altında ise kaldı FF
        // not ortalaması: ortalama==50 Geçti
        // not ortalaması: 55<=x<=69 BB
        // not ortalaması: 70<=x<=84 BA
        // not ortalaması: 85<=x<=100 AA
        // Vize:40% Final:60%
        // Dikkat: Consolda virgül kullanmalısın.
        // while sonsuz döngü   ==> while(true) {}
        // for sonsuz döngü     ==> for(;;) {}

        int midtermMark, finalMark, gpa;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your midterm mark: ");
        midtermMark = input.nextInt();
        System.out.print("Please enter your final mark: ");
        finalMark = input.nextInt();

        if(midtermMark ==  0 || finalMark == 0){
            System.out.println("Zero score is an infraction of the rules. Exiting the system!");
        } else {
            while(true) {
                gpa = (((midtermMark * 40)/ 100) + ((finalMark * 60)/ 100));
                if (gpa < 50){
                    System.out.println("Your letter score is FF - Fail the clas :(");
                } else if(gpa < 55){
                    System.out.println("Pass the class");
                } else if(gpa < 70){
                    System.out.println("Your letter score is BB.");
                } else if(gpa < 85) {
                    System.out.println("Your letter score is BA.");
                } else {
                    System.out.println("Your letter score is AA.");
                }
                System.out.print("Please enter your midterm mark: ");
                midtermMark = input.nextInt();
                System.out.print("Please enter your final mark: ");
                finalMark = input.nextInt();

            }

        }

    }
}

