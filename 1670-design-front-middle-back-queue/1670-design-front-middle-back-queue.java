class FrontMiddleBackQueue {
    
    LinkedList<Integer> q;

    public FrontMiddleBackQueue() {
        q = new LinkedList<>();
    }
    
    public void pushFront(int val) {
        q.add(0,val);
    }
    
    public void pushMiddle(int val) {
        q.add(q.size()/2 , val);
    }
    
    public void pushBack(int val) {
        q.add(val);
    }
    
    public int popFront() {
        return q.isEmpty() ? -1 : q.remove(0);
    }
    
    public int popMiddle() {
        return q.isEmpty() ? -1 : q.remove((q.size() - 1) / 2);
    }
    
    public int popBack() {
        return q.isEmpty() ? -1 : q.remove(q.size() - 1);
    }
}

/**
 * Your FrontMiddleBackQueue object will be instantiated and called as such:
 * FrontMiddleBackQueue obj = new FrontMiddleBackQueue();
 * obj.pushFront(val);
 * obj.pushMiddle(val);
 * obj.pushBack(val);
 * int param_4 = obj.popFront();
 * int param_5 = obj.popMiddle();
 * int param_6 = obj.popBack();
 */