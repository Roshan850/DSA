import java.util.Stack;

public class Difference {
    public void doCode(String str){
        Stack<Character> st = new Stack<>();
        for(int i = 0 ;i<str.length();i++){
             st.push(str.charAt(i));
        }
        System.out.println(st);

        int min = st.get(0);
        int max=  st.get(0);
        for(int i = 1 ;i<st.size();i++){
            int el = st.get(i);
            System.out.println(el);
            if(el > max){
                max = el;
            }
            if(el < min){
                min = el;
            }
        }
        System.out.println(max-min);
    }

    public static void main(String[] args) {
        Difference d = new Difference();
        String st = "aadhfshf";
        d.doCode(st);
    }
}
//write a program to find out the distance between greastest and smallest character in a given string using stack
// 879
 // print all pattern first 8 and then 7 and then 9
// 2. Make a stack with 8 elements write a program to delete an element at third position of row