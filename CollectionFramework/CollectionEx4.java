class CollectionEx4{
	public static void main(String s[]) {
		java.util.ArrayList a = new java.util.ArrayList();
		//java.util.Vector a = new java.util.Vector();
		a.add(10);
		a.add(20);
		a.add("rohit");
		a.add("ham");
		a.add(10.20);
		a.add("rohit");
		System.out.println(a);
		for(Object o:a) {
			System.out.println(o);
		}
	}
}