package com.edacansu.javase;

import java.util.Scanner;

public class _25_PrimeNumber {

    static int getNumber(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        return inp.nextInt();
    }
    static boolean isPrime(){
        int numberData = getNumber();

        if (numberData == 1 || numberData == 2){
            return true;
        }
        for(int i = 2; i < numberData; i++){
            if (numberData % i == 0){
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {

        for(;;) {
            System.out.println(isPrime());
        }
    }

}
