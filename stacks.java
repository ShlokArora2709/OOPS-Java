import java.util.*;


// extends to vector class
public class stacks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(10);
        stack.push(15);
        stack.push(20);
        stack.push(5);

        System.out.println("The element at the top of the"+ " stack is: " + stack.peek());

        System.out.println("Popped element: "+ stack.pop());

        System.out.println(stack);
    }
}
