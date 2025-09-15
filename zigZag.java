
import java.util.Scanner;

public class zigZag {
    public static void zig( int [][] a){
        
        System.out.println(a.length);
         for(int i=0;i<a.length;i++){
           
            if(i%2==0){
                for(int j=0;j<a[i].length;j++){
                 System.out.println(a[i][j]);
            }
        } 
            else{
                for(int j=a[i].length-1;j>=0;j--){
                   System.out.println(a[i][j]); 
                }

            }   
            
        }
    }
    public static void main(String [] args){
      
        int [][]arr={{1,2,3,4},
        {5,6,7,8},{
            7,8,9,99
        }};
        zig(arr);

    }
    
}
