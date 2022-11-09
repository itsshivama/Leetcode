class StockSpanner {

    Stack<Pair<Integer, Integer>> st = new Stack<>();
    
    public int next(int price) {
        int ans = 1;
        while(!st.isEmpty() && st.peek().getKey() <= price)
            ans += st.pop().getValue();
        st.push(new Pair(price,ans));
        return ans;
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */

/*
 My explaination
 
 [100,80,60,70,60,75,85]

p	    c	        s	    return
100	    1	        100,1	    1
                                                        x   80	    1	        80,1	    1
					                                    x	60	    1	        60,1	    1
					                                    x	70	    1/ 2	    70,2	    2
					                                    x	60	    1	        60,1	    1
75	    1/ 2/ 4	    75,3	    3
85      1 /5 /6     85,6        6
 */