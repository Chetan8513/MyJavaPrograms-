package collection;


import java.util.*;
import java.util.stream.Collectors;

public class DuplicateFromArray {

    public static void main(String[] args) {



        boolean flag =false;

        // check duplicate character


        // without optimization
        int a[] = {1,1,2,2,3,3,7,7};
        int count = 0 ;

        outeerloop:
        for(int i=0 ; i<a.length;i++){

            for(int j=i+1 ; j<a.length; j++){

                if(a[i]==a[j]){
                    count++;
                    System.out.println("duplicate found:"+ count);

                   flag = true;

                }
            }
        }

        if(!flag){
            System.out.println("duplicate not found");
        }
    }
}