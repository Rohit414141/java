import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionsClass {

	public static void main(String[] args) {
     List<Integer> list  = new ArrayList<Integer>();
     list.add(10);
     list.add(15);
     list.add(12);
     list.add(25);
     list.add(190);
     list.add(35);
     list.add(15);
     
     System.out.println(list);
     System.out.println("min="+Collections.min(list));
     System.out.println("max="+Collections.max(list));
     Collections.sort(list);
     System.out.println("sort="+list);
     
     System.out.println(Collections.frequency(list, 15));
     
     Collections.sort(list, Comparator.reverseOrder());
     System.out.println(list);
	}

}
