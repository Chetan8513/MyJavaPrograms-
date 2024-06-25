package collection;

import java.io.BufferedReader;

public class ReverseString{


    public static void main(String[] args) {

        String name = "chetan";

        String a = reverseString(name);

        System.out.println(a);
    }


    public static String reverseString(String name){

//        StringBuffer a = new StringBuffer(name);
//
//        System.out.println(a.reverse());
//        return name;

        char ch= 0;
        String str ="";

        for(int i=0 ; i<name.length();i++) {

            ch = name.charAt(i);


            str = ch + str;
        }
        return str;
    }

}
