import java.util.Scanner;
//Linked List is a non contigues memory location
//Linked list do not define size of arryas
 public class SLLCreationTraverse9 {
	
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
		int max= 0;
		
		Node temp  = head;
		if(head==null) {
			System.out.println("LL does not exist:");
		}else {
			while(temp!=null) {
				if(temp.data>=max) {
					max  = temp.data;
				} 
				
				System.out.print(temp.data+" ");
			//	System.out.println(temp.next);//print address
				
				temp = temp.next;   
			}
			System.out.println();
			System.out.println("max="+max);
			}
		}
	
	
	public void m() { 
		
		
		Node temp  = head;
		int min = temp.data;
		if(head==null) {
			System.out.println("LL does not exist:");
		}else {
			while(temp!=null) {
				if(min>temp.data) {
					min  = temp.data;
				} 
				
				System.out.print(temp.data+" ");
			//	System.out.println(temp.next);//print address
				
				temp = temp.next;   
			}
			System.out.println();
			System.out.println("min="+min);
			}
		}
public static void main(String[] args) {
SLLCreationTraverse9 ll = new SLLCreationTraverse9();
	ll.creation();
	ll.traverse();
	ll.m();
	}
}

