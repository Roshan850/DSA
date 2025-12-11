import java.util.*;

class Method {
    // WRITE A PROGRAM TO DELETE A ELEMENT FROM THE MIDDLE OF THE STACK
    // WRITE A PROGRAM TO INSERT A ELEMENT AT THE BOTTOM OF STACK

    void popMidElement(Stack<Integer> st) {
        int mid = (st.size()) / 2;
        if (st.size() % 2 != 0) {

            int arr[] = new int[mid];
            if (st.isEmpty()) {
                System.out.println("stack is empty");
            }

            for (int i = 0; i < mid; i++) {
                arr[i] = st.pop();

            }
            int de = st.pop();
            for (int i = arr.length - 1; i >= 0; i--) {
                st.push(arr[i]);
            }
            System.out.println("\n\n");
            System.out.println("deleted element is" + de);
        } else {
            int arr[] = new int[mid - 1];
            if (st.isEmpty()) {
                System.out.println("stack is empty");
            }

            for (int i = 0; i < mid - 1; i++) {
                arr[i] = st.pop();

            }
            int de = st.pop();
            for (int i = arr.length - 1; i >= 0; i--) {
                st.push(arr[i]);
            }
            System.out.println("\n\n");
            System.out.println("deleted element is" + de);
        }

    }

    void pushAtTheBottomOfStack(Stack<Integer> st, int num) {
        int n = st.size();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = st.pop();
        }
        st.push(num);
        for (int i = arr.length - 1; i >= 0; i--) {
            st.push(arr[i]);
        }

    }

    void pritStack(Stack<Integer> s) {
        for (int i = 0; i < s.size(); i++) {
            System.out.print(s.get(i) + "->");
        }
        System.out.println("null");
    }
}

public class StackDemo {

    // public char[] s = { 'h','e','l','l','o' };

    // public void reverseString(char[] s) {
    // Stack<Character> st = new Stack<>();
    // int n = s.length;
    // int i = 0;
    // while (i < n) {
    // st.push(s[i]);
    // i++;

    // }
    // i = 0;
    // while (i < n) {
    // s[i] = st.peek();
    // st.pop();
    // i++;
    // }

    // }

    public void pushBottom(Stack<Integer> s, int data) {  //using-stack
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushBottom(s, data);
        s.push(top);
    }

    public void doStack() {

        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(11);
        st.push(20);
        st.push(50);
        st.push(60);
        // int top = st.peek();
        // System.out.println(top);
        // st.pop();
        System.out.println(st);

        // for access the element
        for (int i = 0; i < st.size(); i++) {
            System.out.println(st.get(i));
        }

    }

    public String reverseString1(String str) {
        Stack<Character> st = new Stack<>();
        String reveString1 = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            st.push(ch);
        }
        while (!st.isEmpty()) {
            reveString1 = reveString1 + st.peek();
            st.pop();

        }
        return reveString1;

    }

    public void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;

        }
        int top = s.pop();
        reverseStack(s);
        pushBottom(s, top);
    }

    public void pritStack(Stack<Integer> s) {
        for (int i = 0; i < s.size(); i++) {
            System.out.println(s.get(i));
        }
    }

    // NEXT GREATER ELEMENT IN THE STACK

    public int[] nextGreaterElement(int[] nums) {
        Stack<Integer> s = new Stack<>();
        int n = nums.length;
        int nextgrater[] = new int[nums.length];

        for (int i = 2 * n - 1; i >= 0; i--) {
            int idx = i % n; // circular index
            // Checking empty and stack top is less than equal to arr[i]
            while (!s.isEmpty() && nums[s.peek()] <= nums[idx]) {
                s.pop();
            }
            // if stack is empty than return -1
            if (s.isEmpty()) {
                nextgrater[idx] = -1;

            } else {
                nextgrater[idx] = nums[s.peek()];
            }
            // push
            s.push(idx);

        }
        for (int i = 0; i <= nextgrater.length; i++) {
            System.out.println(nextgrater[i]);

        }

        return nextgrater;
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Method m = new Method();
        StockSpamProblem sp = new StockSpamProblem();

        // StackDemo t = new StackDemo();
        // st.push(10);
        // st.push(20);
        // st.push(30);
        // st.push('H');
        // st.push('e');
        // st.push('l');
        // st.push('l');
        // st.push('o');

        // while (st.isEmpty()) {
        // System.out.println(st.peek());
        // st.pop();

        // REVERSE STRING INPUTS
        // t.reverseString(t.s);
        // System.out.println((t.s));
        // st.push(3);
        // st.push(2);
        // st.push(1);

        // t.pushBottom(st, 4);

        // while (!st.isEmpty()) {
        // System.out.println(st.pop());

        // }
        // System.out.println(t);

        // t.doStack();
        // System.out.println(t.reverseString1("India"));

        // INPUT FOR REVERSE STACK
        // t.pritStack(st);
        // System.out.println("\n\n\n\n");
        // t.reverseStack(st);
        // t.pritStack(st);
        // int arr[] = { 1, 2, 3, 4, 3 };
        // t.nextGreaterElement(arr);

        // int a = 5;
        // // while (a < 5) {
        // // a = a++;
        // // System.out.println(a);
        // // }
        // int b = a++ + ++a;
        // System.out.println(b);

        // int a = 5;
        // int b = 6;
        // int sum = a ^ b;
        // int carry = (a & b) << 1;
        // System.out.println(sum);
        // System.out.println(carry);
//        st.push(13);
//        st.push(12);
//        st.push(11);
//        st.push(10);
//        st.push(9);
//        st.push(8);
        // st.push(7);
        // m.pritStack(st);
        // m.popMidElement(st);
        // m.pritStack(st);
        // m.doMidElementDelete();

//        m.pritStack(st);
//        System.out.println("\n");
//        m.pushAtTheBottomOfStack(st, 100);
//        m.pritStack(st);


        //StockSpamproblem input
//        int arr[]= {13,12,11,10,9,8,7};
//        sp.printArr(arr);
//        sp.printArr(sp.stockSpamProb(arr));

        // Duplicate Paranthesis input
        Duplicate_Paranthesis d = new Duplicate_Paranthesis();
         String str = "((a+b))";//true
         String str2 = "((a+b)+(c+d))"; //false

        System.out.println(d.duplicateElement(str));
        System.out.println(d.duplicateElement(str2));






    }

}
// every class inherit
// WRITE A PROGRAMM TO REVERSE THE STRING USING STACK
// stack memory allocation
// WRITE A PROGRAM TO VALIDATE THE PARANTHESIS