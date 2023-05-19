package leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        threeSum(new int[]{-1,0,1,2,-1,-4});
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i==0 || nums[i]!=nums[i-1]){
                int start=i+1;
                int end=nums.length-1;
                while(start<end){
                    List<Integer> list=new ArrayList<>();
                    int sum=nums[i]+nums[start]+nums[end];
                    if(sum==0){
                        list.add(nums[i]);
                        list.add(nums[start]);
                        list.add(nums[end]);
                        lists.add(list);
                        start=start+1;
                        while(start<end && nums[start]==nums[start-1]){
                            start++;
                        }
                    }else if(sum<0){
                        start++;
                    }else{
                        end--;
                    }
                }
            }
        }
        return lists;
    }
}
