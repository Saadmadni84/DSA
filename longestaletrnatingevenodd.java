import java.util.Scanner;
import static java.lang.Math.*;
public class longestaletrnatingevenodd {
    public static int evenOddBit(int [] a){
        int count=1;
        int maxcount=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[j]%2==0 & a[j-1]%2!=0 || a[j]%2!=0 & a[j-1]%2==0){
                    count++;
                }
            }
            maxcount=max(count,maxcount);
           
            }
            return maxcount;

        }
    public static int eveodd( int [] a){
        int count=1;
        int maxcount=0;
        for(int j=1;j<a.length;j++){
            if(a[j]%2==0 & a[j-1]%2!=0 || a[j]%2!=0 & a[j-1]%2==0){
                    count++;
                    maxcount=max(count,maxcount);
                }
                else{
                    count=1;
                }
            
        }
        return maxcount;
    }    
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }  
        System.out.println(evenOddBit(arr)); 

}
    
}
