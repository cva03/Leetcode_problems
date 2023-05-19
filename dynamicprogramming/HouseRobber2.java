package dynamicprogramming;

import java.util.Arrays;

public class HouseRobber2 {
    public int rob(int[] nums) {
        return Math.max(nums[0],Math.max(helper(Arrays.copyOfRange(nums,0,nums.length-1)),helper(Arrays.copyOfRange(nums,1,nums.length))));
    }
    public int helper(int[] nums){
        int house1=0;
        int house2=0;
        for(int i=0;i<nums.length;i++){
            int temp=Math.max(house1+nums[i],house2);
            house1=house2;
            house2=temp;
        }
        return house2;
    }
}
