import java.util.*;
class closest{
    public static void sol(int [] a){
        Stack <Integer> stack=new Stack<>();
        for(int i=0;i<a.length;i++){
        while(!stack.isEmpty() && stack.peek()>a[i]){
            stack.pop();
        }
        if(stack.isEmpty()){
            System.out.println(-1);
        }
        else{
            System.out.println(a[stack.peek()]);
        }
        stack.push(a[i]);
    }
    }
}

public class closestsmallest {
    public static void main(String [] args){
        closest c=new closest();
        int [] a={2,1,5,3,4};
        c.sol(a);
    }
}
