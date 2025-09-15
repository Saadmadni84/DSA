import java.util.Scanner;
import java.util.Set;

public class Nofevenodd {
    public static int[] evenOddBit(int n){
        int a=(n&0xaaaaaaaa);
        int b=(n&0x55555555);
        int setBits = Integer.bitCount(a);
        int setb = Integer.bitCount(b);
        int [] set={setBits,setb};

        return set;
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int[] counts = evenOddBit(n);
       System.out.println(counts[1]+" "+counts[0]);
      
       
    }
}
    

