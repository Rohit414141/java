import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class Collection29 {
	public static void main(String[] args) {
		/*Queue<Integer> c  = new LinkedList<Integer>();
		c.offer(10);
		c.offer(20);
		c.offer(30);
		c.offer(60);
		c.offer(100);
		
		System.out.println(c.peek());//10// show the data top of level
		System.out.println(c);//[10,20,30,60,100]
		c.poll();// delete the data first position
		System.out.println(c);//[20,30,60,100]
		*/
		
	/*//Queue<Integer> c  = new PriorityQueue<Integer>();// priority queue show the data min
		Queue<Integer> c  = new PriorityQueue<Integer>(Comparator.reverseOrder());// priority queue show the data max
		c.offer(40);
		c.offer(30);
		c.offer(60);
		c.offer(15);
		c.offer(100);
		System.out.println(c);
		c.poll();
		System.out.println(c);//[15] deleted
		
		*/
		
		/*Set<Integer> c  =new HashSet<Integer>();
		c.add(10);//no allow duplicate and no allow indexing
		c.add(50);
		c.add(30);
		c.add(100);
		c.add(10);
		c.remove(30);//remove method se sidhe valye delete hoti he 
		System.out.println(c);
		
//		int d  = c.size();
//		System.out.println(d);
		
	
		//System.out.println(c.contains(120));// contains method use present data this list or not
		
		*/
		
		/*Set<Integer> c = new LinkedHashSet<Integer>();
		c.add(20);//Linked Hash Set me data ek dusre se link rehta he 
		c.add(10);//hash set me data link nhi rehta he
		c.add(60);
		c.add(100);
		c.add(50);
		System.out.println(c);
		//c.remove(10);
		//int d  = c.size();
		//System.out.println(d);
		*/
		
		/*Set<Integer> c  = new TreeSet<Integer>();
		c.add(50);
		c.add(10);
		c.add(40);
		c.add(60);
		c.add(35);
		System.out.println(c);// use to sorted the data
		
		*/
		
		// map interface 
		
	}

}
