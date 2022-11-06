package com.edacansu.javase;


public class _12_Cast {
    public static void main(String[] args) {

        //casting
        //1 -Float, long
        float f1 = 73.24f;
        long l1 = 1238758l;

        //2 - Byte Short Int Long
        byte b1 = 127;
        long l2 = b1;

        //3 -Byte Short Int Long
        long l3 = 82538298548l;
        byte b3 = (byte) l3;
        //Burada öncesinde cinsi belirtmek gerekiyor

        //4 -
        int nmbr = 29;
        String word = String.valueOf(nmbr);
        String word2 = Integer.toString(nmbr);
        System.out.println(word);
        System.out.println(word2);

        //5 -
        String number = "25";
        Integer number2 = Integer.valueOf(number);
        int number3 = Integer.valueOf(number);
        int number4 = Integer.parseInt(number);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);

    }
}
