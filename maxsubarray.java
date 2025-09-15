import java.util.Scanner;

public class maxsubarray {
    public static int maxsub(int [] a){
        int con=a[0];
        for(int i=0;i<a.length;i++){
            int res=0;
            for(int j=i;j<a.length;j++){
                res=res+a[j];
                if(res>con){
                    con=res;
                }
            }
        }
        return con;    
    }
    public static int maxsube(int [] a){
        int sum =a[0];
        int maxsum=a[0];
        for(int i=1;i<a.length;i++){
            if(sum>0){
                sum=sum+a[i];
            }
            else{
                sum=a[i];
            }
            if(sum>maxsum){
                maxsum=sum;
            }
        }
        return maxsum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int [n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(maxsub(arr));
        System.out.println(maxsube(arr));
    }
    
}
