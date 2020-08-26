package day01;

public class isDigit {

    public static void main(String[] args) {
        String str3 = "aabbb21";

        int count = 0;
        for (int i=0; i< str3.length(); i++){
            if (Character.isDigit(str3.charAt(i))){
                count++;
            }
        }

        if (count==0){
            System.out.println("You must add a number to your password");
        }else{
            System.out.println("You have a strong password");
        }

    }

}
