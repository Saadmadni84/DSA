import java.util.Scanner;
public class Hcf {
    int p;
    public int gm(int num1,int num2){
        if(num1>num2){
            p=num2;
        }
        else{
            p=num1;
        }
        for(int i=p;i>1;i--){
            if(num1%i==0 && num2%i==0){
                return i;
              
        }
    }
        return 1;

        
        
    }
    public static void main(String[] args) {
        Hcf h=new Hcf();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        System.out.println("HCF is="+h.gm(num1, num2));
    }
    
}
