package practice;

import java.util.Scanner;

public class DemoStack {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack stack = new Stack();
        System.out.print("Enter the number of items in the stack: ");
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.printf("Enter an element %d: ", i);
            stack.push(scanner.nextInt());
        }

        System.out.println("Size of the stack is " + stack.getCount());
        stack.displayStack();

        while ( !stack.isEmpty() ) {
            System.out.println("Pop an element " + stack.pop());
            System.out.println(stack.getCount() + " items left on the stack");
        }
    }
}
