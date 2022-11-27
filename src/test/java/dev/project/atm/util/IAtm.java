package dev.project.atm.util;


//interface (Access-modifier(public, friendly) ve static field verilebilir)
//Dummy code : interface kullanmayacağınız başka classlara imğlement edeceğimiz gövdesiz metotlardır

public interface IAtm {

    //Metotlar
    int userScannerValue();

    //Login
    boolean isLogin();

    void register();

    void allProcess();

    //para ekle
     void addMoney();

    //para görüntüle
     void showMoney();

    //para çekmek
     void reduceMoney();

    //Havale
     void sendTrancsactionMoney();

    //EFT
     void sendEFTMoney();

    //Mail göndermek
     void mailSend(String emailAddress);

    void logOut();
}
