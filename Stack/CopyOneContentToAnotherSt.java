import java.util.Stack;

public class CopyOneContentToAnotherSt {
    public void doCopy(){
        Stack<Integer> st = new Stack<>();
        Stack<Integer> st1 = new Stack<>();

        st.push(78);
        st.push(23);
        st.push(11);
        st.push(45);
        st.push(87);
        System.out.println(st);

        for(int i = 0 ;i<st.size();i++){
            int element = st.get(i);
            System.out.println(element);
            st1.push(element);
        }
        System.out.println(st1);
    }
    public static void main(String[] args){
        CopyOneContentToAnotherSt c = new CopyOneContentToAnotherSt();
        c.doCopy();
    }
}


