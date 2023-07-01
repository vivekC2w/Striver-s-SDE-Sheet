class Solution {
    int[] DIR = new int[] { 0, 1, 0, -1, 0 };

    public int latestDayToCross(int row, int col, int[][] cells) {
        int left = 1, right = cells.length, days = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            // if it returns true which means on the day we can traverse from top to the
            // bottom row do the output can possibly that value or more than that value
            if (canWalk(cells, row, col, mid)) {
                days = mid;
                left = mid + 1;
            } else
                right = mid - 1;
        }
        return days;
    }

    // Helper method to perform our BFS
    boolean canWalk(int[][] cells, int row, int col, int dayAt) {
        // datAt = mid value that we are going to calculate, particular day check
        // weather we can reach from top roe
        // to bottom row
        int[][] grid = new int[row][col];
        // this grid is going to help us to understand in which path we are travelling
        // and which cells we have already visited
        // Iterating the number of days and fill our grid with values if day 5 then we
        // are going to fill our grid only with first five cells which are given in the
        // input to 1
        // -1 bcz the given cells are 1 indexed but the grid we are using is 0 indexed
        for (int i = 0; i < dayAt; ++i)
            grid[cells[i][0] - 1][cells[i][1] - 1] = 1;
        // Queue
        Queue<int[]> bfs = new ArrayDeque<>();
        // start from very 1st row
        for (int c = 0; c < col; ++c) {
            if (grid[0][c] == 0) {
                // updating queue with that cordinate and update cells value in our grid array
                // to 1 bcz we have visited that cell
                bfs.offer(new int[] { 0, c });
                grid[0][c] = 1;
            }
        }
        // start iterating cordinates from our queue till all our co-orinates gets empty
        while (!bfs.isEmpty()) {
            int[] curr = bfs.poll();
            // pick the curr cordinate and add it with all other directions
            int r = curr[0], c = curr[1];
            // if new row or col is the last row then we have reached the last row
            if (r == row - 1)
                return true;
            // iterating all 4 directions and find new neighbouring coordinates x and y
            // which is nothing but the neighboring cordinates at all 4 directions
            for (int i = 0; i < 4; i++) {
                int x = r + DIR[i], y = c + DIR[i + 1];
                // each cell we are checking weather it is out of index or they are at the same
                // row same col or if the cell already visited then we are going to skip that
                // iterations
                if (x < 0 || x == row || y < 0 || y == col || grid[x][y] == 1)
                    continue;
                // if not then we are going to update that path to one bcz we have visited it
                // and update it to our queue
                grid[x][y] = 1;
                bfs.offer(new int[] { x, y });
            }
        }
        return false;
    }
}