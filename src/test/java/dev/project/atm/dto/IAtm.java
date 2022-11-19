package dev.project.atm.dto;


//interface (Access-modifier(public, friendly) ve static field verilebilir)
//Dummy code : interface kullanmayacağınız başka classlara imğlement edeceğimiz gövdesiz metotlardır

public interface IAtm {

    //para ekle
    public void addMoney();

    //para görüntüle
    public void showMoney();

    //para çekmek
    public void reduceMoney();

    //Havale
    public void sendTrancsactionMoney();

    //EFT
    public void sendEFTMoney();

    //Mail göndermek
    public void mailSend(String emailAddress);

}
