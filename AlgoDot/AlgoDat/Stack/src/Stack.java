import java.util.ArrayList;
import java.util.List;

public class Stack implements StackList{

    private List<Integer> stack;

    public Stack() {
        this.stack = new ArrayList<>();
    }

    @Override
    public void push(int number) {
        stack.add(number);
    }

    @Override
    public int pop() {
        int value = stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
        return value;
    }

    public int peek(){
            return stack.get(stack.size()-1);
    }


}
