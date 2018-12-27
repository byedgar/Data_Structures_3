package lv.edgars.Queue;

public class classDeque extends classQueue implements constructorDeque {

    protected int[] data;
    protected int size;
    protected int maxSize;
    protected int left;
    protected int right;

    public classDeque(int maxSize) {
        this.data = new int[maxSize];
        this.maxSize= maxSize;
        this.size = 0;
        this.left = 0;
        this.right = maxSize - 1;
    }


    @Override
    public void insertLeft(int value) {
        if (isFull())
            throw new RuntimeException("ARRAY is full!!!");
        if (left == 0) left = maxSize;
        data[--left] = value;
        size++;
    }

    @Override
    public void insertRight(int value) {
        if (isFull())
            throw new RuntimeException("ARRAY is full!!!");
        if (right == maxSize - 1)
            right = -1;
        data[++right] = value;
        size++;
    }

    @Override
    public int removeLeft() {

        if (isEmpty())
            throw new RuntimeException("ARRAY is empty!!!");
        int temp = data[left];
        left++;
        if (left == maxSize - 1) left = -1;
        size--;
        return temp;
    }

    @Override
    public int removeRight() {

        if (isEmpty()) throw new RuntimeException("ARRAY is empty!!!");
        int temp = data[right];
        right--;
        if (right < 0) right = maxSize - 1;
        size--;
        return temp;
    }


    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == maxSize;
    }

    @Override
    public int[] getData() {
        return data;
    }
}
