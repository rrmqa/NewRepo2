package day03;

public class Blueprint {

    public String name;
    public int age;

    public final String parentName = "Ismail";
    public final double PI = 3.14;
/*
    static {
        parentName = "Ismoil";
    }
 */

    public void gift(){
        System.out.println(parentName+" is giving a gift to "+name);
    }

    public void setInfo(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return "Parent name: "+parentName+"\nName: "+name+"\nAge: "+age;
    }
}
