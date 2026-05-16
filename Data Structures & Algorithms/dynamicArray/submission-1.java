class DynamicArray {
    private int[] array;
    private int capacity;
    private int length;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
        this.length = 0;
    }

    public int get(int i) {
        return this.array[i];
    }

    public void set(int i, int n) {
        this.array[i] = n;
    }

    public void pushback(int n) {
        if (this.length == this.capacity)
            this.resize();
        this.array[this.length] = n;
        this.length++;
    }

    public int popback() {
        if (length > 0) {
            this.length--;
        }
        int value = this.array[this.length];
        return value;
    }

    private void resize() {
        this.capacity *= 2;
        int[] newArr = new int[this.capacity];
        for (int i = 0; i < this.length; i++) {
            newArr[i] = this.array[i];
        }
        this.array = newArr;
    }

    public int getSize() {
        return this.length;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
