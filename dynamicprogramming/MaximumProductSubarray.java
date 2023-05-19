package dynamicprogramming;

import java.util.Arrays;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        System.out.println(maximumProduct(new int[]{-1,-2,-3,-4}));
    }
        public static int maximumProduct(int[] nums) {
            Arrays.sort(nums);
            int len=nums.length;
            int res=nums[len-1];
            if(res<0){
                return res=nums[len-1]*nums[len-2]*nums[len-3];
            }
            if(nums[0]*nums[1]>nums[len-3]*nums[len-2]){
                res*=nums[0]*nums[1];
            }else{
                res*=nums[len-3]*nums[len-2];
            }
            return res;
        }
}
