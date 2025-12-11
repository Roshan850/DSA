public class MaximumSubArrays {
    public int codeByKadAlgo(int[] nums){
        // Kadane's Algorithm | Maximum Subarray Sum

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i =0;i< nums.length;i++){
            currSum += nums[i];
            maxSum = Math.max(maxSum,currSum);
            if(currSum < 0){
                currSum = 0;
            }
        }
        return maxSum;
    }
}
