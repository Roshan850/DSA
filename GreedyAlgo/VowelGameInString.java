import java.util.Arrays;
import java.util.HashSet;
import java.util.*;

public class VowelGameInString {
    public boolean doesAliceWin(String s) {
        // Create a set of vowels
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o','u'));

        int countVowels = 0;

//Loop through each character of string
        for(char c : s.toCharArray()){
            if(vowels.contains(c)){
                countVowels ++;
            }
        }

        if(countVowels >= 1){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        VowelGameInString v = new VowelGameInString();
        String str = "leetcode";

       boolean ans =  v.doesAliceWin(str);
        System.out.println(ans);

    }
}

