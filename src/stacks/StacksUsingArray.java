package stacks;

public class StacksUsingArray {
  
	private int data[];
	private int top;
	
	public StacksUsingArray(){
		data =  new int[10];
		top = -1;
	}
	
	
	public int size() {
		return top+1;
	}
	
	public boolean isEmpty() {
		return top ==-1;
	}
	
	public void push(int e) {
		if(top==data.length-1)
			System.out.print("Stack overflow");
		
		else
			data[++top] = e;
	}
	
	
	public int top() {
		if(top == -1)
			return -1;
		
		else
			return data[top];
		
	}
	
	public int pop() {
		if(top == -1)
			return -1;
		else
		{
			int temp =  data[top];
		    top --;
		    return temp;
		}
	}
}
