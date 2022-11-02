
public class CollectionEx3 {

	public static void main(String[] args) {
//		java.util.ArrayList a = new java.util.ArrayList();
//		a.add(1);
//		a.add(12);
//		a.add(10);
//		a.add("rohit");
//		a.add(12.5);
//		a.add(true);
//		a.add("ham");
//		System.out.println(a);
//		a.remove(1);
//		System.out.println(a);
//		a.remove((Object)"rohit");
//		System.out.println(a);
		
		java.util.HashSet a = new java.util.HashSet();
		a.add(10);
		a.add(20);
		a.add(10);
		a.add("rohit");
		a.add(12.5);
		a.add(true);
		a.add("ham");
		System.out.println(a);
		a.remove(1);
		System.out.println(a);
		a.remove((Object)"rohit");
		System.out.println(a);

	}

}
