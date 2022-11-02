class CollectionEx7{
	public static void main(String s[]) {
		java.util.Vector a = new java.util.Vector();
		a.add(10);
		a.add(20);
		a.add("rohit");
		a.add("ham");
		a.add(10);
		a.add(20);
		a.add(50);
		a.add("ham");
		System.out.println(a);
		java.util.ListIterator li = a.listIterator();
		System.out.println(li.next());
		System.out.println(li.next());
		System.out.println(li.next());
		System.out.println(li.previous());
		System.out.println(li.previous());
		System.out.println(li.previous());
		
	}
}
