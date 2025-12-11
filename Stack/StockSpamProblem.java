import java.util.Stack;

public class StockSpamProblem {
    public int[] stockSpamProb(int[] stock){
        Stack<Integer> st = new Stack<>();
        int span[] = new int[stock.length];
        span[0] = 1;
        st.push(0);
        for(int i = 1 ;i<stock.length;i++){
        int current = stock[i];
        while (!st.isEmpty() && current > stock[st.peek()] ){
            st.pop();
        }
        if(st.isEmpty()){
            span[i] = i+1;

        }
        else{
            int prevHigh = st.peek();
            span[i] = i - prevHigh;

        }
            st.push(i);

        }
        return  span;

    }

    public void printArr(int[] arr){
        for(int i = 0;i< arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
