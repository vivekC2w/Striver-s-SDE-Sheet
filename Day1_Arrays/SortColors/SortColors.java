package Day1_Arrays.SortColors;

public class SortColors {
    public void sortColors(int[] nums) {

        // First Approach is will sort the array so that array will become like [0, 0,
        // 0, 1, 1, 1, 2, 2, 2,..]
        // Time complexity => O(NlogN)
        // space complexity will be O(1)

        // we can optimise the code using counting sort for that just lineraly traverse
        // the array and count the number of 0's after that count no of 1's and 2's
        // and then we will place 0's to 1's and 2's in array in sorted order
        // this will take O[N] (first traversal for counting) + O[N] (second traversal
        // for putting 0, 1 and 2 in sorting manner)
        // time complexity will be O(2N)

        // Further we can optimse it by using Dutch national flag algorithm using 3
        // pointers left, right and mid

        int n = nums.length;
        int left = 0, right = n - 1, mid = 0;
        // Our first assumption will be all the elments to the left of left pointer will
        // be zero
        // Our second assumption is all the value to the right of right pointer will be
        // 2
        while (mid <= right) {
            if (nums[mid] == 0) {
                // If mid is pointing to 0 swap it with left
                int temp = nums[mid];
                nums[mid] = nums[left];
                nums[left] = temp;
                left++;
                mid++;
            } else if (nums[mid] == 2) {
                // If mid is pointing to 2 swap it with right
                int temp = nums[mid];
                nums[mid] = nums[right];
                nums[right] = temp;
                right--;
            } else {
                // if mid is 1 just move the pointer one step ahead
                // nums[i] == 1;
                mid++;
            }
        }
        // This algorithm works on time complexity O(N)
        // Space complexity of O(1)
    }
}
