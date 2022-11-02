
public class CollectionEx9 {

	public static void main(String[] args) {
		java.util.HashSet a = new java.util.HashSet();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(20);
		a.add("rohit");
		a.add("ham");
		System.out.println(a);
		java.util.Iterator i = a.iterator();
		while(i.hasNext()) {
			Object o = i.next();
			System.out.println(o);
			
		}
	}

}
