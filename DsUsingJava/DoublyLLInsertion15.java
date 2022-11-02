import java.util.Scanner;

public class DoublyLLInsertion15 {
	
	static class Node{
		int data;
		Node next;
		Node prev;
		Node(int data){
			this.data  = data;
			this.next = null;
			this.prev = null;
		}
	}
	Node head  = null;
	Node tail = null;
	public void creation() {
		int data,n,m,p;
		Scanner sc  = new Scanner(System.in);
		do
		{
		System.out.println("Enter the data:");
		data =sc.nextInt();
		Node new_node  = new Node(data);
		if(head == null) {
			head  = new_node;
			tail =new_node;
		}else {
			System.out.println("Add bigning press 1, add last press 2, add specific press 3:");
			 m = sc.nextInt();
			 switch(m) {
			 case 1:
				 new_node.next = head;
				 head.prev = new_node;
				 head  = new_node;
				 break;
		  
			 case 2:
				 Node temp = head;
				 tail.next = new_node;
				 new_node.prev = tail;
				 tail = new_node;
				 break;
				 
			 case 3:
				 System.out.println("Enter the specific position:");
				 p = sc.nextInt();
				 Node temp1  = head;
				 Node ptr  = temp1.next;
				 for(int i=1;i<(p-1);i++) {
					 temp1=ptr;
					 ptr  = ptr.next;
					 
				 }
				 new_node.prev  = temp1;
				 new_node.next = ptr;
				 temp1.next = new_node;
				 ptr.prev = new_node;
				 break;
			 }
		}
		System.out.println("if u want add more data press 1:");
		n =sc.nextInt();
		
		}
		while(n==1);
		
		
	}
	
	
	public void traverse() {
		if(head==null) {
			System.out.println("dll is empty:");
		}else {
			Node temp = head;
			while(temp!=null) {
				System.out.println(temp.data);
				temp = temp.next;
			}
		}
		
	}

	public static void main(String[] args) {
		DoublyLLInsertion15 s  = new DoublyLLInsertion15();
		s.creation();
		s.traverse();

	}

}
