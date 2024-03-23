class CustomStack {
    
    int[] stack ;
    int pointer;
    int size;

    public CustomStack(int maxSize) {
        stack = new int[maxSize];
        size = maxSize;
        pointer = 0;
    }
    
    public void push(int x) {
        if(pointer < size)
        {
            stack[pointer] = x; 
            pointer++;
        }
            
    }
    
    public int pop() {
        
        if(pointer == 0)
            return -1;
        
        pointer--;
        int removedItem = stack[pointer];
        return removedItem;
        
    }
    
    public void increment(int k, int val) {
        
        if(stack.length == 0) 
            return;
        for(int i = 0 ; i<k && i<stack.length ; i++)
            stack[i] = stack[i] + val;
        
        
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */