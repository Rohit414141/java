
public class CollectionEx5 {

	public static void main(String[] args) {
		java.util.LinkedList a = new java.util.LinkedList ();
		a.addFirst(10);
		a.addFirst(20);
		a.addFirst(30);
		a.addFirst(50);
		a.addFirst("rohit");
		a.addFirst(10.500);
		a.addFirst(true);
		a.addFirst(20);
		System.out.println(a);
		
		a = new java.util.LinkedList();
		a.addLast(10);
		a.addLast(20);
		a.addLast(50);
		a.addLast(10);
		a.addLast(100);
		System.out.println(a);
		
		a = new java.util.LinkedList();
		a.addFirst(500);
		a.addLast("rohit");
		a.addFirst(501);
		a.addLast("kumar");
		a.addFirst(502);
		a.addLast("lakkhe");
		System.out.println(a);
		
		a  = new java.util.LinkedList();
		a.addFirst(10);
		a.addFirst(20);
		a.addLast("Rohit");
		a.addLast("Kumar");
		a.addFirst("Ham");
		System.out.println(a);
		

	}

}
