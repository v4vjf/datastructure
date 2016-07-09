package stack;

public class StackImplementation {
	
	public static void main(String[] args){
		ListStack stack = new ListStack();
		stack.push(0);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println(stack.peek());
		System.out.println(stack.size());
		stack.pop();
		System.out.println(stack);
		stack.pop();System.out.println(stack);stack.pop();System.out.println(stack);stack.pop();stack.pop();stack.pop();stack.pop();

		
		
	}
	
}
