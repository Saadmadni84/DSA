import java.util.Scanner;

public class dtobconversion {
    public static String decimalToBinary(int num){
    String b="";
    while(num>=1){
        int x=num%2;
        num=num/2;
        b=x+b;
    }
    return b;
}
    public static int binaryToDecimal(String c){
        int res=0;
        int p=1;
        for(int i=c.length()-1;i>=0;i--){
            if(c.charAt(i)=='1'){
                res=res+p;
            }
            p=p*2;
        }
        return res;

    }
          



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a decimal number:");
        int num = scan.nextInt();
        String b=decimalToBinary(num);
        System.out.println(b);
    
        System.out.println(binaryToDecimal(b));

    }
    
}
