import java.util.Deque;
import java.util.LinkedList;

public class StackUsingDeque {
    Deque<Integer> s = new LinkedList<>();
    public void push(int data){
          s.addLast(data);
    }
    public int pop(){
       return s.removeLast();
    }
    public int peek(){
        return s.getLast();
    }
//    public void printStack(){
//        int n = s.size();
//        for(int i = 0 ; i< n;i++){
//            System.out.println(s.);
//        }
//    }
}
