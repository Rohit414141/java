import java.util.ArrayList;
import java.util.Iterator;



public class DemoArrayList4 {
	
//	public String toString() { // koi bhi class object banane par refrance id janerate hota he bo Object class ka toString method banata he ;
//		return "ro";
//	}
	
	// Arraylist me three type of constructer 1. 10 size of 1st constructer 2.is userlimit size 3.

	public static void main(String[] args) {
		
//		 DemoArrayList a = new  DemoArrayList();
//		 System.out.println(a);
		 
		 
//		 ArrayList arraylist = new ArrayList();// 1st constructer 
//		 System.out.println(arraylist);//[ ]
//		 arraylist.add("rohit");
//		 arraylist.add("hello"); 
//		 arraylist.add("hello");
//		 arraylist.add(10);
//		 arraylist.add(10.5);
//		 arraylist.add(10);
//		 arraylist.add(12);
//		 arraylist.add(36);
//		 
//		 System.out.println(arraylist);
		 
		// ArrayList arraylist1 = new ArrayList(2);// 2nd constructer
		
		
		 ArrayList arraylist = new ArrayList();// array list ki initial capacity 10 hoti he 
		 System.out.println(arraylist.isEmpty());
		 
		 System.out.println(arraylist);
		 System.out.println(arraylist.size());// 0
		 arraylist.add("rohit");
		 arraylist.add("hello"); 
		 arraylist.add("hello");
		 arraylist.add(10);
		 arraylist.add(10.5);
		 arraylist.add(10);
		 arraylist.add(12);
		 arraylist.add(36);
		 System.out.println(arraylist);
		 
		 ArrayList arraylist2 = new ArrayList(arraylist);// 3rd constructer
		 arraylist2.add("hi");
		 arraylist2.add("bye");
		 System.out.println(arraylist2);
		 arraylist2.add(3,100);// add method me shifting hoti he 
		 System.out.println(arraylist2);
		 arraylist2.set(3, 113);
		 System.out.println(arraylist2);// set method me shifting nhi hoti he direct value ko hta ke add karta he 
		 System.out.println(arraylist2.isEmpty());//false 
		 System.out.println(arraylist2.size()); // 11
		 System.out.println(arraylist2.contains("rohit"));//true
		 System.out.println(arraylist2.get(4));
		 System.out.println();
		 // index bta de data print kra dega 
//		 arraylist2.removeAll(arraylist);// common data ko delete kar dega 
//		 System.out.println(arraylist2);
		 
//		arraylist2.retainAll(arraylist);//common data ko delete nhi  karega baki sab print kar  dega 
//		System.out.println(arraylist2);
		 
		// System.out.println(arraylist2.remove(0));
		 
		 // arralist se data nikalana
		 //for loop,for each loop,iterator,list iterator,enumiration
		 
		 // Using forloop
		
		 
//		 for(int i=0;i<arraylist2.size();i++) {
//			 System.out.println(arraylist2.get(i));
//		 }
		
		 // using forEachloop
//		 for(Object i:arraylist2) {
//			 System.out.println(i);
//		 }
		   
		 // using Iterator
		Iterator u = arraylist2.iterator();
	while (u.hasNext()) {
		Object object = (Object) u.next();
		System.out.println(object);
		
	}
		
		 
		 
		 

	}

}
