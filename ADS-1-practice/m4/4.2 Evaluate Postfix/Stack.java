import java.util.Arrays;
public class Stack {
	private int[] myStack;
	private int pointer;
	public Stack() {
		myStack = new int[10];
		pointer = -1;
	}
	public int pop() {
		if (pointer == -1) {
			System.out.println("No items to pop");
		}
		return myStack[pointer--];
	}
	public void push(int num) {
		if (pointer == myStack.length - 1) {
			resize();
		} else {
			myStack[++pointer] = num;
		}
	}
	public void resize() {
		myStack = Arrays.copyOf(myStack, pointer * 2);
	}
}