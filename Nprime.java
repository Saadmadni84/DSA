import java.util.Scanner;
public class Nprime {
    static void printprime(int n) { //function to print prime numbers{
        boolean prime[] = new boolean[n+1];
        for (int i=2; i*i<=n; i++){
            if(prime[i] == false){
                for(int j=i*i;j<=n; j=j+i){
                    prime[j] = true;
                }
            }
        }
    
        for(int i=2; i<=n; i++){
            if(prime[i] == false){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scan.nextInt();
        printprime(n);

    }
    
}
