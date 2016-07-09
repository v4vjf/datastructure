package stack;

public class DynamicArrayStack {
	protected int length;//length of the stack array
	protected int capacity;//capacity of the stack array
	protected static final int MINCAPACITY = 1<<15; //min capacity of the stack array
	protected static int CAPACITY = 16; //default capaci
	private int[] stack;
	private int top = -1;
	public DynamicArrayStack(){//constructor using default capacity
		this(CAPACITY);
		length = CAPACITY;
	}
	public DynamicArrayStack(int cap){//constructor with specified capacity
		length = cap;
		capacity = cap;
		stack = new int[capacity];
	}
	public void push(int element){//push element to the stack
		if(!isFull()){
			top++;
			stack[top] = element;
		}
		else{
			expand();
			stack[++top] = element;
		}
	}
	private void expand(){//expand the length of the stack containing array
		length = size();
		int [] arr = new int[length<<1];
		System.arraycopy(stack, 0, arr, 0, length);
		length = length<<1;
		stack = arr;
	}
	public int size(){//return the size of the stack
		return (top + 1);
	}
	protected boolean isFull(){//check whether the stack is full
		if(size() == capacity)
			return true;
		else
			return false;
	}
	public int pop()throws Exception{//pop function throws exception if the stack is empty
		if(size() == 0)
			throw new Exception("stack is empty");
		int temp = stack[top];
		stack[top] = Integer.MIN_VALUE;
		top--;
		return temp;
			
	}
	protected boolean isEmpty(){//check whether the stack is empty
		if(size() == 0)
			return true;
		return false;
	}
	protected void shrink(){//shrink the size of stack containing array
		if(length <=MINCAPACITY || (top+1)<<2 >= length)//if the current array is lesser than the MINCAPACITY or if the array is one-fourth filled
			return;
		System.out.println("shrinking");
		length = (top+1)<<1;//array size is changed to twice the current size i.e., with half filled 
		int[] arr = new int[length];
		System.arraycopy(stack, 0, arr, 0, length);
		stack = arr;
	}
	public int top() throws Exception{//returns the top element of the stack
		if(isEmpty())
			throw new Exception("stack is empty");
		return stack[top];
	}
	public String toString(){//returns the string equivalent of the stack
		String string = "[";
		if(size()>0)
			string = string + stack[0];
		if(size()>1){
			for(int temp = 1; temp <=top; temp++)
				string = string + "," + stack[temp];
		}
		string = string + "]";
		return string;
	}
	
	
	
}
