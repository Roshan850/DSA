import java.util.Arrays;
import java.util.Comparator;

public class MaxLenChain {
    public static void main(String[] args) {
        int pairs[][] = {{5,24},{39,60},{5,28},{27,40},{50,90}};
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int chainLen = 1;
        int chainEnd = pairs[0][1]; //Last selected pair end // chain end
        for(int i = 0;i< pairs.length;i++){
            if(pairs[i][0] > chainEnd){
                chainLen++;
                chainEnd = pairs[i][1];
            }

        }
        System.out.println("Max length of chain= "+chainLen);
    }
}


//Sort pairs by their second value (end).
//        → You did this part correctly:
//
//        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));
//
//
//Pick pairs greedily:
//
//Start with the first pair.
//
//For every next pair, check if its start > previous end (not <).
//
//If yes → include it in the chain.
//
//🛑 Your Bug
//
//In your loop you wrote:
//
//        if (pairs[i][0] < chainEnd) {
//chainLen++;
//chainEnd = pairs[i][1];
//        }
//
//
//But the correct condition is:
//
//        if (pairs[i][0] > chainEnd) {   // start > end of last chosen
//chainLen++;
//chainEnd = pairs[i][1];
//        }
//
//
//Because for a valid chain:
//
//The new pair’s start must be strictly greater than the previous pair’s end.
