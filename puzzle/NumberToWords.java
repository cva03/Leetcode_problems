package puzzle;

import java.util.Scanner;

public class NumberToWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true) {
            System.out.println(get(sc.nextInt()));
        }
    }

    static String get(int n){
        String result="";
        String[] single={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
        String[] tens={"Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eightteen","NineTeen"};
        String[] mTens={"Ten","Twenty","Thirty","Fourty","fifty","Sixty","Seventy","Eighty","Ninety","Hundred"};
        if(n>=100){
            result=single[(n/100)]+" hundred";
            n=n%100;
        }
        if(n!=0 && n>=20){
            if(result.length()==0)
                result=mTens[n/10-1];
            else
                result=result+" and "+ mTens[n/10-1];
            n=n%10;
        }else if( n>10 && n<20){
            if(result.length()==0)
                result=tens[n-11];
            else
                result=result+" and "+tens[n-11];
            return result;
        }
        if(n>0){
            result=result+" "+single[n];
        }
        return result;
    }

}
