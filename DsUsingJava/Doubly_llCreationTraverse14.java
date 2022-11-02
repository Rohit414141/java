import java.util.Scanner;

public class Doubly_llCreationTraverse14 {
	
	static class Node{
		int data;
		Node next;
		Node prev;
		
		Node(int data){
			this.data = data;
			this.next = null;
			this.prev = null;
			
		}
	}
	Node head = null;
	Node tail = null;
	public void creation() {
		int data,n,m,p;
		Scanner sc  = new Scanner(System.in);
		do
		{
		System.out.println("Enter the data:");
		data  = sc.nextInt();
		Node new_node  = new Node(data);
		if(head == null) {
			head  = new_node;
			tail = new_node;
			
		}else {
			head.prev = new_node;
			new_node.next = head;
			head  = new_node;
			
		}
		System.out.println("do u want add more elements press 1:");
		n = sc.nextInt();
		}
		
		while(n==1);
		
	}
	
	public void traverse() {
		if(head==null) {
			System.out.println("ll not exist:");
		}else {
			Node temp = head;
			while(temp!=null) {
				System.out.println(temp.data);
				temp =temp.next;
			}
			
		}
		
		
	}

	public static void main(String[] args) {
		Doubly_llCreationTraverse14 s  = new Doubly_llCreationTraverse14();
		s.creation();
		s.traverse();

	}

}
