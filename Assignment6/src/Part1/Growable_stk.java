package Part1;
import java.util.ArrayList;
import java.util.List;

public class Growable_stk implements Interface_STK {

    private List<Integer> stack;

    public Growable_stk() {
        this.stack = new ArrayList<>();
    }

    @Override
    public void push(int element) {
        stack.add(element);
    }

    public int pop() {
        if (isUnderflow()) {
            System.out.println("Stack is empty!");
            return 0;
        } else {
            int element = stack.remove(stack.size() - 1);
            return element;
        }
    }

    public void displayStack() {
        if (isUnderflow())
            System.out.println("Stack is empty!");
        else
            for (int element : stack) {
                System.out.println(element);
            }
    }

    public boolean isOverflow() { // => as it is a growable stack
        return false;
    }

    public boolean isUnderflow() {
        return stack.isEmpty();
    }
}
