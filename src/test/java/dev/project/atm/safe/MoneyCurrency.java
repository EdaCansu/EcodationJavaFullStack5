package dev.project.atm.safe;

//with Java5
//Type safe
//Daha yönetilebilir bir sistem yapabilmek
//Enum features - should not be instance and only getter(not setter)


import lombok.Getter;

public enum MoneyCurrency {

    TR(1,"Lira"), EN(2,"en"), GE(3, "ge");

    private final Integer number;
    private final String currency;

    //Constructor should be final(instance isn't)

    private MoneyCurrency(Integer number, String currency){
        this.number = number;
        this.currency = currency;

    }

    //Getter
    public Integer getNumber() {
        return number;
    }

    public String getCurrency() {
        return currency;
    }



}
