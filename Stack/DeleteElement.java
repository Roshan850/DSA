import javax.sound.midi.Soundbank;
import java.util.Stack;

public class DeleteElement {
    public void deleteCode(){
        Stack<Integer> st = new Stack<>();
        st.push(78);
        st.push(23);
        st.push(11);
        st.push(45);
        st.push(100);
        st.push(0);
        st.push(7);
        st.push(8);
        System.out.println(st);
        int n = 5;

        int arr[] = new int[n-1];
        for(int i = 0;i<n-1;i++){
            arr[i] = st.peek();
            st.pop();
        }
        System.out.println("Deleted element is "+ st.pop());
        for(int i=0;i<n-1;i++){
            st.push(arr[i]);
        }
        System.out.println(st);
    }

    public static void main(String[] args) {
        DeleteElement d = new DeleteElement();
        d.deleteCode();
    }
}
// 2. Make a stack with 8 elements write a program to delete an element at third position of row
// 3. Make a stack with six element write a progam to insert at 4th position of the top
