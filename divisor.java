import java.util.Scanner;
public class divisor {
    static void findDivisors(int num) {

        int i=0;
        for(i=1;i*i<=num;i++){
            if(num%i==0){
                System.out.println(i);    
            }

        }
        for( ;i>=1;i--){
            if(num%i==0 && i!=num/i) { //to avoid printing same divisor twice.  
                System.out.println(num/i);
        
        }
    }
}

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scan.nextInt();
        findDivisors(num);
    }
    
}
