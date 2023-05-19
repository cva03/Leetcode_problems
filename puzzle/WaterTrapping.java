package puzzle;

public class WaterTrapping {
    public static void main(String[] args) {
        System.out.println(trap(new int[]{0,1,0,2,4,0,1,2,0,5,0,3}));

    }
    public static int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int ans = 0;
        int lMax = 0, rMax = 0;
        while(left <= right){
            lMax = Math.max(height[left], lMax);
            rMax = Math.max(height[right], rMax);
            if (lMax < rMax){
                ans += lMax - height[left++];
            }
            else {
                ans += rMax - height[right--];
            }
        }
        return ans;
    }

//    private static int solve(int[] arr){
//        int result=0;
//        for(int i=0;i<arr.length-1;i++){
//            int next=nextMax(arr,i);
//            for(int j=i+1;j<next;j++){
//                result+=Math.min(arr[i],arr[next])-arr[j];
//            }
//            i=next-1;
//        }
//        return result;
//    }
//
//    private static int nextMax(int[] arr,int curr){
//       int nextindex=curr+1;
//        for(int i=curr+1;i<arr.length;i++){
//            if(arr[i]>=arr[curr]){ //return next element which is greater than current index
//                return i;
//            }
//                if(arr[nextindex]<arr[i]){ // if no element is greater return the next maximum element
//                    nextindex=i;
//                }
//        }
//        return nextindex;
//    }
}
