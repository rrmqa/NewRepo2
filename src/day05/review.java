package day05;

import java.util.Arrays;
import java.util.Scanner;

public class review {
    public static void main(String[ ] args) {

        int[] myNumbers = {1, 2, 3};

        try {
            System.out.println(myNumbers[10]); // error!
        }catch(RuntimeException e){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a number from 0 to 2");
            int indexNumber = scan.nextInt();
            System.out.println("At index number "+indexNumber+" number is: "+myNumbers[indexNumber]);
        } 

    }
}
