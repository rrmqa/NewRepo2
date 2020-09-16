package day04;

public class Lexus extends Car{

    public void starting(){
        System.out.println(brand+" "+model+" is starting");
    }


    public void turnAcOn(){
        System.out.println("Mercedes is turning AC ON");
    }


    public static void main(String[] args) {
        Lexus lexus1 = new Lexus();
        lexus1.setInfo("Lexus", "ES350");
        lexus1.starting();
        lexus1.turnAcOn();
    }

}
