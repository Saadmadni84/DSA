import java.util.Scanner;

public class leadersarray {
    public static void rightmax(int [] a){
        boolean isleader=false;
        for(int i=0;i<a.length;i++){
            
            isleader=true;
            for(int j=i+1;j<a.length;j++){
                if(a[i]<=a[j]){
                    isleader=false;
                    break;
                }   
                }
                if(isleader){
                    System.out.println(a[i]);
                }

            }
        System.out.println("optimise method");
        int currleader =a[a.length-1];
        System.out.println(currleader);
        for(int i=a.length-2;i>=0;i--){
            if(a[i]>currleader){
                currleader=a[i];
                System.out.println(currleader);
            }
        }
    }
    
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("number of element in array");
        int n=sc.nextInt();
        int [] arr=new int[n];  
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        
        } 
        rightmax(arr); 
    }
    
}
