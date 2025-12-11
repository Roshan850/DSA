import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQ {
    public void reverseQCode(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();
        while (!q.isEmpty()){
            s.push(q.remove());

        }
        while (!s.isEmpty()){
            q.add(s.pop());
        }

    }
    public void printQ(Queue<Integer> q){
        int n = q.size();
        int i  =0;
        while (i<n){
            System.out.print(((LinkedList)q).get(i) +" ");
            i++;

        }
    }
}
