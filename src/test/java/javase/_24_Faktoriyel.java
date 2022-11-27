package javase;

import java.util.Scanner;

public class _24_Faktoriyel {

    public static int facto(int data) {
        int res = 1;
        for (int i = 1; i <= data; i++) {
            res *= i;
        }
        return res;
    }

    static int fac(int data) {
        if(data == 1){
            return 1;
        }
        return data * fac(data - 1);
    }

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen sayı giriniz: ");
        int n = inp.nextInt();

        System.out.println("Sonuç: " + facto(n));
        System.out.println("Sonuç: " + fac(n));

    }
}
