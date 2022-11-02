import java.util.Scanner;


public class CircularLL_Deletion {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data  = data;
			this.next = null;
		}
	}
	Node head  = null;
	Node tail = null;
	public void creation() {
	 int  data,n,m,p;
		Scanner sc  = new Scanner(System.in);
		do
		{
		 System.out.println("Enter the data data:");
		 data  = sc.nextInt();
		 Node new_node  = new Node(data);
		 if(head==null) {
			 head  = new_node;
			 tail = new_node;
			 new_node.next = head;
		 }else {
			 System.out.println("insert the bigning 1 ,  add last press 2 ,random position 3:");
			 m = sc.nextInt();
			 switch(m) {
			 case 1:
				 new_node.next = head;
				 head  = new_node;
				 tail.next = head;
				 break;
			
			 case 2:
				 tail.next = new_node;
				 tail = new_node;
				 new_node.next = head;
				 break;
			 case 3:
				 
				 System.out.println("Enter the specific position:");
				 p = sc.nextInt();
				 Node temp1 = head; 
				 for(int i=0;i<(p-1);i++) {
					 temp1  = temp1.next;
				 }
				 new_node.next = temp1.next;
				 temp1.next = new_node;
				 break;
				 
				 
			 
			 }
		 }
		
		 System.out.println("do u want more data press 1:");
		 n  = sc.nextInt();
		}while(n==1);
		
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
			   head  = temp;
			   tail.next = head;
				break;
				
			case 2:
				Node temp1  = head;
				Node ptr  = temp1.next;
				while(ptr.next!=head) {
					temp1=ptr;
					ptr = ptr.next;
				}
				temp1.next = head;
				tail = temp1;
				break;
				
				
			case 3:
				System.out.println("Enter the position of node to be delete:");
				p = sc.nextInt();
				Node temp2  = head;
				Node ptr1 = temp2.next;
				for(int i=0;i<p-2;i++) {
					temp2  = ptr1;
					ptr1  = ptr1.next;
				}
				temp2.next = ptr1.next;
				
				break;
			}
		}
		System.out.println("do you want to add more element if yes press 1:");
		n  =sc.nextInt();
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
		CircularLL_Deletion s  = new CircularLL_Deletion();
		s.creation();
		s.delete();
		s.traverse();
		
		
	}

}
