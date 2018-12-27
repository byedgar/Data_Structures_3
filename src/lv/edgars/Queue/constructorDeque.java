package lv.edgars.Queue;

public interface constructorDeque extends constructorQueue {
    void insert(int value);
    void insertLeft(int value);
    void insertRight(int value);

    int removeLeft();
    int removeRight();

    boolean isEmpty();
    boolean isFull();
    int getSize();
    int[] getData();
}
