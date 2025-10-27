import java.util.*;
class qur{
    public static void qreverse(int [] a){
    Stack<Integer> s=new Stack<>();
    Queue<Integer> q=new LinkedList<>();
     for(int i=0;i<a.length;i++){
        q.add(a[i]);
     }
    for(int i=0;i<a.length;i++){
        s.push(q.remove());
    }
    for(int i=0;i<a.length;i++){
        q.add(s.pop());
        System.out.println(q.remove());
    }
    
}

}
public class reversequeue {
        public static void main(String [] args){
            qur qe=new qur();
            int [] a={1,2,3,4,5};
            qe.qreverse(a);
    }

    
}
