package Part1;
public class StackMain {
	public static void main(String[] args)
	{
		int stack[]= new int[5];
		int t=-1;
		
		Fixed_stk fixed_stk= new Fixed_stk(stack, t);
		
		fixed_stk.push(1);
		fixed_stk.push(2);
		fixed_stk.push(3);
		fixed_stk.push(4);
		
		System.out.println("Initial Fixed Stack:");
		fixed_stk.displayStack();
		
		fixed_stk.pop();
		fixed_stk.pop();
		fixed_stk.pop();
		
		System.out.println("Fixed Stack after popping three elements:");
		fixed_stk.displayStack();
		
		Growable_stk growableStack = new Growable_stk();
		
        growableStack.push(1);
        growableStack.push(2);
        growableStack.push(3);
        growableStack.push(4);

        System.out.println("\nInitial Growable Stack:");
        growableStack.displayStack();

        growableStack.pop();
        growableStack.pop();
        growableStack.pop();

        System.out.println("Growable Stack after popping three elements:");
        growableStack.displayStack();
	}

}
