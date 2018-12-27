package lv.edgars.Queue;

public class QueueTest {

    public static void main(String[] args) {
        constructorQueue queue = new PriorityQueue(5);
        insert(queue, 22);
        insert(queue, 15);
        insert(queue, 214);
        insert(queue, 425);
        insert(queue, 3523);
        insert(queue, 33);
        insert(queue, 4324);
        insert(queue, 352);
        insert(queue, 3);

        System.out.println("Size: " + queue.getSize());
        System.out.println("Peek: " + queue.peek());

        System.out.println("Remove top: " + remove(queue));
        System.out.println("Size: " + queue.getSize());
        System.out.println("Peek: " + queue.peek());

        System.out.println("Remove top: " + remove(queue));
        System.out.println("Size: " + queue.getSize());
        System.out.println("Peek: " + queue.peek());

        while ( !queue.isEmpty() ) {
            System.out.println(remove(queue));
        }
    }

    private static int remove(constructorQueue queue) {
        return !queue.isEmpty() ? queue.remove() : -1;
    }

    private static void insert(constructorQueue queue, int val) {
        if ( !queue.isFull() ) {
            queue.insert(val);
        }
    }
}
