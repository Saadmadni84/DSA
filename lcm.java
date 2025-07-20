import java.util.Scanner;
import java.lang.Math;
public class lcm {
    public static int lcm(int a, int b) {
         int res=Math.max(a, b);
        while(true){
            if(res%a==0 && res%b==0)
                return res;
            res++;  
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        System.out.println("LCM is="+lcm(num1, num2));
    }
    
}
