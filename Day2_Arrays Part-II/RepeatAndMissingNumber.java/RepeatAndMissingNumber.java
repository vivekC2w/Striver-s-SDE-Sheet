package Day2_Arrays

Part-II.RepeatAndMissingNumber.java;

public class RepeatAndMissingNumber {
    public static int[] findMissingRepeatingNumbers(int[] a) {
        int n = a.length;
        int[] hash = new int[n+1];

        for(int i = 0; i < n; i++) {
            hash[a[i]]++;
        }

        int repeating = -1, missing = -1;
        for(int i = 0; i <= n; i++) {
            if(hash[i] == 2) repeating = i;
            else if(hash[i] == 0) missing = i;

            if(repeating != -1 && missing != -1) {
                break;
            }
        }
        int[] ans = new int[repeating, missing];
        return ans;
}
