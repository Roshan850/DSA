import java.util.LinkedList;
import java.util.Queue;

public class InterleaveQ {
    public void interLeaveImp(Queue<Integer> q){
        Queue<Integer> firstHalf = new LinkedList<>();
        int size = q.size();
        for(int i= 0;i<size/2;i++){
            firstHalf.add(q.remove());
            
        }
        while (!firstHalf.isEmpty()){
            q.add(firstHalf.remove());
            q.add(q.remove());
        }
        
    }
    public void printQ(Queue<Integer> q){
        int n = q.size();
        int i  =0;
        while (i<n){
            System.out.print(((LinkedList) q).get(i)+" ");

            i++;

        }
    }

//    public String interLeavTwoString(String s1,String s2){
//        Queue<Character> q1 = new LinkedList<>();
//        Queue<Character> q2 = new LinkedList<>();
//
//    }
}
