import java.io.*;
import java.util.*;

package Day3_Arrays

Part-III.GridUniquePath;

public class GridUnquePath {
    // Solution 1: Recursive solution
    // public int countPaths(int i, int j, int n, int m) {
    // if (i == (n - 1) && j == (m - 1))
    // return 1;
    // if (i >= n || j >= m)
    // return 0;
    // else
    // return countPaths(i + 1, j, n, m) + countPaths(i, j + 1, n, m);
    // }

    // public int uniquePaths(int m, int n) {
    // return countPaths(0, 0, m, n);
    // }

    // public static void main(String[] args) {
    // GridUnquePath obj = new GridUnquePath();
    // int totalCount = obj.uniquePaths(3, 7);
    // System.out.println("The total number of Unique Paths are " + totalCount);
    // }

    // Solution 2: Dynamic Programming Solution
    public int countPaths(int i, int j, int n, int m, int[][] dp) {
        if (i == (n - 1) && j == (m - 1))
            return 1;
        if (i >= n || j >= m)
            return 0;
        if (dp[i][j] != -1)
            return dp[i][j];
        else
            return dp[i][j] = countPaths(i + 1, j, n, m, dp) + countPaths(i, j + 1, n, m, dp);
    }

    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        for (int[] row : dp)
            Arrays.fill(row, -1);

        int num = countPaths(0, 0, m, n, dp);
        if (m == 1 && n == 1)
            return num;
        return dp[0][0];
    }

    public static void main(String[] args) {
        GridUnquePath obj = new GridUnquePath();
        int totalCount = obj.uniquePaths(3, 7);
        System.out.println("The total number of Unique Paths are " + totalCount);
    }
}
