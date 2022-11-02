import java.util.Scanner;

//Circular linkedlist me time complexity big(1)
//esme backword me nhi ja sakte he 
public class Circular_LL11 {
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data  = data;
			this.next = null;
			
		}
	}
	Node head =null;
	Node tail = null;
	public void creation() {
		int data,n;
		Scanner sc  = new Scanner(System.in);
		do
		{
		System.out.println("Enter the data:");
		data  = sc.nextInt();
		Node new_node = new Node(data);
		if(head==null) {
			head=new_node;
			tail  = new_node;
			new_node.next  = head; //ye relation assign karta he head and tail me
		}else {
			new_node.next  =head;
			head = new_node;
			tail.next = head;
		}
		System.out.println("Add the more elements press :1");
		n = sc.nextInt();
		}
		while(n==1);
		
		 }
	public void traverse() {
		Node temp = head;
		if(head==null) {
			System.out.println("ll empty:");
		}else {
			do {
				System.out.println(temp.data);
				temp = temp.next;
			}while(temp!=head);
		}
		
	}
	public static void main(String[] args) {
		Circular_LL11 s = new Circular_LL11();
		s.creation();
		s.traverse();
		
	}

}
