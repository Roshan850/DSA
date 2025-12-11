import java.util.Stack;

public class GreatestAndMinimum {
    public void doCode(){
        Stack<Integer> st = new Stack<>();

        st.push(100);
        st.push(23);
        st.push(-5);
        st.push(45);
        st.push(87);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i =0 ;i<st.size();i++){
            int element = st.get(i);
            if(element > max){
                max = element;
            }
            if(element < min) {
                min = element;
            }
        }
        System.out.println("Maximum element = "+max);
        System.out.println("Minimum element = "+min);

    }

    public static void main(String[] args) {
        GreatestAndMinimum g = new GreatestAndMinimum();
        g.doCode();
    }
}
//write a program to find out the distance between greastest and smallest character in a given string using stack
