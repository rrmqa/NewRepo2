package day01;

public class ParseMethod3 {
    public static void main(String[] args) {

        String str = "aa1.1bb2.2cc5.5da1.1"; // 12.1+1.1+0.5 == 13.7
        String temp = ""; //1.1
        double sum = 0;

        for (int i=0; i<str.length(); i++){
            if (Character.isDigit(str.charAt(i))){
                temp += str.charAt(i);
            }
            if (str.charAt(i)=='.'){
                temp += str.charAt(i);
            } else {
                if (!temp.equals("")){
                    sum += Double.parseDouble(temp);
                    temp = "";
                }
            }
        }

        System.out.println(sum);

    }
}
