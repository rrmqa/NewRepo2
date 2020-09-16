package day04.cutomClass;

public class Practice1 {

    public static String country;
    public String schoolName;
    public boolean isItGood;

    static {
        country = "USA";
    }

    public Practice1(String schoolName, boolean isItGood){
        this.schoolName = schoolName;
        this.isItGood = isItGood;
    }


    public void setInfo(String schoolName, boolean isItGood){
        this.schoolName = schoolName;
        this.isItGood = isItGood;
    }

    public String toString(){
        return "Country: "+country+"\nSchool Name: "+schoolName+"\nIs It Good: "+isItGood;
    }
}
