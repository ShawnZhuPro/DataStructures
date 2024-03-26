package westview.ds;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesterStack {

	@Test
	void test() {
		Stack<Integer> myStack = new Stack<Integer>();
		
		// An empty stack should return a size 0
		assert(myStack.size()==0);
		
		// Try to pop
		assert(myStack.pop()==null);
		
		// Peek
		assert(myStack.peek()==null);
		
		// Push
		myStack.push(7);
		myStack.push(11);
		
		assert(myStack.size()==2);
		assert(myStack.peek()==11);
		// Destructive testing
		assert(myStack.pop()==11);
		assert(myStack.size()==1);
		assert(myStack.peek()==7);
	}

}
