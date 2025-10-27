import java.util.*;
class reverse{
   public int evalRPN(String[] t){
    Stack<Integer> s = new Stack<>();
    for(int i=0;i<t.length;i++){
        String token=t[i];
        if (!token.equals("+") && !token.equals("-") &&
                !token.equals("*") && !token.equals("/")){
            s.push(Integer.parseInt(token));}
        else{
            int a=s.pop();
            int b=s.pop();
            int c=0;
            switch (t[i]) {
            case "+":
                c = b + a;
                break;
            case "-":
                c = b - a;
                break;
            case "*":
                c = b * a;
                break;
            case "/":
                c = b / a;
                break;
            default:
                System.out.println("Invalid operator");
        }
            s.push(c);
        }
    
    }
    return s.peek();

   }}
public class revrsepolish {
    public static void main(String [] args){
        reverse r=new reverse();
        String [] t={"2","-1","+","3","*"};
        System.out.println(r.evalRPN(t));
    }


}