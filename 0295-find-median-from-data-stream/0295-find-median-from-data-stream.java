class MedianFinder {

    private final PriorityQueue<Integer> leftQ;
    private final PriorityQueue<Integer> rightQ;

    public MedianFinder() {
        leftQ = new PriorityQueue<>((o1, o2) -> o2 -o1);
        rightQ = new PriorityQueue<>();

    }

    public void addNum(int num) {
        Integer leftUpperBound = leftQ.peek();
        Integer rightLowBound = rightQ.peek();

        if( rightLowBound == null || num < rightLowBound ) {
            leftQ.offer(num);
        } else {
            rightQ.offer(num);
        }

//        balance two heaps

        if(leftQ.size() -rightQ.size() > 1) {
            Integer leftLargest = leftQ.poll();
            rightQ.offer(leftLargest);
        } else if(rightQ.size() -leftQ.size() > 1) {
            Integer rightSmallest = rightQ.poll();
            leftQ.offer(rightSmallest);
        }

    }

    public double findMedian() {
     if(leftQ.size() -rightQ.size() == 1) {
            return leftQ.peek();
        } else if(rightQ.size() -leftQ.size() ==1) {
            return rightQ.peek();
        }
        double v = (leftQ.peek() + rightQ.peek());
        return   v /2;

    }
}