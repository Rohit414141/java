import java.util.Scanner;

public class DoublyLLInsertionDeletion16 {
	
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
	
	public void delete() {
		int data,n,m,p;
		Scanner sc  = new Scanner(System.in);
		do {
			
		if(head==null)
		{
			System.out.println("ll is empty");
		}else {
			System.out.println("Enter 1 delete at beginning,enter 2 delete the end ,enter 3 delete the specific position");
			m = sc.nextInt();
			switch(m) {
			
			case 1:
				Node temp = head;
				temp = temp.next;
				head = temp;
				head.prev = null;
				break;
				
			case 2:
				Node temp1  = tail;
				temp1  =temp1.prev;
				temp1.next = null;
				break;
				
				
			case 3:
				System.out.println("Enter the position of node to be delete:");
				p = sc.nextInt();
				Node temp2  = head;
				Node ptr1 = temp2.next;
				for(int i=0;i<p-1;i++) {
					temp2  = ptr1;
					ptr1  = ptr1.next;
				}
				temp2.next = ptr1.next;
				ptr1.next.prev=temp2 ;
				
				break;
			}
		}
		System.out.println("do you want to add more element if yes press 1:");
		n  =sc.nextInt();
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
		DoublyLLInsertionDeletion16 s  = new DoublyLLInsertionDeletion16();
		s.creation();
		s.delete();
		s.traverse();

	}

}
