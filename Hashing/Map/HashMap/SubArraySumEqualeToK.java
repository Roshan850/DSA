import java.util.HashMap;

public class SubArraySumEqualeToK {
    public void subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int ans = 0;

        map.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (map.containsKey(sum - k)) {
                ans += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3};
         SubArraySumEqualeToK s = new SubArraySumEqualeToK();

         s.subarraySum(arr,3);
    }
}
