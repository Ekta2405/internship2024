import java.util.*;

public class Example17 {
    public static void main(String args[]){
        Deque<Integer> dq=new LinkedList<>();
        dq.offerFirst(10);
        dq.offerFirst(12);
        dq.offerLast(0);
        dq.offerFirst(9);
        dq.offerLast(19);
        dq.offerLast(13);
        
            /*  System.out.println(dq);
            System.out.println(dq.pollFirst());
            System.out.println(dq.pollLast());
            System.out.println(dq);*/

             while(!(dq.isEmpty())){
            System.out.println(dq.pollLast()+" ");
        }

    }
}
