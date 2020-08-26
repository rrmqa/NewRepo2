package day01;

public class isLetter {

    public static void main(String[] args) {

        String str = "H1E2L3L3O4"; // HELLO
        String result = "";

        for (int i=0; i<str.length(); i++){
            if (Character.isLetter(str.charAt(i))){
                result += str.charAt(i);
            }
        }
        System.out.println(result);

    }

}
