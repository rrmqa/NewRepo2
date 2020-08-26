package day01;

public class ParseMethod1 {

    public static void main(String[] args) {

        String str = "aa1bb2ccdd4dj"; // 1 +2 +4 = 7 ********
        int sum = 0; // 1+2+4==7

        for (int i=0; i<str.length(); i++){
            if (Character.isDigit(str.charAt(i))){
                sum += Integer.parseInt(""+str.charAt(i));
            }
        }

        System.out.println(sum);


    }
}
