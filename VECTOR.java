/**
 * Implementación de la clase vector para stack
 */

/**
 * @author loren
 *
 */
 

public class VECTOR<T> implements StackIn<T> {
	private VECTOR<T> vector;
	
	/** creamos el generador por default */
	VECTOR(){
		vector = new VECTOR<T>();
	}
	

	/** Este método agrega un elemento a la pila */
	public void push(T item) {
		// TODO Auto-generated method stub
		vector.push(item);
	}

	/** Este método elimina el elemento a la pila */
	public T pop() {
		// TODO Auto-generated method stub
		return vector.pop();
	}

	/** Este método devuelve el último elemento de la pila*/
	public T peek() {
		
		return vector.peek();
	}

	/** Este método determina si la pila está vacía*/
	public boolean empty() {
	
		return vector.empty();
	}

	/** Este método devuelve el largo de la pila*/
	public int size() {
		
		return vector.size();
	}

	
	
}
