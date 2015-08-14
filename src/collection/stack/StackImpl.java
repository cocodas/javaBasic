package collection.stack;

import java.util.Iterator;
import java.util.Stack;

public class StackImpl<E> {
	
	private Stack<E> stack;
	 
    public StackImpl()
    {
        stack = new Stack<E>();
    }
 
    public boolean empty()
    {
        return stack.empty();
    }
 
    public E peek()
    {
        return stack.peek();
    }
 
    public E pop()
    {
        return stack.pop();
    }
 
    public E push(E item)
    {
        return stack.push(item);
    }
 
    public int search(Object o)
    {
        return stack.search(o);
    }
    
    public Iterator<E> iterator() {
		return stack.iterator();
	}
    

}
