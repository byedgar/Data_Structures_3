package lv.edgars.Stack;

public interface interfaceStack {
    //Adding value
    void push(char value);

    //getting last value
    char pop();

    //show last max value
    char peek();

    //Check if stack empty
    boolean isEmpty();

    //Check if stack is full
    boolean isFull();

    //Getting size of stack
    int getSize();
}
