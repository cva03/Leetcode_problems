package dynamicprogramming;

public class HouseRobber {
    public static void main(String[] args) {
        System.out.println(rob(new int[]{2,1,1,2}));
    }

    public static int rob(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(i==1){
                nums[i]=Math.max(nums[i-1],nums[i]);
            }else if(i!=0){
                nums[i]=Math.max(nums[i-2]+nums[i],nums[i-1]);
            }
            max=Math.max(max,nums[i]);
        }
       return max;
    }
}
