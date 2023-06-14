package Day1_Arrays.KadanesAlgo;

public class MaximumSubarray {
    // time complexity O(N)
    // space complexity O(1)
    int sum = 0;
    int maxi = nums[0];for(
    int i = 0;i<nums.length;i++)
    {
        sum += nums[i];
        if (sum > maxi)
            maxi = sum;
        if (sum < 0)
            sum = 0;
    }return maxi;
}
