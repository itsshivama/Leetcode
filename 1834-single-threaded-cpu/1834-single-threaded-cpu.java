class Solution {
    public int[] getOrder(int[][] tasks) {
        for (int i = 0; i < tasks.length; i++) {
            tasks[i] = new int[] { tasks[i][0], tasks[i][1], i };
        }

        Arrays.sort(tasks, (first, second) -> first[0] - second[0]);

        PriorityQueue<int[]> taskQueue = new PriorityQueue<>(
            (first, second) -> first[1] == second[1] ? 
                first[2] - second[2] : first[1] - second[1]
        );

        int time = tasks[0][0];
        int taskIdx = 0;
        // while (taskIdx < tasks.length && tasks[taskIdx][0] == time) {
        //     taskQueue.add(tasks[taskIdx++]);
        // }

        int[] order = new int[tasks.length];
        int orderIdx = 0;

        while (!taskQueue.isEmpty() || taskIdx < tasks.length) {
            if (taskQueue.isEmpty()) {
                time = tasks[taskIdx][0];
                while (taskIdx < tasks.length && tasks[taskIdx][0] == time) {
                    taskQueue.add(tasks[taskIdx++]);
                }
            }
            int[] currentTask = taskQueue.remove();
            int processingTime = currentTask[1];
            int idx = currentTask[2];
            time += processingTime;
            order[orderIdx++] = idx;

            while (taskIdx < tasks.length && tasks[taskIdx][0] <= time) {
                taskQueue.add(tasks[taskIdx++]);
            }
        }

        return order;
    }
}