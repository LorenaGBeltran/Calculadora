/**
 * 
 */

/**
 * @author loren
 * Se utlizó esta interface por convención con la clase 
 */
public interface StackIn<T> {
		public void push(T item);
	   // pre: 
	   // post: item is added to stack
	   // will be popped next if no intervening push
	   
	   public T pop();
	   // pre: stack is not empty
	   // post: most recently pushed item is removed and returned
	   
	   public T peek();
	   // pre: stack is not empty
	   // post: top value (next to be popped) is returned
	   
	   public boolean empty();
	   // post: returns true if and only if the stack is empty
	   
	   public int size();
	   // post: returns the number of elements in the stack

	}