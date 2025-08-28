class DynamicArray {

    private int[] arr;
    private int capacity;
    private int size;

    public DynamicArray(int capacity) {
        this.capacity=capacity;
        this.size=0;
        this.arr=new int[this.capacity];
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i]=n;

    }

    public void pushback(int n) {
        // 1. CHECK: First, check if the current number of elements (size)
        // has reached the array's limit (capacity).
        if (size == capacity) {
            // 2. RESIZE: If it's full, call resize.
            resize();
        }
        
        // 3. ADD: NOW it's safe to add the new element at the 'size' index.
        // For example, if size=1 and capacity was just resized to 2, we add at arr[1].
        arr[size] = n;
        
        // 4. INCREMENT: Finally, increment the size.
        size++;
    }

    public int popback() {
        size--;
        return arr[size];
    }

    private void resize() {
        capacity*=2;
        int[] newArr=new int[capacity];

        for (int i=0;i<size;i++){
            newArr[i]=arr[i];
        }
    }

    public int getSize() {
        return size;
    }

    
    public int getCapacity() {
        return capacity;
    }
}
