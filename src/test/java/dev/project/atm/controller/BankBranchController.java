package dev.project.atm.controller;

import dev.project.atm.util.IAtm;
import dev.project.atm.util.RegisterStaticData;

import java.io.Serializable;
import java.util.Scanner;

public class BankBranchController implements IAtm, Serializable {

    //serialVersionUID

    //Metotlar
    @Override
    public int userScannerValue() {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Lütfen seçim yapınız");
        System.out.println("1 - Para Görüntüle \n 2 - Para Yatır \n 3 - Para çek \n 4 - Eft Gönder +" +
                "\n 5 - Havale Gönder \n 6 -Mail Gönder \n 7 - Müşteri Hizmetleri \n 8 - Çıkış");
        return klavye.nextInt();
    }


    //Login


    @Override
    public boolean isLogin() {
        Scanner klavye = new Scanner(System.in);
        boolean result = false;
        String userName = "", userPassword = "", passwordMask = "";


        //database
        String dbUser = RegisterStaticData.USERNAME;
        String dbPassword = RegisterStaticData.PASSWORD;


        //4 hak verildi
        int attempt = 4;
        while (attempt >= 0) {
            System.out.println("\nLütfen kullanıcı adını giriniz");
            userName = klavye.nextLine();
            userName = userName.trim();
            System.out.println("\nLütfen kullanıcı şifrenizi giriniz");
            userPassword = klavye.nextLine().trim();

            //maskeleme
            for (int i = 0; i < userPassword.length(); i++) {
                passwordMask += "*";
            }
            System.out.println("Şifrenizin maskelenmiş hali: " + passwordMask);
            if (userName.equals(dbUser) && userPassword.equals(dbPassword)) {
                System.out.println("Kullanıcı verileriniz doğrusur");
                result = true;
            } else {
                --attempt;
                System.out.println("Username veya password yanlış. Tekrar giriniz.");
                System.out.println("Kalan hakkınız: " + attempt);
                if (attempt == 0) {
                    System.out.println("Hakkınız kalmadı. Kartınız bloke oldu. Müşteri hizmetlerini aramak ister misiniz? 111 222 3344");
                    break;
                }
            }
        }
        return result;
    }

    @Override
    public void register() {
        System.out.println("Register sayfası");

        allProcess();
    }

    @Override
    public void allProcess(){
        if (isLogin()){
            int userValue = userScannerValue();

            switch (userValue){
                case 1:
                    System.out.println("\n### Para görüntüle ###");
                    showMoney();
                    break;
                case 2:
                    System.out.println("\n### Para yatır ###");
                    addMoney();
                    break;
                case 3:
                    System.out.println("\n### Para çek ###");
                    reduceMoney();
                    break;
                case 4:
                    System.out.println("\n### EFT ###");
                    sendEFTMoney();
                    break;
                case 5:
                    System.out.println("\n### Havale ###");
                    sendTrancsactionMoney();
                    break;
                case 6:
                    System.out.println("\n### Email ###");
                    Scanner klavye = new Scanner(System.in);
                    System.out.println("Mail adresinizi giriniz");
                    String mailAddress = klavye.nextLine();
                    mailSend(mailAddress);
                    break;
                case 7:
                    System.out.println("\n### Müşteri hizmetleri ###");
                    break;
                case 8:
                    System.out.println("\n### Çıkış ###");
                    logOut();
                    break;

            }

        } else {
            System.out.println("Öncelikle register olmalısınız");
        register();
        }
    }

    //para ekle
    @Override
    public void addMoney() {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Miktar giriniz ");
        int moneyAmount = klavye.nextInt();
        //Database

    }

    //para göster
    @Override
    public void showMoney() {
        //database
    }


    //para çek
    @Override
    public void reduceMoney() {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Çekilecek para miktarını giriniz ");
        int moneyAmount = klavye.nextInt();
        //Database
    }


    //havale gönder
    @Override
    public void sendTrancsactionMoney() {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Gönderilecek havale miktarını giriniz ");
        int moneyAmount = klavye.nextInt();
        //Database


    }

    //eft gönder
    @Override
    public void sendEFTMoney() {
        
    }

    //mail gönder
    @Override
    public void mailSend(String emailAddress) {
        System.out.println("Mailiniz gönderildi...");
    }

    @Override
    public void logOut(){
        System.exit(0);
    }
}
