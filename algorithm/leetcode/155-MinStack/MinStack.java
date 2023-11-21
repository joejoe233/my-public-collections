import java.util.Stack;

class MinStack {
    Stack<Integer> mainStack = new Stack<Integer>();
    Stack<Integer> minStack = new Stack<Integer>();;

    public MinStack() {
        // Stack<Integer> mainStack = new Stack<Integer>();
        // Stack<Integer> minStack = new Stack<Integer>();
    }

    public void push(int val) {
        mainStack.push(val);
        if (minStack.empty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        if (mainStack.peek().equals(minStack.peek())) {
            minStack.pop();
        }
        mainStack.pop();
    }

    public int top() {
        return mainStack.peek();
    }

    public int getMin() {
        return minStack.peek();

    }

    public static void main(String[] args) {
        // Stack Class basic operation
        // Stack<Integer> stack = new Stack<Integer>();
        // stack.push(1);
        // stack.push(2);
        // stack.push(3);
        // System.out.println(stack.pop().getClass());
        // System.out.println(stack.pop());
        // System.out.println(stack);
        // System.out.println(stack.peek());

        MinStack stack = new MinStack();
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println(stack.top());
        System.out.println(stack.getMin());
        stack.pop();
        System.out.println(stack.top());
        System.out.println(stack.getMin());

    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */