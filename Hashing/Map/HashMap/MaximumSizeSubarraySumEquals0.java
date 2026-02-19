import java.util.HashMap;

class MaximumSizeSubarraySumEquals0 {
    public void codeMax(int [] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum =0;
        int len = 0;

        for(int j =0;j<arr.length;j++){
            sum += arr[j];
            if(map.containsKey(sum)){
               len = Math.max(len,j-map.get(sum));
            }
            else {
                map.put(sum,j);
            }
        }
        System.out.println("The Maximum Size Subarray Sum Equals 0 is = "+ len);
    }
}
