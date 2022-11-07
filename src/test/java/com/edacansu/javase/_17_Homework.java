package com.edacansu.javase;


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

        int speed, counter = 0, sum = 0;
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
        }




        // Kullanıcı tarafından girilen haftanın gününü bulan algoritma

        // Örnek: 1-10 arasında 5 tane random sayı üretelim ?
        // Bu sayıları toplayalım
        // Bu sayılar içinde tek sayı toplamı
        // Bu sayılar içinde tek sayı adeti

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

    }
}
