import java.util.Scanner;

public class paintersproblem {
    public static boolean check(int [] a,int m,int b){
         int painter=1;
         int spg=0;
         for(int i=0;i<a.length;i++){
            if(a[i]>m){
                return false;
            }
            if((spg+a[i])<=m){
                spg=spg+a[i];

            }
            else{
                painter++;
                if(painter>b){
                    return false;
                }
                spg=a[i];
            }
         }
         return true;
    }
    public static int allocate(int [] a,int c,int b){
        int l=0,h=0;
        for(int i=0;i<a.length;i++){
            h=h+a[i];
        }
        int m=0;
        int res=-1;
        while(l<=h){
            m=(l+h)/2;
            if(check(a,m,b)==true){
            res=m;
            h=m-1;
            }
            else{
                l=m+1;
            }
        }
        return res*c;
    }
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); 
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter number of painter");
        int b=sc.nextInt();
        int a=sc.nextInt();
        System.out.println(allocate(arr,a,b));
    }

    
}
