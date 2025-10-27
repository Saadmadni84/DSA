import java.util.*;
class queue{
    Queue<Integer> q1=new LinkedList<>();
    public void pr(){
        int x=q1.size();
        for(int i=0;i<x;i++){
            System.out.println(q1.remove());
        }
     
    }
}
public class queuep {
    public static void main(String [] args){
        queue q=new queue();
        q.q1.add(1);
        q.q1.add(2);
        q.q1.add(3);
        q.q1.add(4);
        q.q1.add(5);
        q.pr();


    }
    
}
