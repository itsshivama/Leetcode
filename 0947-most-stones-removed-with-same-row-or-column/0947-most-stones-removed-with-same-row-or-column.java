/*

class Solution {
    public int removeStones(int[][] stones) {
        int n = stones.length;
        if (n <= 1) {
            return 0;
        }

        List<Integer>[] graph = new List[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < n; i++) {
            int[] u = stones[i];
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }

                int[] v = stones[j];
                if (u[0] == v[0] || u[1] == v[1]) {
                    graph[i].add(j);
                }
            }
        }

        boolean[] visited = new boolean[n];
        int ans = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }

            dfs(graph, visited, i);
            ans++;
        }

        return n - ans;
    }

    private static void dfs(List<Integer>[] graph, boolean[] visited, int start) {

        visited[start] = true;

        List<Integer> neighbors = graph[start];
        for (int x : neighbors) {
            if (visited[x]) {
                continue;
            }

            dfs(graph, visited, x);
        }
    }
}
*/










//Union Find


class Solution {
    public int removeStones(int[][] stones) {
        if (stones == null || stones.length <= 1) {
            return 0;
        }

        int n = stones.length;

        UnionFind uf = new UnionFind();
        for (int[] edge : stones) {
            uf.union(edge[0] + 10001, edge[1]);
        }

        return n - uf.getCount();
    }

    class UnionFind {
        Map<Integer, Integer> parents;
        int count;

        public UnionFind() {
            parents = new HashMap<>();
            count = 0;
        }

        public int getCount() {
            return count;
        }

        public int find(int x) {
            if (!parents.containsKey(x)) {
                parents.put(x, x);
                count++;
            }

            if (x != parents.get(x)) {
                parents.put(x, find(parents.get(x)));
            }

            return parents.get(x);
        }

        public void union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX == rootY) {
                return;
            }

            parents.put(rootX, rootY);
            count--;
        }
    }
}