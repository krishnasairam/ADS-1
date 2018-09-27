import java.util.Arrays;
public class Stack {
	private String[] myStack;
	private int pointer;
	public Stack() {
		myStack = new String[10];
		pointer = 0;
	}
	public String pop() {
		if (pointer == 0) {
			System.out.println("No items to pop");
		}
		return myStack[--pointer];
	}
	public void push(String num) {
		if (pointer == myStack.length - 1) {
			resize();
		}
		myStack[pointer++] = num;

	}
	public void resize() {
		myStack = Arrays.copyOf(myStack, myStack.length * 2);
	}
}