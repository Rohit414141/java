import java.util.Stack;

public class LearnStack {

	public static void main(String[] args) {
		
		/*Stack present in 3 function push,pop,peek push add element pop delete element,peek ckeck the value top of this stack */
      // stack is LIFO data structure
		Stack<String> animals  = new Stack<String>();
		 animals.push("Donkey");
		 animals.push("monkey");
		 animals.push("lion");
		 animals.push("cat");  
		 
		 System.out.println("Stack : "+ animals);
		 System.out.println(animals.peek());// peek get element top of this stack//cat
		 animals.pop();
		 System.out.println(animals.peek());//lion
		 
		 
	}

}
