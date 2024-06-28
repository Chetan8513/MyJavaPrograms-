package collection;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class FindCharacter {

    public static void main(String[] args) {

        String name = "chetan";

        char ch = 'e';

      int a  =  findChar(name,ch);

        System.out.println(a);
    }


    public static int findChar(String name, char ch) {

        OptionalInt num = IntStream.range(0, name.length()).filter(i -> name.charAt(i) == ch).findFirst();

        return num.orElse(-1);
    }






}
