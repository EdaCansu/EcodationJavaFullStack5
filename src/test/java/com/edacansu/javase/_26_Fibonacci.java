package com.edacansu.javase;

import java.util.Scanner;

public class _26_Fibonacci {



    static int fibo(int number){
        if(number == 1 || number == 2){
            return 1;
        }
        return fibo(number - 1) + fibo(number - 2);
    }

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++){
        System.out.print(fibo(i) + " ");
        }
    }

}
