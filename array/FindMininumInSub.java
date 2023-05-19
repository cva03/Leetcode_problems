package leetcode.array;

public class FindMininumInSub {
    public static void main(String[] args) {
        System.out.println(findMin(new int[]{4,5,6,7,0,1,2}));
    }
    public static int findMin(int[] nums) {
        int n=nums.length;
        int start=0;
        int end=n-1;
        int ans=nums[0];
        while(nums[start]>nums[end] && start<end){
            start=((start+1)+end)/2;
        }
        return nums[start];
    }
}
