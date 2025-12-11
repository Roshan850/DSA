class InnerStringDemo {
    public String reverseWord(String str) {
        // step 1 -> Split according to Single space
        String[] stArr = str.trim().split(" ");

        System.out.println(stArr.length-1);
        // step 2 -> Add in reverse order with single space
        StringBuilder stb = new StringBuilder("");

        for (int i = stArr.length - 1; i >= 0; i--) {
            stb.append(stArr[i]);
            // for adding space
            if (i > 0) {
                stb.append(" ");
            }
        }

        return stb.toString();
    }

    public boolean isValid(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                sb.append(c); // push
            } else {
                if (sb.length() == 0)
                    return false;
                char last = sb.charAt(sb.length() - 1);
                if ((c == ')' && last != '(') ||
                        (c == '}' && last != '{') ||
                        (c == ']' && last != '[')) {
                    return false;
                }
                sb.deleteCharAt(sb.length() - 1); // pop
            }
        }
        return sb.length() == 0;
    }

    // public boolean isValid2(String exp) {
    // // step
    // }
}

public class StringDemo {

    public static void main(String[] args) {
       InnerStringDemo s = new InnerStringDemo();
       String Str = "    Hello I am roshan  kumar jha ";
       s.reverseWord(Str);

//
//        System.out.println(s.reverseWord(Str));

        //MINADD MAKE TO VALID PARENTHESIS
        // MinAddMakeToValidParenthesis m = new MinAddMakeToValidParenthesis();
        // String str1 = "())(()(";
        // String str2 = "";
        // System.out.println(m.minValidPrenthesis(str1));
        // System.out.println(m.minValidPrenthesis(str2));
    }

}