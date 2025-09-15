import java.util.Scanner;
import java.lang.Math;

public class rightMSb {
    public static int rightMostSetBit(int n){
        return (int)(Math.log10(n^(n & (n-1)))/Math.log10(2))+1;

    }
    public static int countSetBits(int n){
        int count=0;
        while(n>0){
            n=n&(n-1);
            count++;
    }
    return count;

    }    



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        System.out.println(rightMostSetBit(n));
        System.out.println(countSetBits(n));


    }
    
}
