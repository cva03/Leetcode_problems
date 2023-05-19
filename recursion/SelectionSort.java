package recursion;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={2,8,7,4,5,9,3,0};
        sort(arr,arr.length-1,0,0);
        System.out.println(Arrays.toString(arr));;
    }

    private static void sort(int[] arr,int r,int c,int max){
        if(r==-1){
            return;
        }
        if(c<r){
            if(arr[max] < arr[c]){
                max=c;
            }
            sort(arr,r,++c,max);
        }else{
            int temp=arr[max];
            arr[max]=arr[r];
            arr[r]=temp;
            sort(arr, --r, 0, 0);
        }
    }
}
