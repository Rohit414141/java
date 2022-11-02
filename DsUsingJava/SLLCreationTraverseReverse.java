import java.util.Scanner;
// Linked List is a non contigues memory location
//Linked list do not define size of arryas

public class SLLCreationTraverseReverse{
	
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
		int data,n;
		Scanner sc  = new Scanner(System.in);
		do {
			System.out.println("Enter data:");
		data  = sc.nextInt();
	    	Node new_node  = new Node(data);
		if(head==null)
		{
			head = new_node;
		}else {
			new_node.next = head;
			head  = new_node;
		}
		System.out.println("do you want to add more element if yes press 1:");
		n  =sc.nextInt();
	}
		while(n==1);
	}
      
	public void traverse() {
		int c = 0;
		Node temp  = head;
		if(head==null) {
			System.out.println("LL does not exist:");
		}else {
			while(temp!=null) {
				c++;
				System.out.print(temp.data+" ");
			//	System.out.println(temp.next);//print address
				
				temp = temp.next;
			}
		
			System.out.println("count = "+c);
			}
		}
	public void reverse(Node temp) {
		
		if(head==null) {
			System.out.println("ll is empty:");
			return;
		}else {
			if(temp.next==null) {
				System.out.println(temp.data);
				return;
			}
			
			
			reverse(temp.next);
			System.out.println(temp.data);
		}
	}
	
	
	
	
	
public static void main(String[] args) {
SLLCreationTraverseReverse ll = new SLLCreationTraverseReverse();
	ll.creation();
	//ll.traverse();
	ll.reverse(ll.head);
	}
}

