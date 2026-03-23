// import java.util.Stack;

// public class stack {
//     public static void main(String[] args) {
//         // Create a stack
//         Stack<Integer> st = new Stack<>();

//         // Push elements onto the stack
//         st.push(5);
//         st.push(7);
//         st.push(8);

//         // Pop an element from the stack
//         int temp = st.pop();
//         System.out.println("Popped element: " + temp);

//         // Peek at the top element without removing it
//         int top = st.peek();
//         System.out.println("Top element: " + top);

//         // Check if the stack is empty
//         boolean isEmpty = st.isEmpty();
//         System.out.println("Is stack empty? " + isEmpty);

//         // Get the size of the stack
//         int size = st.size();
//         System.out.println("Stack size: " + size);
//     }
// }
import java.util.*;

public class stack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Create a stack
        // Stack<Integer> st = new Stack<>();

        // // Push elements onto the stack
        // st.push(5);
        // st.push(7);
        // st.push(8);

        // // Pop an element from the stack
        // int temp = st.pop();
        // System.out.println("Popped element: " + temp);

        // // Peek at the top element without removing it
        // int top = st.peek();
        // System.out.println("Top element: " + top);

        // // Check if the stack is empty
        // boolean isEmpty = st.isEmpty();
        // System.out.println("Is stack empty? " + isEmpty);

        // // Get the size of the stack
        // int size = st.size();
        // System.out.println("Stack size: " + size);
    System.out.print("Enter a single word: ");
        String str = sc.next();
        System.out.println("You entered: " + str);

        // Consume the leftover newline
        sc.nextLine();

        // Reading a full line
        System.out.print("Enter a full line: ");
        String str1 = sc.nextLine();
        System.out.println("You entered: " + str1);
    System.out.println(str.length()+","+str1.length());
        
    }
}
