
import java.util.Scanner;
import java.util.Arrays;

public class kthlargestele {
    public static int findKthLargest(int[] arr,int k){ 
        int max=arr[arr.length-k];
        return max;
    }
    public static int secondlargest(int[] arr){
        int max1,max2=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]>arr[i])
            {
                max1=arr[i+1];
                max2=arr[i];
            }
            else{
                max1=arr[i];
                max2=arr[i+1];
            }
        }
        return max2;
    }



        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];   
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        Arrays.sort(arr);
        int k=sc.nextInt();
        System.out.println(findKthLargest(arr,k));
        System.out.println(secondlargest(arr));


    }

}
    

