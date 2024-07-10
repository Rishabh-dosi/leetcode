import java.util.Stack;

public class AsteroidCollision {
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int asteroid : asteroids) {
            boolean alive = true;
            while (alive && !stack.isEmpty() && stack.peek() > 0 && asteroid < 0) {
                int top = stack.peek();
                if (top == -asteroid) {
                    stack.pop();
                    alive = false;
                } else if (top > -asteroid) {
                    alive = false;
                } else {
                    stack.pop();
                }
            }
            if (alive) {
                stack.push(asteroid);
            }
        }
        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;
        
    }
    public static void main(String[] args) {
        int[] asteroids = { 5, 10, -5 };
        int[] result = asteroidCollision(asteroids);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}