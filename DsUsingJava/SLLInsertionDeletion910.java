import java.util.Scanner;

// Linked List is a non contigues memory location
//Linked list do not define size of arryas
// singly linked list me agar data last me add karna hota tha or next next karke jana padta tha esse time complexity big(n) lagti thi.
//yhi draw back he singly linked list
// esi se aaya circular linked list
// back word traverse nhi kar sakte he single linked list or circular linked list me only forword allow


/*public class SLLInsertionDeletion910 {
	
	static class Node{
		int data;
		 Node next;
		 Node(int data){
			 this.data= data;
			 this.next = null;
			 
		 }
		
	}
	Node head  = null;// pointer start
	
	public void creation() {
		int data,n,m,p;
		Scanner sc  = new Scanner(System.in);
		do {
			
		
		System.out.println("Enter data:");
		data  = sc.nextInt();
		Node new_node  = new Node(data);
		if(head==null)
		{
			head = new_node;
		}else {
			System.out.println("Enter 1 insert at beginning,enter 2 insert the end ,enter 3 insert the specific position");
			m = sc.nextInt();
			switch(m) {
			
			case 1:
				new_node.next = head;
				head  = new_node;
				break;
				
			case 2:
				Node temp = head;
				while(temp.next!=null)
				{
					temp = temp.next;
				}
				temp.next = new_node;
				break;
				
			case 3:
				System.out.println("Enter the position of node to be inserted:");
				p = sc.nextInt();
				Node temp1 = head;
				for(int i=0;i<(p-1);i++) {
					temp1 = temp1.next;
					
				}
				new_node.next = temp1.next;
				temp1.next = new_node;
				break;
			}
		}
		System.out.println("do you want to add more element if yes press 1:");
		n  =sc.nextInt();
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
				break;
				
			case 2:
				Node temp1  = head;
				Node ptr  = temp1.next;
				while(ptr.next!=null) {
					temp1=ptr;
					ptr = ptr.next;
				}
				temp1.next = null;
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
		Node temp  = head;
		if(head==null) {
			System.out.println("LL does not exist:");
		}else {
			while(temp!=null) {
				System.out.print(temp.data+" ");
			//	System.out.println(temp.next);//print address
				
				temp = temp.next;
			}
			
		}
		
		
	}

public static void main(String[] args) {
	
	SLLInsertionDeletion910 ll = new SLLInsertionDeletion910();
	ll.creation();
	ll.delete();
	ll.traverse();
	}
}
*/





