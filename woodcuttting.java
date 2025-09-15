import java.util.Scanner;

public class woodcuttting {
    public static int cut(int [] a,int k){
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        int l=0,h=max,m=0;
        

       
        while(l<=h){
            int wc=0;
            m=(l+h)/2;
            for(int i=0;i<a.length;i++){
                int g=(a[i]-m);
                if(g>0){
                    wc=wc+g;
                }
            }

            if(wc==k || l==m){
                return m;
            }
            else if(wc>k){
                l=m;
            }
            else{
                h=m;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        int k=scan.nextInt();
        System.out.println(cut(arr,k));
    }
    
}
