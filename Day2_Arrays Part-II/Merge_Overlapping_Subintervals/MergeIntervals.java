package Day2_Arrays Part-II.Merge_Overlapping_Subintervals;

public class MergeIntervals {
    //Time Complexity = O(n log n)
    //space complexity = O(n)
    public int[][] merge(int[][] intervals) {
        //sort interval by start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();
        int[] currInterval = intervals[0];

        for(int i = 1; i < intervals.length; i++) {
            int[] nextInterval = intervals[i];

            if(nextInterval[0] <= currInterval[1]) {
                //Intervals overlap, merge them
                currInterval[1] = Math.max(currInterval[1], nextInterval[1]);
            } else {
                //Intervals do not overlap, add current interval to merged list
                merged.add(currInterval);
                currInterval = nextInterval;
            }
        }
        //Add the last interval to the merged list
        merged.add(currInterval);

        //Convert the list to a 2D array and return
        return merged.toArray(new int[merged.size()][]);
    }
}
