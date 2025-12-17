import java.util.HashSet;

public class CountDistinctElement {
    public int countD(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int i =0;i< arr.length;i++){
            set.add(arr[i]);

        }
        return set.size();
    }
}
