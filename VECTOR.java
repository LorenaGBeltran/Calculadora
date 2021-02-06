/**
 * Implementaci�n de la clase vector para stack
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
	

	/** Este m�todo agrega un elemento a la pila */
	public void push(T item) {
		// TODO Auto-generated method stub
		vector.push(item);
	}

	/** Este m�todo elimina el elemento a la pila */
	public T pop() {
		// TODO Auto-generated method stub
		return vector.pop();
	}

	/** Este m�todo devuelve el �ltimo elemento de la pila*/
	public T peek() {
		
		return vector.peek();
	}

	/** Este m�todo determina si la pila est� vac�a*/
	public boolean empty() {
	
		return vector.empty();
	}

	/** Este m�todo devuelve el largo de la pila*/
	public int size() {
		
		return vector.size();
	}

	
	
}
