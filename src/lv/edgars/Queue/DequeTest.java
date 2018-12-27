package lv.edgars.Queue;

public class DequeTest {
    public static void main(String[] args) {
        classDeque deque = new classDeque(10);

        deque.insertRight(1);
        deque.insertRight(2);
        deque.insertRight(3);
        deque.insertLeft(5);
        int[] test = deque.getData();
        for (int i1 : test) {
            System.out.println(i1);
        }
        //deque.insert(1);
    }
}
