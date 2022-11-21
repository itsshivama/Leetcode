class Solution {
    static int[][] ops = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    public int nearestExit(char[][] maze, int[] entrance) {
        int m = maze.length, n = maze[0].length, step = 0;
        Queue<int[]> q = new LinkedList();
        q.add(entrance);
        maze[entrance[0]][entrance[1]] = '+';
        while (!q.isEmpty()) {
            step++;
            int size = q.size();
            while (0 < size--) {
                int[] src = q.poll();
                int x = src[0], y = src[1];
                for (int[] op : ops) {
                    int i = x + op[0], j = y + op[1];
                    if (0 <= i && i < m && 0 <= j && j < n && '+' != maze[i][j]) {
                        if (0 == i || m == i + 1 || 0 == j || n == j + 1) return step;
                        maze[i][j] = '+';
                        q.add(new int[]{i, j});
                    }
                }
            }
        }
        return -1;
    }
}