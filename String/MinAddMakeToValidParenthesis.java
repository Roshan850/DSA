import java.util.Stack;

public class MinAddMakeToValidParenthesis {

    public  int minValidPrenthesis(String str){
        int n = str.length();
        Stack<Character> s = new Stack<>();
        int balance = 0;
        int extraClose = 0;
        for(int i = 0; i<n;i++){
            char ch = str.charAt(i);
            if(ch == '('){
                s.push(ch);
                balance++;
            }
            else{

                if(balance >0 && s.peek() == '('){
                   balance -- ;
                   s.pop();
                }
                else {
                    extraClose++;
                }
            }
        }
       int c = balance + extraClose;
        return c;
    }
}
