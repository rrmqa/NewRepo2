package day03;

import java.util.Arrays;

/*
       String
       StringBuffer
       StringBuilder
       Arrays
        */
public class StringPractice {

    public static void main(String[] args) {

        System.out.println("==============StringBuffer=============");
        StringBuffer sb = new StringBuffer("Hello");
        long beginningTime = System.currentTimeMillis();
        for(int i=0; i<1_000_000; i++){
            sb.append(" World");
        }
        long endingTime = System.currentTimeMillis();
        long duration = endingTime-beginningTime;
        System.out.println(duration);

        System.out.println("===============StringBuilder================");

        StringBuilder sbd = new StringBuilder("Hello");
        long beginningTime2 = System.currentTimeMillis();
        for(int i=0; i<1_000_000; i++){
            sbd.append(" World");
        }
        long endingTime2 = System.currentTimeMillis();
        long duration2 = endingTime2-beginningTime2;
        System.out.println(duration2);

        String[] arr  = {"Hello", "World"}; // 2
        arr[0] = "Java";
        arr[1] = "is Fun";
        try {
            arr[2] = "C#";
        }catch (RuntimeException e){
            System.out.println("No space for C#, LOL");
        }
        System.out.println(Arrays.toString(arr));


    }
}
