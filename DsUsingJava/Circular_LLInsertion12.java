import java.util.Scanner;


public class Circular_LLInsertion12 {
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
		Circular_LLInsertion12 ss  = new Circular_LLInsertion12();
		ss.creation();
		ss.traverse();
		
	}

}
