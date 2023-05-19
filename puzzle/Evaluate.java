package puzzle;

public class Evaluate {
    public static void main(String[] args) {
        System.out.println(postSet("545*+5/"));
    }
    static String postSet(String str){
        String result=str.charAt(0)+"";
        for(int i=1,counter=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='/' || ch=='*' || ch=='+' || ch=='-'){
                for(int j=i-counter,start=i;j<i;j++,start++){
                    result+=str.charAt(start)+" "+str.charAt(j);
                }
                counter=0;
                i=i+counter-1;
                if(i+1<str.length()){
                    result='('+result+')';
                }
            }else{
                counter++;
            }
        }
        return result;
    }
}
