import java.util.Scanner;
class queue1{
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data  =data;
			this.next = null;
		}
	}
	Node f   = null;
	Node r  = null;
	
	void enqueue() {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the data:");
		int data  = sc.nextInt();
		Node new_node  = new Node(data);
		if(f==null) {
			f  = new_node;
			r = new_node;
		}else {
			r.next = new_node;
			r   = new_node;
		}
	
		
	}
	
	void dequeue() {
		if(f==null) {
			System.out.println("Underflow condition");
		}else {
			f  = f.next;
		}
		
	}
	
	void display() {
		Node temp = f;
		while(temp!=null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		
	}
	
	
	
}

public class QueueUsingLinkedList25 {
	public static void main(String[] args) {
		queue1 s1  = new queue1();
		int d,l;
		Scanner sc  = new Scanner(System.in);
		do
		{
			System.out.println("press 1:enqueue");
			System.out.println("press 2:dequeue");
			System.out.println("press 3: display");
			System.out.println("choice any key:");
			
			d  = sc.nextInt();
			switch(d) {
			
			case 1:
				s1.enqueue();
				break;
		  
			case 2:
				s1.dequeue();
				break;
				
			case 3:
				s1.display();
				break;
			}
			System.out.println("press 0 return main menu");
			System.out.println("press any key exit");
			l = sc.nextInt();
		}
		while(l==0);
		System.out.println("exit successfully:");
	}

}
