package com.edacansu.javase;

public class _22_Mathods {


    public static void voidParametresiz(){
        System.out.println("Parametresiz void");
    }

    public static void voidParametreli(String adi, int sayi){
        System.out.println("Parametreli void " + adi + " sayı " + sayi);
    }

    public static void voidParametreli(String adi){
        System.out.println("Parametreli void " + adi + "----Overloading example");
    }


    static String returnluParametresiz(){
        return "returnlu parametresiz";
    }

    static String returnluParametreli(String data){
        return "returnlu parametreli " + data;
    }


    public static void main(String[] args) {

        //AP =  Aynı Paket    FP = Farklı Paket
        //AC = Aynı Class   FC = Farklı Class
        //SC = SubClass

        //                  AP  FP      AC  FC  SC
        //public        =>  +   +       +   +   +
        //protected     =>  +   +/-?    +   +   +
        //private       =>  +   -       +   -   -
        //-             =>  +   -       +   +   -

        voidParametresiz();
        voidParametreli("Eda", 29);
        voidParametreli("Edoş");


        System.out.println(returnluParametresiz());
        String result = returnluParametresiz();
        System.out.println(result);
        System.out.println(returnluParametreli("Istanbul"));

    }
}
