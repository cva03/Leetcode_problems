package puzzle;

import java.util.Arrays;

public class ZeroArray {
    static int a=0;
    public static void main(String[] args) {
        int[] arr={1,2,0,4,3,0,5,0};
        swap(arr);
        System.out.println(Arrays.toString(arr));
    }
  static void swap(int[] num){
      for(int i=0;i< num.length;i++){
          if(num[i]==0){
              for(int j=i+1;j<num.length;j++){
                  if(num[j]!=0){
                      int temp=num[i];
                      num[i]=num[j];
                      num[j]=temp;
                      i=j-1;
                      break;
                  }
              }
          }
      }
  }
}
