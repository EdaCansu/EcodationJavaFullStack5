package com.edacansu.javase;

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

        System.out.println("Sonuç: " + facto(5));
        System.out.println("Sonuç: " + fac(5));

    }
}
