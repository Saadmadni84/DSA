import java.util.Scanner;
public class lcme {
    public static int lcm(int a, int b) {
        int x=a*b;
        int p=a;
        int q=b;
        int res;
        while(p!=q){
            if(p>q)
                p=p-q;
            else
                q=q-p;
        }
        res=x/(p);
        return res;

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        System.out.println("LCM is="+lcm(num1, num2));
    }
    
}
