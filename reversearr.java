import java.util.Arrays;
import java.util.Scanner;

public class reversearr {
    public static void reverse(int [] a){
        int i=0,j=a.length-1;
        while(i<=j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];   
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        reverse(arr);
    }
    
}
