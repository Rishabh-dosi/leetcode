import java.util.Collections;
import java.util.Stack;

public class MinStack {
    private static Stack<Integer> s;
    private static Stack<Integer> minStack;
    public MinStack() {
        s = new Stack<Integer>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
            
        }
        s.push(val);
    }
    
    public void pop() {
        int popped = s.pop();
        if (popped == minStack.peek()) {
            minStack.pop();
        }
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack s = new MinStack();
        s.push(12);
        s.push(1);
        s.pop();
        s.pop();
        s.push(3);
        System.out.println(s.getMin());
    }
}
