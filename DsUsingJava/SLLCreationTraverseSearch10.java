import java.util.Scanner;
// Linked List is a non contigues memory location
//Linked list do not define size of arryas

 /*public class SLLCreationTraverseSearch10 {
	
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
			System.out.println();
			System.out.println("count = "+c);
			}
		}
	
	public void search(int data) {
		
		Node temp = head;
		int i = 1;
		boolean flag  = false;
		if(head==null) {
			System.out.println("ll is empty:");
		}else {
			while(temp!=null) {
				if(temp.data  == data) {
					flag  = true;
					break;
				}
				i++;
				temp = temp.next;
			}
		}
		if(flag) {
			System.out.println("elements is present posiotn"+i);
		}else {
			System.out.println("does not present");
		}
	}
public static void main(String[] args) {
	SLLCreationTraverseSearch10 a  = new SLLCreationTraverseSearch10();
	a.creation();
	a.traverse();
	a.search(7);
	
	
	}
}
*/

