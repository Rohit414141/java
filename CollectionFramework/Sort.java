import java.util.ArrayList;
import java.util.Collections;

public class Sort {

	public static void main(String[] args) {
     ArrayList<Integer> a  = new ArrayList<Integer>();
     a.add(10);
     a.add(30);
     a.add(20);
     a.add(10);
     a.add(50); 
     a.add(5);
     System.out.println(a);
     
     Collections.sort(a);
     System.out.println(a);
	}

}
