package westview.ds;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesterQueue2 {

	@Test
	void test() {
//		Stack<Integer> myStack = new Stack<Integer>();
		Queue2<Integer> a = new Queue2<Integer>();
		Stack<Integer> b = new Stack<Integer>();
//		Queue2<Integer> b = new Queue2<Integer>();
		
		assert(a.size()==0);
		assert(a.dequeue()==null);
		assert(a.peek()==null);
		
		a.enqueue(1);
		a.enqueue(2);
		
		assert(a.size()==2);
		
		a.dequeue();
		
		assert(a.size()==1);
	}

}
