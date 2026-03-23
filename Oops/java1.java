// class Solution {
//     public String convertDateToBinary(String date) {
//         String[] parts=date.split("-");
//         String b1=Integer.toBinaryString(Integer.parseInt(parts[0]));
//         String b2=Integer.toBinaryString(Integer.parseInt(parts[1]));
//         String b3=Integer.toBinaryString(Integer.parseInt(parts[2]));

//         String output= b1+"-"+b2+"-"+b3;
//         return output;

//     }
// }

// public class java1 {
//     public static void main(String args[]){
//         String s = "2024-05-23";
//         Solution p=new Solution();

//         String op = p.convertDateToBinary(s);
//         System.out.println(op);

//     }

// }
import java.util.Arrays;

class Solution {
    public String largestNumber(int[] nums) {
        String[] str = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            str[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(str, (a, b) -> (b + a).compareTo(a + b));

        if (str[0].equals("0")) {
            return "0";
        }

        StringBuilder result = new StringBuilder();
        for (String s : str) {
            result.append(s);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums1 = {3, 30, 34, 5, 9};
        System.out.println("Answer 1 :"+s.largestNumber(nums1));
        
        
    }
}
