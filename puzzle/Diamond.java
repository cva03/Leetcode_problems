package puzzle;

public class Diamond {
    public static void main(String[] args) {
        print(20,20,7,7,5);
    }
    private static void print(int l,int h,int c1,int c2,int s){
        int startRow=c2-s+1;
        int startCol1=c1-2;
        int startCol2=c1;
        for(int row=0,count=0;row<l;row++){
            for(int col=0;col<h;col++){
                if(row==0 || col==0 || row==l-1 || col==l-1){
                    System.out.print("* ");
                }else if(col==c1-1 && (row==c2-s || row==c2+s+1)){
                    System.out.print("x ");
                }else if(count<4*s && row==startRow && (col==startCol1 || col==startCol2)) {
                    if(count<2*s) {
                        if (col == startCol1) {
                            System.out.print("/ ");
                            startCol1--;
                            if(startCol1==0){
                                startCol1++;
                            }
                        } else {
                            System.out.print("\\ ");
                            startCol2++;
                            if(count>2*s-2){
                                startCol2--;
                            }
                        }
                    }else{
//                        Scanner sc=new Scanner(System.in);
//                        sc.nextLine();
//                        System.out.println("sc1+sc2: "+startCol1+" "+startCol2);
                        if (col == startCol1) {
                            System.out.print("\\ ");
                        } else {
                            System.out.print("/ ");
                            startCol1++;
                            startCol2--;
                        }
                    }
                    if(count%2==1){
                        startRow++;
                    }
                    count++;
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
