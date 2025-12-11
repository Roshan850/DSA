import java.util.Stack;

public class QueueUsingStack {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public boolean isEmpty(){
        return s1.isEmpty();
    }
    public void add(int data){
        while(!s1.isEmpty()){
            s2.push(s1.pop()); // transferring element for stack 1 to stack 2
        }
        s1.push(data);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }
    public int remove(){
        if(s1.isEmpty()){
            System.out.println("Que is empty");
            return -1;
        }

        return s1.pop();
    }
    public int peek(){
        if(s1.isEmpty()){
            System.out.println("Que is empty");
            return -1;
        }

        return s1.peek();
    }

    public void printQ(){
        int n = s1.size();
        int i  =0;
        while (i<n){
            System.out.println("Element in queue :"+s1.get(i));
            i++;

        }
    }
}

