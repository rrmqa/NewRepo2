package day01;

public class ParseMethod2 {
    public static void main(String[] args) {

        //              *******************
        String str2 = "aaa124bbb321c4d5000kl"; // 12+3+4+50 == 69  ///// 1+2+3+4+5+0==15
        String temp = ""; //12
        int sum = 0;

        for (int i=0; i<str2.length(); i++){
            if (Character.isDigit(str2.charAt(i))){
                temp += str2.charAt(i);
            } else {
                if (!temp.equals("")){
                    sum += Integer.parseInt(temp);
                    temp = "";
                }
            }

        }

        System.out.println(sum);

    }
}
