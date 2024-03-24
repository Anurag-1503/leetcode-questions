class MyCircularQueue {
    
   int[] array;
    int n;
    int front = -1;
    int rear = -1;
    
    
    public MyCircularQueue(int k) {
        this.n = k;
        array = new int[k];
    }
    
    public boolean enQueue(int value) {
        // Check if the queue is full
        if ((rear + 1) % n == front)
            return false;
        
        // If the queue is empty, set front to 0
        if (front == -1)
            front = 0;
        
        // Move rear pointer circularly and insert value
        rear = (rear + 1) % n;
        array[rear] = value;
        return true;
    }
    
    public boolean deQueue() {
        // Check if the queue is empty
        if (front == -1)
            return false;
        
        // If the queue has only one element, reset front and rear to -1
        if (front == rear)
            front = rear = -1;
        else
            // Move front pointer circularly
            front = (front + 1) % n;
        
        return true;
    }
    
    public int Front() {
        
        if(isEmpty())
            return -1;
        return array[front];
        
    }
    
    public int Rear() {
        
       if (isEmpty())
            return -1;
        return array[rear];
        
    }
    
    public boolean isEmpty() {
        
        return front == -1;
           
    }
    
    public boolean isFull() {
        
        return ((rear+1)%n == front);
        
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */