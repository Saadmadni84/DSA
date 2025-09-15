import java.util.Scanner;

public class canjump {
    public static boolean can(int [] a){
        int c=a.length-1;
        int j=a[0];
        for(int i=0;i<a.length;i++){
            if(j==c || j>c){
                return true;
            }
            else{
                j=j+a[j];
            }
            
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
       
        System.out.println(can(arr));
    }
    
}
    

