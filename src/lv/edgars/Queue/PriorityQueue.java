package lv.edgars.Queue;

public class PriorityQueue extends classQueue {

    public PriorityQueue(int maxSize) {
        super(maxSize);
    }

    @Override
    public void insert(int value) {
        if (isEmpty()) {
            data[size++] = value;
            return;
        }
//[2] << 1
        int index;
        for (index = size - 1; index >= 0; index--) {
            if (value > data[index]) {
                data[index + 1] = data[index];
            }
            else {
                break;
            }
        }

        data[index + 1] = value;
        size++;
    }

    @Override
    public int remove() {
        return data[--size];
    }

    @Override
    public int peek() {
        return data[size - 1];
    }
}
