package collection;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {

        int[]nums = {1,2,3,4,5,6,6};

        int target = 12;

        int []result  = twoSum(nums,target);

        System.out.println(Arrays.toString(result));


    }

    public static int[]twoSum(int[]nums,int target){

        for(int i=0 ; i<nums.length;i++){
            for(int j=i+1 ; j<nums.length;j++){
                if(nums[i]+nums[j]==target){

                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
