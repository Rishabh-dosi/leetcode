import java.util.Stack;

public class MyQueue {
    private Stack<Integer> primary;
    private Stack<Integer> secondary;

    public MyQueue() {
        primary = new Stack<>();
        secondary = new Stack<>();
    }

    public void push(int x) {
        primary.push(x);
    }

    public int pop() {
        int popedvalue = 0;
        while (!primary.empty()) {
           secondary.push(primary.pop()) ;
        }
        popedvalue = secondary.pop();
        while (!secondary.empty()) {
            primary.push(secondary.pop());
        }
        return popedvalue;
    }

    public int peek() {
        int popedvalue = 0;
        while (!primary.empty()) {
            secondary.push(primary.pop());
        }
        popedvalue = secondary.pop();
        primary.push(popedvalue);
        while (!secondary.empty()) {
            primary.push(secondary.pop());
        }
        return popedvalue;
        
    }

    public boolean empty() {
        if (primary.size() == 0)
            return true;
        else 
            return false;
    }
}
