import java.util.Scanner;

public class hcfe {
    public static int hcf(int num1, int num2) {
        int p=num1;
        int q=num2;
        
        while(p!=q){
            if(p>q)
                p=p-q;
            else
                q=q-p;
        }
        return p;

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        System.out.println("HCF is="+hcf(num1, num2));
    }
    
}

