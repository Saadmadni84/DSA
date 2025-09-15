import java.util.Scanner;
public class searchmatrix {
    public static boolean smatrix(int [][] a,int t){
        for(int i=0;i<a.length;i++){
            int l=0,h=a[i].length-1;
            int m=0;
            while(l<=h){
                m=(l+h)/2;
                if(a[i][m]==t){
                    return true;
                }
                else if(a[i][m]>t){
                    h=m-1;
                }
                else{
                    l=m+1;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][] arr=new int[n][m];
        System.out.println("target element");
        int t=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(smatrix(arr,t));
        

    
}
}