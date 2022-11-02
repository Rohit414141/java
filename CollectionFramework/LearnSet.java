import java.util.*;
import java.util.Set;

public class LearnSet {

	public static void main(String[] args) {
    // Set<Integer> set  = new HashSet<Integer>();//no duplicate no indexing random
     //Set<Integer> set  = new LinkedHashSet<Integer>();//value me value link rehti he 
     Set<Integer> set  = new TreeSet<Integer>();// ye sorted form me rehta he 
     set.add(32);
     set.add(10);
     set.add(30);
     set.add(50);
     set.add(45);
     set.add(50);
      System.out.println(set);
      
      set.remove(45);
      System.out.println(set);
	}

}
