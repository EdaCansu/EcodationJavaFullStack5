package dev.project.atm.dto;

import lombok.Data;

@Data
public class EftDto extends BaseField{

    //Field
    private String eftName;
    private String eftAmount;


    //parametresiz constructor
    public EftDto(){

    }



    //parametreli constructor (bunu command+n -> constructor'dan yapabilirsin)

    public EftDto(Long id, String eftName, String eftAmount) {
        super(id);
        this.eftName = eftName;
        this.eftAmount = eftAmount;
    }

    //toString

    @Override
    public String toString() {
        return "EftDto{" +
                "eftName='" + eftName + '\'' +
                ", eftAmount='" + eftAmount + '\'' +
                '}' + super.toString();
    }


    public void specialCode(){
        System.out.println(new EftDto().hashCode());
    }

}
