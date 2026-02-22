import java.util.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Leetcode {
    public int smallestAbsent(int[] nums) {
        int n = nums.length;
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        float avg = (float) sum / n;

        // Store numbers in a HashSet for quick lookup
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        // Start searching from floor(avg) + 1
        int candidate = (int) Math.floor(avg) + 1;

        while (true) {
            if (!set.contains(candidate)) {
                return candidate;
            }
            candidate++;
        }
    }

    public static void main(String[] args) {
        Leetcode l = new Leetcode();
        int nums[] = {4, -1};
        System.out.println(l.smallestAbsent(nums));
    }
}


