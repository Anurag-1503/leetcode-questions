class StockSpanner {
    
    class Pair {
        int price;
        int span;
        
        Pair(Integer price , Integer span){
            this.price = price;
            this.span = span;
        }
    }
    
    Stack<Pair> st; // pair will be of {price , span}

    public StockSpanner() {
        st = new Stack<>();
        
    }
    
    public int next(int price) {
        int span = 1;
        
        while(!st.isEmpty() && st.peek().price <= price){
            span += st.peek().span;
            st.pop();
        }
            
        st.push(new Pair(price , span));
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */