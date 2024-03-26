package westview.ds;

public class LinkedList {
	
	// A LinkedList has a head reference
	//which refers to the 1st Node in the list
	private Node head;
	
	// A LinkedList has a size which is the #
	//of nodes in the list
	private int size;
	
	// Add a default constructor
	public LinkedList() {
		this.head = null;
		this.size = 0;
	}
	
	// Getters/setters

	public Node getHead() {
		return this.head;
	}

	//add method which adds a Node to the LinkedList
	//must be done recursively
    // Recursive add method to add a Node to the LinkedList
    public void add(Node el) {
        if (head == null) {
            head = el;  
        } else {
        	Node curr = head;
        	while(curr.getNext() != null) {
        		curr = curr.getNext();
        	}
        	curr.setNext(el);
        }
        size++;  
    }
	
	// Get method at a given index which returns the
	//node at the index if the index is valid
	//null otherwise
    public Node get(int index) {
    	if(index < 0 || index >= size) {
    		return null;
    	}
    	Node curr = head;
    	for(int i = 0; i < index; i++) {
    		curr = curr.getNext();
    	}
    	return curr;
    }
	
	// Add a size method which returns the size of the
	//LinkedList
	public int getSize() {
		return this.size;
	}
}
