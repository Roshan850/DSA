import java.util.Stack;

public class Duplicate_Paranthesis {
    public boolean duplicateElement(String str) {
        Stack<Character> cs = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            char ch = str.charAt(i);
            if (ch == ')') {
                while (cs.peek() != '(') {
                    cs.pop();
                    count++;
                }
                if (count < 1) {
                    return true; // Duplicate found
                } else {
                    cs.pop(); // Pop last opening brackt
                }
            } else {
                // push opening , push operator and operand
                cs.push(ch);

            }
        }
        return false;
    }
}
