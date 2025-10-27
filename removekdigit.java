import java.util.*;
class remove{
    public String removeKdigits(String num, int k) {
        Stack<Integer> stack=new Stack<>();
        int i=0;
        int j=0;
         while(i<num.length() ){
            int in=num.charAt(i)-'0';
            while(true){
                if(stack.isEmpty()){
                    stack.push(in);
                    break;
                }
                
                if(stack.peek()>in && j<k){
                    stack.pop();
                    j++;    
                }
                else{
                    stack.push(in);
                    break;
                }
            }
            i++;

        }
        while (j< k && !stack.isEmpty()) {
            stack.pop();
            j++;
        }
        String s="";
        while(!stack.isEmpty()){
           s=String.valueOf(stack.pop())+s;
        }
        s = s.replaceFirst("^0+", "");
        if (s.isEmpty()) s = "0";
       return s;      
    }
}

public class removekdigit {
    public static void main(String [] args){
        remove r=new remove();
        String s="9";
        int k=1;
        String res=r.removeKdigits(s, k);
        System.out.println(res);
    }
    
}
