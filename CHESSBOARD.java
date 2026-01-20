import java.util.Scanner;

public class Main {
    public static String determineColor(String s) {
        if((s.charAt(0) - '0') % 2 == 0){
             if(s.charAt(1)%2==0){
                return "Black";
             }
             else {
                return "White";
             }   
        }
        else{
            if(s.charAt(1)%2==0){
                return "White";
            }
            else{
                return "Black";
            }
        }
    
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        String result = determineColor(s);
        System.out.println(result);
    }
}
