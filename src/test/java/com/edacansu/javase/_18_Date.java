package com.edacansu.javase;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class _18_Date {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        //GETTER

        System.out.println(date.getDay());
        System.out.println(date.getMonth());
        System.out.println(date.getHours());
        System.out.println(date.getMinutes());
        System.out.println(date.getSeconds());
        System.out.println(date.getYear()+1900);
        System.out.println("===================");

        //currentTimeMillis: 1 ocak 1970 yılından şimdiye kadar geçen milisaniye
        //1000ms=1sn
        long nowMs=System.currentTimeMillis();
        System.out.println(nowMs);
        System.out.println(new Date(nowMs));
        System.out.println("***************************");

        //SETTER

        Date date2 = new Date();
        System.out.println(date2);

        System.out.println(date2.getMonth());
        date2.setMonth(0);
        System.out.println(date2.getMonth());
        System.out.println("============");

        //Locale

        Locale local = new Locale("tr", "TR");
        SimpleDateFormat newFormat = new SimpleDateFormat("dd/MMM/yy HH:mm:ss", local);
        Date date3 = new Date();
        String trTime = newFormat.format(date3);
        System.out.println(trTime);

        //LOCALE short pattern

        System.out.println("=============");
        String turkisTime2=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", new Locale("tr","TR")).
                format(new Date());
        System.out.println(turkisTime2);

        System.out.println(new SimpleDateFormat("dd/MMMM/yyyy HH:mm:ss", new Locale("tr","TR")).
                format(new Date()));
    }
}
