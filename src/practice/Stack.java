package practice;

public class Stack {
    private int[] elem;
    private int top;

    public Stack() {
        elem = new int[10];
        top = -1;
    }

    public void push(int value) {
        if (top < (elem.length -1)) {
            top++;
            elem[top] = value;
        } else {
            System.out.printf("The stack is full, the number of elements is: %d !\n", elem.length);
        }
    }

    public int pop() {
        if (top >= 0 ) {
            int data = elem[top];
            elem[top] = 0;
            top--;
            return data;
        } else {
            System.out.printf("The stack is empty.\n");
            return 0;
        }
    }

    public boolean isEmpty() {
        return top < 0 ? true : false;
    }

    int getCount() {
        return top + 1;
    }

    public void displayStack() {
        for (int i = top; i >= 0; i--) {
            System.out.println(elem[i]);
        }
    }
}

