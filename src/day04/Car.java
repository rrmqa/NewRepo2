package day04;

public abstract class Car {

    public String brand;
    public String model;


    public void setInfo(String brand, String model){
        this.brand = brand;
        this.model =model;
    }

    public abstract void starting();


    public void turnAcOn(){
        System.out.println(brand+" "+model+" is turning AC ON");
    }
}
