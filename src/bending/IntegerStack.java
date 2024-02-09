package bending;

public class IntegerStack {
    private int[] stackArray;
    private int top;
    private int capacity;

    // Constructor to initialize the stack
    public IntegerStack(int capacity) {
        this.capacity = capacity;
        stackArray = new int[capacity];
        top = -1; // Stack is initially empty
    }

    // Method to push an element onto the stack
    public void push(int element) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow: Cannot push element onto full stack.");
        } else {
            stackArray[++top] = element;
            System.out.println("Pushed element: " + element);
        }
    }

    // Method to pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow: Cannot pop element from empty stack.");
            return -1; // Return a default value indicating failure
        } else {
            int poppedElement = stackArray[top--];
            System.out.println("Popped element: " + poppedElement);
            return poppedElement;
        }
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Method to get the top element of the stack without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1; // Return a default value indicating failure
        } else {
            return stackArray[top];
        }
    }

    public static void main(String[] args) {
        IntegerStack stack = new IntegerStack(5);

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Popping elements from the stack
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop(); // Trying to pop from an empty stack
    }
}
