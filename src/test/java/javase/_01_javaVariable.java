package javase;

public class _01_javaVariable {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String $_degiskenAdi24 = "Java Öğreniyorum";

        //Primitive (ilkel) types: byte < short < int < long;
        //tamsayılar
        byte b1 = 125;
        short s1= 23333;
        int i1 = 747842309;
        long l1 = 8090734567890442322L;

        //virgüllü sayılar
        float f1 = 2653.29f;
        double d1 = 1515151.4545;

        //karar
        boolean b3 = true;

        //char
        char c4 = '&' ;

        //pritimitive type
        /*
        stack memory ( hafızası belli olandır).
        RAM
        Daha hızlıdır
        null veremezsiniz
        daha az yer kaplar
        */

        //wrapper type
        /*
        objedir
        Heap memory ( hafızası belli olmayan)
        null verebilirim
        daha fazla yer kaptlar
        RAM
        */

        //wrapper types

        Byte wb1 = 125;
        wb1=null;
        Short ws1 = 255;
        Integer wi1 = 1551515;
        Long wl1 = 15551515154L;

        //virgüllü sayı
        Float wf1 = 1425.52f;
        Double wd1 = 1515151.4545;

        //karar
        Boolean wb3 = true;

        //char
        Character wc4 = '&';




    }
}
