class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        
        if (dislikes.length == 0) {
            return true;
        }

        int[] label = new int[n + 1];
        label[dislikes[0][0]] = 1;
        label[dislikes[0][1]] = -1;
        boolean[] isChecks = new boolean[dislikes.length];
        isChecks[0] = true;

        while (true) {
            boolean isUpdated = false;

            for (int i = 1; i < dislikes.length; i++) {

                if (isChecks[i]) {
                    continue;
                }

                int a = dislikes[i][0];
                int b = dislikes[i][1];

                if (label[a] != 0 || label[b] != 0) {

                    if (label[a] == label[b]) {
                        return false;

                    } else if (label[a] == -label[b]) {
                        isChecks[i] = true;

                    } else if (label[a] != 0) {
                        label[b] = -label[a];

                    } else if (label[b] != 0) {
                        label[a] = -label[b];
                    }

                    isUpdated = true;
                }
            }

            boolean isAllCheck = true;
            for (int i = 1; i < dislikes.length; i++) {
                if (!isChecks[i]) {
                    isAllCheck = false;
                    break;
                }
            }

            if (isAllCheck) {
                return true;
            }

            if (!isUpdated) {
                for (int i = 1; i < dislikes.length; i++) {

                    if (!isChecks[i]) {
                        label[dislikes[i][0]] = 1;
                        label[dislikes[i][1]] = -1;
                        break;
                    }
                }
            }
        }
    }
}
/*Time: O(∣V∣+∣E∣)
Space: O(|V|)*/

//some observations:

//we can think of this problem as graph coloring
//if node a dislikes node b then they should be of different colours

//also, we can think of dislike relationship as mutual even though it isn't
//because if a dislikes b they can't be in the same group anyway

//there isn't a straightforward way to do this other than dfs
//
        
        /*
            nodes grouped to -1 or 1

            for each node
                if ungrouped and tried to group into 1 failed return false


            dfs(graph, index, group)
                set group
                for each other node
                    if they hate each other and they were assigned the same group we failed

                    otherwise if hate each other 
                        and not assigned yet then continue dfs
        */


// DFS