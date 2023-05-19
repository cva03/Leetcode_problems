package leetcode.array;

public class MaximumProduct {
    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{-3,-1,-1}));
    }
    public static int maxProduct(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                count++;
            }
        }
        int res=nums[0];
        int max=res;
        if(count%2==0){
            for(int i=1;i<nums.length;i++){
                max*=nums[i];
            }
        }else{
            for(int i=1;i<nums.length;i++){
                res=Math.max(res*nums[i],nums[i]);
                max=Math.max(res,max);
            }
        }
        return max;
    }
}
