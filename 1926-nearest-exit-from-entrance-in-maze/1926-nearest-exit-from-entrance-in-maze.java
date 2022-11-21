class Solution {
    
    private int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    
    public int nearestExit(char[][] maze, int[] entrance) {
        int m = maze.length, n = maze[0].length;
        Deque<int[]> q = new ArrayDeque<>();
        boolean[][] visited = new boolean[m][n];
        q.offer(entrance);
        visited[entrance[0]][entrance[1]] = true;
        int steps = 0;
        while(!q.isEmpty()) {
            int size = q.size();
            for(int i = 0; i < size; i++) {
                int[] cur = q.poll();
                int x = cur[0], y = cur[1];
                if((x != entrance[0] || y != entrance[1]) && (x == 0 || x == m - 1 || y == 0 || y == n - 1)) {
                    return steps;
                }
                for(int[] dir: dirs) {
                    int newX = x + dir[0], newY = y + dir[1];
                    if(newX < 0 || newX >= m || newY < 0 || newY >= n || maze[newX][newY] != '.' || visited[newX][newY]) {
                        continue;
                    }
                    q.offer(new int[] {newX, newY});
                    visited[newX][newY] = true;
                }
            }
            steps++;
        }
        return -1;
    }
}