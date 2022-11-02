import java.util.Scanner;

/* stack usign linked list me insertion and deletion begininning me hi hota he
    esme OverFlow condition hoti nhi he only underflow condition hoti he  */

/*class Stack1{
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data  = data;
			this.next = null;
		}

	}
	Node top = null;

	
	
	void push() {
		int data;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the data:");
		data  = sc.nextInt();
		Node new_node  = new Node(data); 
		if(top==null) {
			top = new_node;
			
		}else {
			new_node.next  = top;
			top  = new_node;
		}
		
		
	}
	
	void pop() {
		if(top==null) {
			System.out.println("Satck is empty:");
		}else {
			top = top.next;
		}
		
	}
	
	void display() {
		Node temp = top;
		while(temp!=null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		
		
	}
}
public class StackUsingLinkedList20 {
	public static void main(String[] args) {
		int d,l;
		Scanner sc  = new Scanner(System.in);
		Stack1 s  = new  Stack1();
		do {
			System.out.println("Press 1: Push");
			System.out.println("Press 2: Pop");
			System.out.println("Press 3:display");
			System.out.println("Enter your choice");
			d  =sc.nextInt();
			switch(d) {
			case 1:
				s.push();
				break;
			case 2:
				s.pop();
				break;
			case 3:
				s.display();
				break;
			}
			System.out.println("press 0 go to back main menu:");
			System.out.println("Enter any key exit this loop");
			l = sc.nextInt();
		}
		while(l==0);
		System.out.println("exit successfully:");
		
		
		
	}

}
*/


