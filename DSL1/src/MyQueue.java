import java.util.ArrayList;
public class MyQueue<T> implements QueueInterface<T> {
    ArrayList<T> queue = new ArrayList<T>();

    @Override
    public void offer(T text) {
        queue.add(text);
    }

    @Override
    public T element() {
        return queue.getFirst();
    }

    @Override
    public T get(int spot) {
        return queue.get(spot);
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public T poll() {
        return queue.removeFirst();
    }

    @Override
    public void clear() {
        queue.clear();
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
