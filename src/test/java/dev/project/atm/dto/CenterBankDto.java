package dev.project.atm.dto;

//CenteriBankDto(1) - BankBranchDto(N)

import dev.project.atm.util.BaseField;
import lombok.Data;

//lombok
@Data
public class CenterBankDto extends BaseField {

    private String centerBankName;
    private String centerCityName;
    private String centerCityLogo;
    private boolean bankCheck = false;


    //composition

    //parametresiz constructor
    public CenterBankDto(){
        this.centerBankName = "bank adını girmediniz";
        this.centerCityName = "bank şehir adını girmediniz";
        this.centerCityLogo = "bank logosunu girmediniz ";
        this.bankCheck = false;
    }

    //parametleri constructor
    public CenterBankDto(Long id, String centerBankName, String centerCityName, String centerCityLogo, boolean bankCheck) {
        super(id);
        this.centerBankName = centerBankName;
        this.centerCityName = centerCityName;
        this.centerCityLogo = centerCityLogo;
        this.bankCheck = bankCheck;
    }


    //toString
    @Override
    public String toString() {
        return "CenterBankDto{" +
                "centerBankName='" + centerBankName + '\'' +
                ", centerCityName='" + centerCityName + '\'' +
                ", centerCityLogo='" + centerCityLogo + '\'' +
                ", bankCheck=" + bankCheck +
                ", id=" + id +
                ", date='" + date + '\'' +
                '}' + super.toString();
    }
}
