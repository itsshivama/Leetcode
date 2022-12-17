class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st= new Stack<>();
        for(String s : tokens){
            switch(s){
                case "+":
                st.push(st.pop()+st.pop());
                break;
                case "-":
                st.push(-st.pop()+st.pop());
                break;
                case "*":
                st.push(st.pop()*st.pop());
                break;
                case "/":
                int val2 = st.pop();
                st.push(st.pop()/val2);
                break;
                default :
                st.push(Integer.parseInt(s));
            }
        }
        return st.pop();
    }
}