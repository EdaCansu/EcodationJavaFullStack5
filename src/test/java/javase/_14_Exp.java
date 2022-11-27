package javase;


import java.util.Scanner;

public class _14_Exp {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen şifrenizi giriniz: ");
        String password = inp.nextLine();
        System.out.print("Lütfen şifrenizi tekrar giriniz: ");
        String password2 = inp.nextLine();


        if (password.equals(password2)){
            System.out.println("Şifreniz doğru. Hoşgeldiniz.");
        } else{
            System.out.println("Yanlış şifre girdiniz. Lütfen dekrar deneyiniz.");
        }

        String result = password.equals(password2) ? "Şifreniz doğru. Hoşgeldiniz." : "Yanlış şifre girdiniz. Lütfen dekrar deneyiniz.";
        System.out.println(result);
    }
}
