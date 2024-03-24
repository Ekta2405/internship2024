import java.util.*;
public class Example16 {
    public static void main(String args[]){
        Queue<Integer> q=new LinkedList<>();
        q.offer(10);
        q.offer(12);
        q.offer(0);
        q.offer(9);
        q.offer(19);
        q.offer(13);
        while(!(q.isEmpty())){
            System.out.println(q.poll()+" ");
        }

    }
}
