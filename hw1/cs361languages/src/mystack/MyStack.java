/**
 * 
 */
package cs361languages.src.mystack;

/**
 * @author Pride Y.
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack = null;

	/**
	 * 
	 */
	public MyStack() { }

	public T pop() {
		// TODO To complete
		T re = null;
		MyNode<T> next = this.theStack;
		while (next.next != null) {
			if (next.next.next == null) {
				re = next.next.val;
				next.next = null;
				break;
			}
			next = next.next;
		}
		return re;
	}

	public void push(T v) {
		// TODO To complete
		if (this.theStack == null) {
			this.theStack = new MyNode<>(v, null);
		} else {
			this.theStack.next = new MyNode<>(v, null);
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO To complete
		// Create a stack of Integer
		MyStack<Integer> stack = new MyStack<>();
		// Push 1 and 2
		stack.push(1);
		stack.push(2);
		// Pop
		System.out.println(stack.pop());
		// Push 5
		stack.push(5);
		
		// TODO To complete
		// Create a stack of Person
		MyStack<Person> pStack = new MyStack<>();
		// Push a person p1 with your name
		pStack.push(new Person("Pride", "Yin"));
		// Push a person p2 with my name
		pStack.push(new Person("Christelle", "Scharff"));
	}

}
