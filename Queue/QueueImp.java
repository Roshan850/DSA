import java.util.LinkedList;
import java.util.Queue;

public class QueueImp {
    public static void main(String[] args) {
//        CircularQueueUsingArray cq = new CircularQueueUsingArray(3);
//           cq.add(1);
//           cq.add(2);
//           cq.add(3);
//           cq.printCQ();
//        System.out.println("Deleted el is = "+cq.remove());

//        QueueUsingStack q = new QueueUsingStack();
//        q.add(1);
//        q.add(2);
//        q.add(3);
//        q.printQ();
//        System.out.println("Deleted el is = "+q.remove());
//        System.out.println("Deleted el is = "+q.remove());
//        System.out.println("Deleted el is = "+q.remove());
//        q.printQ();
//
//        FirstNonRepeating r = new FirstNonRepeating();
//        String str = "aabccxxbm";
//        System.out.println(r.firstNonRepeatingchar(str));

//        Queue<Integer> q= new LinkedList<>();
//        InterleaveQ n = new InterleaveQ();
//        q.add(10);
//        q.add(20);
//        q.add(30);
//        q.add(40);
//        q.add(50);
//        q.add(60);
//        q.add(70);
//        q.add(80);
//        q.add(90);
//        q.add(100);
//        n.interLeaveImp(q);
//        n.printQ(q);

//        Queue<Integer> q= new LinkedList<>();
//        ReverseQ r = new ReverseQ();
//        q.add(10);
//        q.add(20);
//        q.add(30);
//        q.add(40);
//        q.add(50);
//        q.add(60);
//        q.add(70);
//        q.add(80);
//        q.add(90);
//        q.add(100);
//        r.printQ(q);
//        r.reverseQCode(q);
//        r.printQ(q);


        StackUsingDeque s = new StackUsingDeque();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("Peek is :"+s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());




    }
}
