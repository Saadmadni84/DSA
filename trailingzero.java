import java.util.Scanner;
import java.lang.Math;
public class trailingzero {
      
public static int trailingZero(int n) {
        int count = 0;
        int i=1;
            while(n>=(int)Math.pow(5,i)){
                count=count+n/(int)Math.pow(5,i);
                i++;
            }
        
        return count;  
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scan.nextInt();
        System.out.println(trailingZero(num));

        
        
    }
    
}
