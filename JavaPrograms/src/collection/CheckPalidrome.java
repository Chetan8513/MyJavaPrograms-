package collection;



public class CheckPalidrome {

    public static void main(String[] args) {
     int num = 1515;
        int result= checkPalidrome(num);


        if(result==num){

                System.out.println("num is palidrome");
            }else{
                System.out.println("num is not palidrome0");
            }

        System.out.println(result);
    }


    public static int  checkPalidrome(int  num){

        int rev=0;
        //int org = num;

        while(num!=0){
            rev = rev*10 +num%10;
            num=num/10;
        }



        return rev;

    }

}
