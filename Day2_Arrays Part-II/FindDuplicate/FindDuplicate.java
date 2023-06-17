//Time complexity is O(N)
//Space complexity is O(1)

package Day2_Arrays Part-II.FindDuplicate;

public class FindDuplicate {
     public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];   
        } while(slow != fast);  

        fast = nums[0]; 
        while(slow != fast) {
            slow = nums[slow]; 
            fast = nums[fast];  
        }
        return slow;
       
     }
}
