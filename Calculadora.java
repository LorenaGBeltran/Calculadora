import java.io.File;
import java.util.Scanner;
import java.util.Stack;

/**
 * 
 */

/**
 * @author loren
 *
 */
public class Calculadora implements CalculadoraIn {

	/**
	 * 
	 */
	public Calculadora() {
		// TODO Auto-generated constructor stub
	}
	/** aseguramos que se identifican los varios tipos de operadores en la calculadora*/
	
	public boolean operador(String o) {
		if(o.equals("+") || o.equals("-") || o.equals("*") || o.equals("/")) {
			return true;	
		}else {
			return false;
		}
	}
	
	/** Definimos las 4 funciones binarias que podemos trabajar en la calculadora*/
	private double suma(VECTOR stack) {
		double sumando1 = Double.parseDouble(stack.pop().toString());//esto para relacionarlo con los elementos de la pila
		double sumando2 = Double.parseDouble(stack.pop().toString());
		double resultado = sumando1+sumando2;
		return resultado;
	}
	
	private double resta(VECTOR stack) {
		double operando1 = Double.parseDouble(stack.pop().toString());//esto para relacionarlo con los elementos de la pila
		double operando2 = Double.parseDouble(stack.pop().toString());
		double resultado = operando1 - operando2;
		return resultado;
	}
	
	private double multiplicar(VECTOR stack) {
		double operando1 = Double.parseDouble(stack.pop().toString());//esto para relacionarlo con los elementos de la pila
		double operando2 = Double.parseDouble(stack.pop().toString());
		double resultado = operando1*operando2;
		return resultado;
	}
	
	private double dividir(VECTOR stack) {
		double operando1 = Double.parseDouble(stack.pop().toString());//esto para relacionarlo con los elementos de la pila
		double operando2 = Double.parseDouble(stack.pop().toString());
		double resultado = operando1/operando2;
		return resultado;
	}
	
	@Override
	public Double Resolver(String input) throws ArithmeticException{
	        // Convertimos los numeros enteros a flotantes
	        VECTOR stack = new VECTOR<>();
	        File operaciones= new File("dato.txt");
	    	Scanner sc = new Scanner(operaciones);
	    	String input = sc.next();
	    	while(sc.hasNext()){
	    	for(int i = 0; i < input.length(); i++){
	    	    char elemento = input.charAt(i);
	    	    int operando1 = 0;
	    	    int operando2 = 0;
	    	    int respuesta = 0;
	    	    if(Character.isDigit(elemento)){
	    	       int digito = Character.getNumericValue(elemento);
	    	        stack.push(digito);
	    	    }
	    	    else if(elemento == '+'){
	    	        operando1 = stack.pop();
	    	        operando2 = stack.pop();
	    	        respuesta = operando1+operando2;
	    	        stack.push(respuesta);
	    	    }
	    	     else if(elemento == '-'){
	    	        operando1 = stack.pop();
	    	        operando2 = stack.pop();
	    	        respuesta = operando1-operando2;
	    	        stack.push(respuesta);
	    	    }
	    	     else if(elemento == '*'){
	    	        operando1 = stack.pop();
	    	        operando2 = stack.pop();
	    	        respuesta = operando1*operando2;
	    	        stack.push(respuesta);
	    	    }
	    	     else if(elemento == '/'){
	    	        operando1 = stack.pop();
	    	        operando2 = stack.pop();
	    	        respuesta = operando1/operando2;
	    	        stack.push(respuesta);
	    	    }
	    	}
	    	 }
	    	 int a = stack.pop();
	    	System.out.println(a);
	    	 }
	    	 } 

	    }


}
