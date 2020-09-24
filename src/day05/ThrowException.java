package day05;

import java.util.Scanner;

public class ThrowException {
    public static void main(String[] args) throws Exception{

        Scanner scan = new Scanner(System.in);
        System.out.println("Say YES to continue");
        String userAnswer = scan.next();
        String expectedAnswer = "YES";

        if(!userAnswer.equals(expectedAnswer)){
            throw new Exception("You didn't want to continue! Good Bye!");
        }else{
            System.out.println("Welcome back! Let's continue");
        }
    }
}
