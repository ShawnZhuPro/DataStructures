package westview.ds;

public class Queue2<T> {
	// Use Stack(s) - you must use 2 Stacks to implement
	//the behavior of a Queue using only Stacks
	private Stack<T> a;
	private Stack<T> b;
	
	public Queue2() {
		a = new Stack<T>();
		b = new Stack<T>();
	}
	
	public int size() {
		return a.size() + b.size();
	}
	
	public T peek() {
		if(a.size() == 0) {
			return null;
		}
		for(int i = a.size()-1; i >= 0; i++) {
			b.push(a.pop());
		}
		return b.peek();
	}
	
	public void enqueue(T element) {
		while(!(a.size() == 0)) {
			b.push(a.pop());
		}
		
		a.push(element);
		
		while(!(b.size() == 0)) {
			a.push(b.pop());
		}
	}
	
	public T dequeue() {
		if(a.size() == 0) {
			return null;
		}
		return a.pop();
	}
	
	
}
