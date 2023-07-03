package Day4_Arrays

Part-IV.LongestConsecutiveSequence;

public class Solution2 {

    public static int longestConsecutive(int[] nums) {
        Set<Integer> hashSet = new HashSet<Integer>();
        for(int num : nums) {
            hashSet.add(num);
        }

        int longestStreak = 0;

        for(int num : nums) {
            if(!hashSet.contains(num - 1)) {
                int currentNum = num;
                int maxStreak = 1;

                while(hashSet.contains(currentNum+1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }
                longestStreak = Math.max(currentStreak, longestStreak);
            }

        }
        return longestStreak;
    }

    public static void main(String[] args) {
        int arr[] = { 100, 200, 1, 2, 3, 4 };
        int lon = longest(arr);
        System.out.println("The longest consecutive seqence is " + lon);
    }
}
