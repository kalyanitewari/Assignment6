package Part1;
public class Fixed_stk implements Interface_STK{
	
	private int stack[]= new int[5];
	private int top;
	
	public Fixed_stk(int[] stack, int top) {
		super();
		this.stack = stack;
		this.top = top;
	}
	
	@Override
	public void push(int element)
	{
		if(isOverflow())
			System.out.println("Stack is full!");
		else 
		{
			top++;
			stack[top]= element;
		}

	}


	public int pop() {
		if(isUnderflow()) {
			System.out.println("Stack is empty!");
		return 0;}
		else 
			return stack[top--];
	}
		
	
	public void displayStack() {
		if(isUnderflow()) 
			System.out.println("Stack is empty!");
			else
				for(int i= 0; i<=top; i++)
				{
					System.out.println(stack[i]);
				}
	}
	
	public boolean isOverflow() {
		if (top==(stack.length-1))
			return true;
		else
		return false;
	}
	
	public boolean isUnderflow() {
		if (top==-1)
			return true;
		else
		return false;
	}
	}
	
