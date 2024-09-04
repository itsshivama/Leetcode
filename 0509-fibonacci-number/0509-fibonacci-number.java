class Solution {
    public int fib(int n) {
        int sum = 1, slast=1;
        if (n < 2)
            return n;
        else{
            for(int i=3; i<=n; i++){
                int temp = sum;
                sum = sum+slast;
                slast = temp;
            }
        }
        return sum;
}
}