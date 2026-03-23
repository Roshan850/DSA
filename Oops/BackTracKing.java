public class BackTracKing {
    public static void findPermutation(String str, String res) {
        if (str.length() == 0) {
            System.out.println(res);
        }
        int i;
        for ( i = 0; i <= str.length() - 1; i++) {
            System.out.println("before "+str.length());
            char curr = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i + 1);
            findPermutation(newString, res + curr);
            System.out.println("after "+str.length());
            
        }
    }

    public static void main(String[] args) {
        String str = "roshan";
         findPermutation(str, "");
    }

}





// Stack Trace:
// -----------------------
// Call: findPermutation("abc", "")     // i=0 → curr='a', NewStr="bc"
// |
// |-> Call: findPermutation("bc", "a")     // i=0 → curr='b', NewStr="c"
//     |
//     |-> Call: findPermutation("c", "ab")     // i=0 → curr='c', NewStr=""
//         |
//         |-> Call: findPermutation("", "abc")  // base case → prints "abc"
//     |
//     |-> Call: findPermutation("b", "ac")     // i=1 → curr='b', NewStr=""
//         |
//         |-> Call: findPermutation("", "acb")  // base case → prints "acb"

// |-> Call: findPermutation("ac", "b")     // i=1 → curr='a', NewStr="c"
//     |
//     |-> Call: findPermutation("c", "ba")
//         |
//         |-> Call: findPermutation("", "bac")  // base case → prints "bac"
//     |
//     |-> Call: findPermutation("a", "bc")
//         |
//         |-> Call: findPermutation("", "bca")  // base case → prints "bca"

// |-> Call: findPermutation("ab", "c")     // i=2 → curr='a', NewStr="b"
//     |
//     |-> Call: findPermutation("b", "ca")
//         |
//         |-> Call: findPermutation("", "cab")  // base case → prints "cab"
//     |
//     |-> Call: findPermutation("a", "cb")
//         |
//         |-> Call: findPermutation("", "cba")  // base case → prints "cba"
