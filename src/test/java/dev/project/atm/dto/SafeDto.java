package dev.project.atm.dto;

import dev.project.atm.util.BaseField;
import lombok.Data;

@Data
public class SafeDto extends BaseField {

    //field
    private String moneyType;
    private String moneyCurrency;
    private double moneyAmount;

    //parametresiz constructor
    public SafeDto() {
        this.moneyAmount = 0.0;
    }

    //parametreli constructor

    public SafeDto(Long id, double moneyAmount) {
        super(id);
        this.moneyAmount = moneyAmount;
    }

    //toString


    @Override
    public String toString() {
        return "SafeDto{" +
                "moneyType='" + moneyType + '\'' +
                ", moneyCurrency='" + moneyCurrency + '\'' +
                ", moneyAmount=" + moneyAmount +
                ", id=" + id +
                ", date='" + date + '\'' +
                '}' + super.toString();
    }


}
