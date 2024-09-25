import java.util.ArrayList;

public class MyStack<T> implements StackInterface<T> {

    ArrayList<T> stack = new ArrayList<T>();

    @Override
    public void push(T text) {
         stack.add(text);
    }

    @Override
    public T peek() {
        return stack.getLast();
    }

    @Override
    public T get(int spot) {
        return stack.get(spot);
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public int size() {
        return stack.size();
    }

    @Override
    public T pop() {
        return stack.removeLast();
    }

    @Override
    public void clear() {
        stack.clear();
    }

    @Override
    public String toString() {
        return stack.toString();
    }
}