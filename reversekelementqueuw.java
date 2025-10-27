 import java.util.*;
 class krq{
 
 public static void qreverse(int [] a,int k){
    Stack<Integer> s=new Stack<>();
    Queue<Integer> q=new LinkedList<>();
    Queue<Integer> q1=new LinkedList<>();
     for(int i=0;i<a.length;i++){
        q.add(a[i]);
     }
    for(int i=0;i<a.length;i++){
        if(i<k){
           s.push(q.remove());
        }
        else{
            q1.add(q.remove());
        }
        
    }
    while(!s.isEmpty()){
        q.add(s.pop());
    }
    while(!q1.isEmpty()){
        q.add(q1.remove());
}
    for(int i=0;i<a.length;i++){
        System.out.println(q.remove());
    }
    
}
 }
public class reversekelementqueuw {
       public static void main(String [] args){
            krq qe=new krq();
            int [] a={1,2,3,4,5};
            int k=5;
            qe.qreverse(a,k);
    }
    
}
