package working_with_generic_types;
import java.util.Stack;

public class StrictStack<T>{
    private Stack<T> _storage = new Stack<T>();

    public void push(T t) { // put onto stack
        _storage.push(t);
    }
    public T top() { // return top of stack
        return _storage.peek();
    }
    public void pop() { // pop and discard top of stack
        _storage.pop();
    }
    public int size() { // number of elements in stack
        return _storage.size();
    }

}
