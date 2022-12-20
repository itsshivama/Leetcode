class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> list) {
        int n = list.size();
        boolean [] vis = new boolean[n];
        vis[0] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        int a;
        int tot = n-1;
        while (!q.isEmpty()){
            a = q.remove();
            for (int i = 0; i < list.get(a).size(); i++) {
                if(!vis[list.get(a).get(i)]) {
                    vis[list.get(a).get(i)] = true;
                    q.add(list.get(a).get(i));
                    tot--;
                }
            }
        }
        return tot == 0;
    }
}