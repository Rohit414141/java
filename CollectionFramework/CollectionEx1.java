import java.util.*;;

/* Array list me duplicate bhi hote he aur indexing bhi hoti he aur hashset me duplicate nhi hote he aur na hi indexing 
 * hoti he agar hash set me value delete karni  he to direct value hi apss krege */
 
public class CollectionEx1 {
	public static void main(String s[]) {
		java.util.ArrayList a = new java.util.ArrayList();
		//java.util.HashSet a = new java.util.HashSet();
		a.add(10);
		a.add("rohit");
		a.add(20);
		a.add("rohit");
		a.add("ham");
		a.add(2.5);
		a.remove(5);
		a.add(true);
		a.add("ham");
		
		
		System.out.println(a);
		//a.size();// no
//		int b  =a.size();
//		System.out.println(b);
		
//		a.set(0, 500);
//		System.out.println(a);
		
		
				
	}
	

}
