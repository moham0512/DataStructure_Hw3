
public class Stack {

    public int len;
    public int top;
    public Object[] stack;

    public Stack(int l) {
        top = -1;
        len = l;
        stack = new Object[len];
    }

    public void push(Object p) {
        if (top == len - 1) {
            System.out.println("Stack Full");
        } else {
            stack[++top] = p;
        }
    }

    public Object pop() {
        Object topItem = stack[top];
        stack[top] = null;
        if (top == -1) {
            return ("Stack Empty");

        }
        top--;
        return topItem;
    }

}
