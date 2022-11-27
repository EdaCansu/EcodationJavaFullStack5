package javase;


import java.util.Random;

public class _10_Random {
    public static void main(String[] args) {
        System.out.println(Math.random()*4+1);
        System.out.println( Math.floor(Math.random()*4+1));

        //Random object
        Random rastgele=new Random();
        int number= rastgele.nextInt(4)+1;
        // buradaki 4 bitiş noktasını gösterir ( 1 ile 4 arasındaki sayılar yani)
        System.out.println(number);

    }
}
