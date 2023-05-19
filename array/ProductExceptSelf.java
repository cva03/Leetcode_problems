package leetcode.array;

import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1,2,3,4})));
    }
    public static int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] left=new int[n];
        int[] right=new int[n];
        int[] res=new int[n];
        left[0]=1;
        right[n-1]=1;
        for(int i=1;i<nums.length;i++){
            left[i]=nums[i-1]*left[i-1];
        }

        for(int i=n-2;i>=0;i--){
            right[i]=nums[i+1]*right[i+1];
        }
        for(int i=0;i<n;i++){
            res[i]=right[i]*left[i];
        }
        return res;
    }
}
