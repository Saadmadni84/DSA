import java.util.Scanner;
public class allocatebook {
    public static boolean ispossible(int m,int [] a,int b){
        int spc=0;
        int student=1;
        for(int i=0;i<a.length;i++){
            if(a[i]>m){
                return false;
            }
            
            if((spc+a[i])<=m){
                spc=spc+a[i];
            }
            else {
                student++;
                if(student>b){
                    return false;
                }
                spc=a[i];
            }    

        }
        return true;

    }
    public static int allocate(int [] a,int b){
        int l=a[0],h=0;
        for(int i=0;i<a.length;i++)  {
            if(a[i]<l){
                l=a[i];
                
            }
            h=a[i]+h;
        }
        int m=0;
        int res=-1;
        while(l<=h){
            m=(l+h)/2;
            if(ispossible(m,a,b)==true){
                res=m;
                h=m-1;
            }
            else{
                l=m+1;
            }
        }
        return res;

          
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter number of person");
        int b=sc.nextInt();
        System.out.println(allocate(arr,b));
    }
    
}
