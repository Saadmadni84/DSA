import java.util.Scanner;
import java.lang.Math;
public class prime {
    public static boolean isPrime(int n) {
        
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scan.nextInt();
        System.out.println(isPrime(n));
    }
    
}
