package westview.ds;

import java.util.ArrayList;

public class Stack<T> {
	
	// Implement storing the data using a 1D array
	private ArrayList<T> data;
	
	// Add a constructor
	public Stack() {
		// Instantiate the data list
		data = new ArrayList<T>();
	}
	
	// Add a getter called pop
	//that will remove from the top of the Stack
	public T pop() {
		// Return the top of the Stack (remove the element)
		if(data.size() == 0) {
			return null;
		}
		return data.remove(data.size()-1);
	}
	
	// Preview what is at the top of the Stack
	public T peek() {
		if(data.size() == 0) {
			return null;
		}
		return data.get(data.size()-1);
	}
	
	// Returns # of els in the Stack
	public int size() {
		return data.size();
	}
	
	// Add a setter called push
	//that will push to the top of the Stack
	public void push(T element) {
		// Add the element to the top of the Stack
		data.add(element);
	}
	
	
}
