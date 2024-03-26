package westview.ds;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesterQueue {

	@Test
	void test() {
		Queue<Integer> myQueue = new Queue<Integer>();
		
		assert(myQueue.size()==0);
		assert(myQueue.dequeue()==null);
		assert(myQueue.peek()==null);
		
		myQueue.enqueue(5);
		myQueue.enqueue(21);
		
		assert(myQueue.size()==2);
		assert(myQueue.peek()==21);
		assert(myQueue.dequeue()==21);
		assert(myQueue.size()==1);
		assert(myQueue.peek()==5);
	}

}
