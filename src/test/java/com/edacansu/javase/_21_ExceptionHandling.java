package com.edacansu.javase;

import java.io.IOException;

public class _21_ExceptionHandling {
    public static void main(String[] args) throws ArithmeticException, IOException, EdoException {

        int voc = 0;
        try {
            voc = 44 / 0;
        } catch (ArithmeticException arithmeticException) {
            //arithmeticException.printStackTrace();
            //throw new ArithmeticException("bekle bi "+arithmeticException);
            //throw new EdoException("");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Hello Eda");
        }


        System.out.println(voc);
        System.out.println("The End");


    }


}
