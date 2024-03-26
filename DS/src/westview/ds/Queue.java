package westview.ds;

import java.util.ArrayList;

public class Queue<T> {

	private ArrayList<T> data;
	
	public Queue() {
		data = new ArrayList<T>();
	}
	
	public int size() {
		return data.size();
	}
	
	public T peek() {
		if(data.size() == 0) {
			return null;
		}
		return data.get(0);
	}
	
	public void enqueue(T element) {
		data.add(0, element);
	}
	
	public T dequeue() {
		if(data.size() == 0) {
			return null;
		}
		return data.remove(0);
	}

}
