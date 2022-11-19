package dev.project.atm.dto;

import lombok.Data;

@Data
public class TransactionDto extends BaseField{

    //Field
    private String transactionName;
    private String transactionAmount;


    //parametresiz constructor
    public TransactionDto(){

    }



    //parametreli constructor (bunu command+n -> constructor'dan yapabilirsin)

    public TransactionDto(Long id, String transactionName, String transactionAmount) {
        super(id);
        this.transactionName = transactionName;
        this.transactionAmount = transactionAmount;
    }

    //toString

    @Override
    public String toString() {
        return "transactionDto{" +
                "transactionName='" + transactionName + '\'' +
                ", transactionAmount='" + transactionAmount + '\'' +
                '}' + super.toString();
    }


    public void specialCode(){
        System.out.println(new TransactionDto().hashCode());
    }

}
