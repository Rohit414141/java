import java.util.*;
public class CollectionEx2 {

	public static void main(String[] args) {
	java.util.ArrayList a = new java.util.ArrayList();
	//java.util.HashSet a = new java.util.HashSet();
	a.add(10);
	a.add(20);
	a.add(10);
	a.add(30);
	a.add("rohit");
	a.add(12.50);
	a.add((Object)3);
	a.add("ham");
	a.add(true);
	//a.remove(3);// hash set me indexing nhi hoti he sidhe value remove hoti he aur no duplicate
	
	a.remove(3);
	for(Object o:a) {
	System.out.println(o);
	}
	
//loops
  //	for(int i=0;i<a.size();i++) {
  //		System.out.println(a.get(i));
  //	}
	

	

	}

}
