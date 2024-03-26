package westview.ds;

import java.util.LinkedList;

public class Node<T> {
	// A Node has a next node reference
	private Node next;
	
	// A Node stores data
	private T data;
	
	// Constructor that takes in the data element
	public Node(T val) {
		this.data = val;
	}
	
	// Getter for the data and next reference 
	//called getNext and getData
	public Node getNext() {
		return next;
	}
	
	public void setNext(Node n) {
		this.next = n;
	}
	
	public T getData() {
		return data;
	}
}
