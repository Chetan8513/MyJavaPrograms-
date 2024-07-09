package collection;

import java.util.Arrays;

public class Test1 {

    public static void main(String[] args) {

        // find anagram or not


        String a = "java";
        String a1 = "ghgtg";

        char[]c=a.toCharArray();
       char[]c1 =  a1.toCharArray();


        Arrays.sort(c);
        Arrays.sort(c1);


        boolean result  = Arrays.equals(c,c1);



        if(result){
            System.out.println("its anagram");
        }else{
            System.out.println("its not anangram");
        }





       
    }
}
