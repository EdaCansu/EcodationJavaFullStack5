package com.edacansu.javase;


import java.util.Random;

public class _11_StringBuilder {
    public static void main(String[] args) {
        String str1 = "Eda", str2 = "Cansu", str3 = "Canım";

        //First
        String birlestirilmis= str1+str2+str3;
        System.out.println(birlestirilmis);
        //Second
        String birlestirilmis2 = str1.concat(str2).concat(str3);
        System.out.println(birlestirilmis2);
        //Third
        StringBuilder birlestirilmis3 = new StringBuilder();
        birlestirilmis3.append(str1).append(str2).append(str3);
        String toStringData = birlestirilmis3.toString();
        System.out.println(toStringData);


    }
}
