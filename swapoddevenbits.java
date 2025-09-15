import java.util.Scanner;

public class swapoddevenbits {

    public static int swapBits(int n){
        return ((n& 0xaaaaaaaa)>>>1) | ((n&0x55555555)<<1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(swapBits(n));


    }
    
}
