import java.util.ArrayList;
import java.util.Scanner;

public class freqOfEleArray {
    public static void freq(int [] arr){
        ArrayList<Integer> lst = new ArrayList<>(); 
        for(int i=0;i<arr.length;i++){
            int count=0;
           
            for(int j=i;j<arr.length;j++){
                if(arr[i]==arr[j]){
                   count++;
                }
            }
            if(!lst.contains(arr[i])){
                lst.add(arr[i]);
                lst.add(count);
            }
        }
        System.out.println(lst);
    System.out.println("optimise method");
    System.out.println("for soreted array");
    int freq=1;
    for(int i=1;i<arr.length;i++){
        if(arr[i]==arr[i-1]){
          freq++;
        }
        else{ 
                System.out.println(arr[i-1]+" "+freq);
                freq=1;
        }
    }
    System.out.println(arr[arr.length-1]+" "+freq);
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];   
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        freq(arr);
        
    }
    

    
}
