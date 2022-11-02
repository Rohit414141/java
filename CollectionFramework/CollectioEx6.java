class CollectioEx6{
	public static void main(String s[]) {
		java.util.Vector a = new java.util.Vector();
		a.add(10);
		a.add(20);
		a.add(20);
		a.add("roit");
		a.add(50);
		a.add("ham");
		System.out.println(a);
		java.util.Iterator i = a.iterator();
		while(i.hasNext()) {
			Object o = i.next();
			System.out.println(o);
		}
		
	}
}