class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // int[] warmer = new int[temperatures.length];
        // stack to hold index of decreasing temperatures
        // loop over temperatures
            // while stack !empty and stack top is < temp[i]
                // idx = pop from stack
                // warmer[idx] = i - idx
        

        // repeat the while loop block after if stack isnt empty
        // O(N) = T and S

        int[] warmer = new int[temperatures.length];
        int hottest = 0;

        for(int i = temperatures.length - 1; i >= 0; i--) {
            if(temperatures[i] >= hottest) {
                warmer[i] = 0;
                hottest = temperatures[i];
            } else {
                // check neighbour
                int days = 1;
                while(temperatures[i + days] <= temperatures[i]) {
                    days += warmer[i + days];
                }
                warmer[i] = days;
            }
        }

        return warmer;
    }
}