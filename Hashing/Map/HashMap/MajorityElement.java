import java.util.HashMap;

public class MajorityElement {

    public void majorityEle(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        for(int key : map.keySet()){
            if(map.get(key) > arr.length/3){
                System.out.print(key+" ");
            }
        }
    }
}
