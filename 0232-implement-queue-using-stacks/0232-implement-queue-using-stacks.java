class MyQueue {

    static int in;
    static int l;
    static List< Integer > st;
    public MyQueue() {
        in=0;
        l=0;
        st= new ArrayList<>();
    }
    
    public void push(int x) {
        st.add(x);
        l++;
    }
    
    public int pop() {
        l--;
        return st.get(in++);
    }
    
    public int peek() {
        return st.get(in);
    }
    
    public boolean empty() {
        return l==0;
    }
}