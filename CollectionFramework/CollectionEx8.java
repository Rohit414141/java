
public class CollectionEx8 {

	public static void main(String[] args) {
		java.util.Vector a = new java.util.Vector();
		a.add(10);
		a.add(20);
		a.add("rohit");
		a.add(500);
		a.add("kumar");
		System.out.println(a);
		java.util.Enumeration e = a.elements();
		while(e.hasMoreElements()) {
			Object  o = e.nextElement();
			System.out.println(o);
			
		}
		}

}
