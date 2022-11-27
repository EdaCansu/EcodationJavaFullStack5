package dev.project.atm.dto;


import dev.project.atm.util.BaseField;
import lombok.Data;

import java.util.List;

@Data
public class BankBranchDto extends BaseField {

    private String branchBankName;
    private String brachCityName;
    private String branchCityLogo;


    //bank eft class
    private List<EftDto> bankEftList;
    private List<TransactionDto> bankTransactionList;


    //composition



    //parametresiz constructor
    public BankBranchDto() {
    }

    //parametreli constructor
    public BankBranchDto(Long id, String branchBankName, String brachCityName, String branchCityLogo) {
        super(id);
        this.branchBankName = branchBankName;
        this.brachCityName = brachCityName;
        this.branchCityLogo = branchCityLogo;
    }

    @Override
    public String toString() {
        return "BankBranchDto{" +
                "branchBankName='" + branchBankName + '\'' +
                ", brachCityName='" + brachCityName + '\'' +
                ", branchCityLogo='" + branchCityLogo + '\'' +
                ", id=" + id +
                ", date='" + date + '\'' +
                '}' + super.toString();
    }
}
